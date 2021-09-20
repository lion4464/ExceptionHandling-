package Rectangle;

import Section12_3.Mismatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args)   {
       try{
           Scanner input=new Scanner(System.in);
           int a=input.nextInt();
           Rectangle obj1=new Rectangle(a,2);
           System.out.println(obj1.Result());
       }
       catch (InputMismatchException | IllegalRectangle ex){
           IllegalRectangle k=new IllegalRectangle();
           System.out.println(k.printError());
       }
    }
}
