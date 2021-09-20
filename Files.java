import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws FileNotFoundException {
        File f1=new File("s.txt");
        Scanner input=new Scanner(f1);
        ArrayList<String> ism=new ArrayList<>();
        ArrayList<Integer> soni=new ArrayList<>();
        while (input.hasNext()){
            int n=input.nextInt();
            String m=input.next();
        if (!ism.contains(m)) {
                ism.add(m);
            }
            else {
                soni.add(n);
            }
        }

        for (int i = 0; i < soni.size(); i++) {
            System.out.println(soni.get(i));
        }
    }
}
