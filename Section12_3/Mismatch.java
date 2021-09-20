package Section12_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
           public static void main(String[] args) {
               System.out.println("Enter integer number between 1 to 12 ");
               Scanner input = new Scanner(System.in);
               int a=0;
               try {
                   a = input.nextInt();
                   findDayofmonth(a);
               } catch (InputMismatchException ex1) {
                   System.out.println("Not suitable");
                   input.nextLine();
               } catch (ArrayIndexOutOfBoundsException ex) {
                   System.out.println("Not suitable " + ex.getMessage());
               }
           }
        public static void findDayofmonth(int number){

            String[] months = {"January", "February", "March", "April",
                    "May", "June", "July", "August", "September", "October",
                    "November", "December"};
            int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (number>=12&&number<0){
                throw new ArrayIndexOutOfBoundsException("It cannot be more 12 than");
            }

            System.out.println(months[number]+" has "+dom[number]);

        }
    }
