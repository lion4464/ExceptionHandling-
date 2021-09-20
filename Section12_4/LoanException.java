package Section12_4;

public class LoanException {

    public static void main(String[] args) {
        Loan objLoan=new Loan();
         try {
             objLoan=new Loan(5.0,-2,0);
         }
         catch (IllegalArgumentException ex){
        System.out.println(ex);
        }
        System.out.println(objLoan.toString());
}
}
