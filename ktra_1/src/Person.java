import java.util.ArrayList;

public class Person {
    private String name;
    private String address;
    private java.util.List<Vehicle> vehicleList = new java.util.ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * xoa vehicle co so dang ky tuong ung.
     *
     * @param registrationNumber so dang ky
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle i : vehicleList) {
            if (i.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicleList.indexOf(i));
            }
        }
    }

    public String getVehiclesInfo() {
        String s = "";
        if (vehicleList.size() == 0) {
            s = s + this.name + " has no vehicle!\n";
        } else {
            s = s + this.name + " has:\n\n";
            for (Vehicle i : vehicleList) {
                s = s + i.getInfo();
            }
        }
        return s;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person p = new Person("Kien", "nghia huong");
//        Vehicle v1 = new Car("mec", "1", "A-1", p, 5);
//        Vehicle v2 = new MotorBike("honda", "A", "A-2", p, true);
//        p.addVehicle(v1);
//        p.addVehicle(v2);
        System.out.println(p.getVehiclesInfo());
    }
}
