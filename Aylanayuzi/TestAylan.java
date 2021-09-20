package Aylanayuzi;

public class TestAylan {
    public static void main(String[] args) {

        try{
        Aylana obj=new Aylana(-5.0);
            System.out.println(obj.aylanayuzi());
        } catch (MinusException e) {
            System.out.println(e.printerror());
        }
    }
}
