package Section12_2;

import java.util.Scanner;

public class ArrayOutofBoundClass {
    public static void main(String[] args) {
        System.out.println("Engter number of month: ");
            Scanner input = new Scanner(System.in);
            while (true){
            try {
                findDayofmonth(input.nextInt());

            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Not suitable "+ex.getMessage());
            }
            }
        }
        public static void findDayofmonth(int number){

                String[] months = {"January", "February", "March", "April",
                        "May", "June", "July", "August", "September", "October",
                        "November", "December"};
                int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                if (number>=12){
                    throw new ArrayIndexOutOfBoundsException("It cannot be more 12 than");
                }
                System.out.println(months[number]+" has "+dom[number]);

        }
}