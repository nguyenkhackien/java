import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;
import java.util.logging.Handler;

public class PhilMeal {
    public static void main(String[] args) {
        int numOfChopstick = 5;
        int numOfPhil = 5;
        int [] philStatus = {0, 0, 0, 0, 0};
        boolean [] chopstickIsReady = {true, true, true, true, true};
        boolean [] philAte = {false, false, false, false, false};
        //status == 0 -> 0 chopstick
        //status == 1 -> 1 chopstick
        //status == 2 -> 2 chopstick & eating


        List<Semaphore> chopsticks = new ArrayList<>();
        for (int i = 0; i < numOfChopstick; i++) {
            chopsticks.add(i, new Semaphore(1));
        }

        List<Thread> philosophers = new ArrayList<>();
        for (int i = 0; i < numOfPhil; i++) {
            int finalI = i;
            philosophers.add(i, new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            if (chopstickIsReady[finalI] && chopstickIsReady[(finalI + 1) % numOfChopstick]) {
                                philStatus[finalI] = 0;

                                chopsticks.get(finalI).acquire();
                                philStatus[finalI]++;
                                chopstickIsReady[finalI] = false;

                                chopsticks.get((finalI + 1) % numOfChopstick).acquire();
                                philStatus[finalI]++;
                                chopstickIsReady[finalI+1] = false;

                                //System.out.println("Philosopher " + (finalI + 1) + " is EATING!");
                                philAte[finalI] = true;

                                chopsticks.get((finalI + 1) % numOfChopstick).release();
                                chopstickIsReady[(finalI + 1) % numOfChopstick] = true;
                                chopsticks.get(finalI).release();
                                chopstickIsReady[finalI] = true;
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }));
        }

        for (int i = 0; i < numOfPhil; i++) {
            philosophers.get(i).start();
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-----------UPDATE----------");
                for (int i = 0; i < numOfPhil; i++) {
                    switch (philStatus[i]) {
                        case 0: {
                            System.out.println("Philosopher " + (i + 1) + " has 0 chopstick");
                            break;
                        }
                        case 1: {
                            System.out.println("Philosopher " + (i + 1) + " has 1 chopstick");
                            break;
                        }
                        case 2: {
                            System.out.println("PHILOSOPHER " + (i + 1) + " IS EATING!");
                            break;
                        }
                    }
                }
                if (philAte[0] && philAte[1] && philAte[2] && philAte[3] && philAte[4]) {
                    System.out.println("ALL PHILOSOPHER ARE FED!!!");
                    philAte[0] = false;
                    philAte[1] = false;
                    philAte[2] = false;
                    philAte[3] = false;
                    philAte[4] = false;
                }
            }
        }, 0, 1);
    }
}


