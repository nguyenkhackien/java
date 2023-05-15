public class DienThoai extends HangHoa{
    public String NSX;
    public double dungluong;
    public String color;

    public DienThoai(){
        super();
    }

    public DienThoai(String NSX,double dungluong,String color){
        super();
        this.NSX=NSX;
        this.dungluong=dungluong;
        this.color=color;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(this.NSX);
        System.out.println(this.dungluong);
        System.out.println(this.color);
    }
}
