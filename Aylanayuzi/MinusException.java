package Aylanayuzi;

public class MinusException extends Exception{
    private double rad;
    public MinusException(double rad) {
    super("Xato kiritildi"+rad);
    this.rad=rad;
    }
    public String printerror(){
        return "Radiusni manfiy kiritdiz";
    }

}
