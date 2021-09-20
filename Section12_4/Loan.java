package Section12_4;
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberofYears;
    private double loanAmout;
    private java.util.Date date;

    public Loan()throws IllegalArgumentException{
        this(2.5,1,1.5);
    }

    public Loan(double annualInterestRate, int numberofYears, double loanAmout)throws IllegalArgumentException {
        this.annualInterestRate = annualInterestRate;
        this.numberofYears = numberofYears;
        this.loanAmout = loanAmout;
        date=new Date();
    }
    public double getAnnualInterestRate() {
    return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
        if (annualInterestRate>0)
            this.annualInterestRate = annualInterestRate;
        else
        throw new IllegalArgumentException();
    }

    public int getNumberofYears() {
        return numberofYears;
    }

    public void setNumberofYears(int numberofYears) throws IllegalArgumentException {
        if (numberofYears>0)
        this.numberofYears = numberofYears;
        else
            throw new IllegalArgumentException();
    }

    public double getLoanAmout() {
        return loanAmout;
    }

    public void setLoanAmout(double loanAmout) throws IllegalArgumentException {
        if (loanAmout>0)
        this.loanAmout = loanAmout;
        else throw new IllegalArgumentException();
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        double monthlyPayment=loanAmout*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberofYears*12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment=getMonthlyPayment()*numberofYears*12;
        return totalPayment;
    }
    public java.util.Date getDate(){
        return date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberofYears=" + numberofYears +
                ", loanAmout=" + loanAmout +
                ", date=" + date +
                '}';
    }
}
