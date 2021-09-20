package WriteData;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException{
        PrintWriter p=new PrintWriter("src/Salom1/salom.txt");
        java.io.File file=new File("src/Salom1/salom.txt");
        if (file.exists()) {
            System.out.println("File already exist!");
            PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    output.println(i + ". Juft son");
                } else
                    output.println(i + ". Toq son");

            }output.close();
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
            for (int i = 0; i < 100; i++) {
               // if (output.hasNext()){

                }

                
            }
        }

    }

