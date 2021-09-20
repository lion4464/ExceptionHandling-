import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.NoSuchFileException;
import java.util.*;

public class Linking {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File Authers=new File("src/Authers.txt");
        File Books=new File("src/Books.txt");
        Scanner input=new Scanner(Authers);
        Scanner Console=new Scanner(System.in);
        System.out.println("Auther name: ");
        String autherName = Console.next();
        System.out.println("Count of books");
        int members= Console.nextInt();
        String[] allbooks=new String[members];
        for (int i = 0; i < allbooks.length; i++) {
            System.out.println("Enter the name of"+i+" books");
            allbooks[i] = Console.next();
            }
                int Authnum=CheckName(autherName, Authers);
     try(   PrintWriter out = new PrintWriter(Books);){
         for (int i = 0; i < allbooks.length; i++)
            out.println(Authnum+" "+allbooks[i]);

     }
        System.out.println("Process is Finished! :^)");

    }
    public static int CheckName(String autherName,File Auther) throws FileNotFoundException{
        Scanner in=new Scanner(Auther);
        PrintWriter out = new PrintWriter("src/Auther1.txt");
        boolean yoq=true;
        int i=1;
        while (in.hasNextLine()) {
            String borNames = in.nextLine();
            out.print(i+" ");
            out.println(borNames);
            if (!borNames.equals(autherName)) {
                yoq&=true;
            }
            else
                yoq&=false;
            i++;
        }
        if (yoq){
            out.print((i)+" ");
            out.println(autherName);
        }
           out.close();
    return i;
    }
}
