package Rectangle;

import Aylanayuzi.MinusException;

public class Rectangle {

    private int side1;
    private double side2;

    public Rectangle() {
    }

    public Rectangle(int side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public double yuza() throws IllegalRectangle{
        if (side1>0&&side2>0){
        return side1*side2;
        }
        else{
            throw new IllegalRectangle();}
    }


    public String Result() throws IllegalRectangle{
        if (side1>0&&side2>0){
            return "Rectangle created with specified sides {" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }else
        throw new IllegalRectangle();
    }
    public String toString()  {
             return "Rectangle created with specified sides {" +
             "side1=" + side1 +
             ", side2=" + side2 +
             '}';
    }
}