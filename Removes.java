import java.io.File;
import java.util.Scanner;

public class Removes {
    public static void main(String[] args) throws Exception{

        File f=new File("src/salom.txt");

        Scanner input=new Scanner(f);
        String[] str=new String[3];
        int i=0;
        while (input.hasNext()){

            String a=input.next();
            if (!a.equals("salom"))
                str[i]=a;
            i++;
        }
        for (int j = 0; j < str.length; j++) {
            System.out.println(str[j]);
        }


    }
}
