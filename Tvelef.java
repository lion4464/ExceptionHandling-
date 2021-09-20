import java.io.File;
import java.io.PrintWriter;


public class Tvelef {
    public static void main(String[] args) throws Exception{
        File f=new File("src/srcRootDirectory");
            if (!f.exists()){
                f.mkdir();
                System.out.println("you created 'srcRootDirectory' :) ");
            }
        for (int i =1; i <34 ; i++) {
            File f1=new File("src/srcRootDirectory/chapter"+i+"");
                 if (!f1.exists())
                            f1.mkdir();
                try(PrintWriter p=new PrintWriter(f1+"/salom.txt");){
                    p.print("Assalomu alaykum  '"+i+"- bobga Hush kelibsiz !!! :^)'");
                     }
            }

    }


}
