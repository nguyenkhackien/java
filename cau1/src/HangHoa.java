public class HangHoa {
    public String MaHang;

    public String Ten;

    public double giaban;

    public HangHoa(){

    }

    public HangHoa(String MaHang,String Ten ,double giaban){
        this.MaHang=MaHang;
        this.Ten=Ten;
        this.giaban=giaban;
    }

    public void getInfo(){
        System.out.println(this.MaHang);
        System.out.println(this.Ten);
        System.out.println(this.giaban);
    }
}
