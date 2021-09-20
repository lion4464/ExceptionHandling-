package Rectangle;

public class IllegalRectangle extends Exception{
    private double side1;
    private double side2;

    public IllegalRectangle() {
        super("Xatolik sodir bo'ldi!");
        this.side1=side1;
        this.side2=side2;
    }

    public String printError(){
        return "Tomonlar xato kiritildi, Rectangle not created";
    }
}
