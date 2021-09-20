package Aylanayuzi;

public class Aylana {
    private double radius;

    public Aylana(double radius) {
        this.radius = radius;
    }

    public double aylanayuzi() throws MinusException{
        if (radius>=0)
            return radius*radius*Math.PI;
        else
            throw new MinusException(radius);
    }


}
