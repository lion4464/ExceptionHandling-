package Section12_4;

public class IllegalnumberException extends Exception {
    private double annualInterestRate;
    private int numberofYears;
    private double loanAmout;

    public IllegalnumberException(double annualInterestRate, int numberofYears, double loanAmout)throws IllegalnumberException {
        super("Inavalid content is entered"+annualInterestRate+numberofYears+loanAmout);
        this.annualInterestRate = annualInterestRate;
        this.numberofYears = numberofYears;
        this.loanAmout = loanAmout;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberofYears() {
        return numberofYears;
    }

    public double getLoanAmout() {
        return loanAmout;
    }
}
