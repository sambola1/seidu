import java.util.*;

/**
 * Created by owner on 3/26/2016.
 */
public class Loans{
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * default Constructor
     */
    public Loans() {


    }

    public Loans(double annualInterestRate, int numberOfYear, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear =numberOfYear;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double rate){
        this.annualInterestRate = rate;
    }
    public int getNumberOfYear(){
        return numberOfYear;
    }
    public void setNumberOfYear(int year){
        this.numberOfYear = numberOfYear;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double amount){
        this.loanAmount = amount;
    }
    public  double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount* monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYear*12)));
        return monthlyPayment;

    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment()*numberOfYear*12;
        return  totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }
    public double getMonthlyInterest(){
        double monthlyInterestRate = annualInterestRate/1200;
        return loanAmount*monthlyInterestRate;

    }
    public double getTotalInterestPayment(){
        return getMonthlyInterest()*numberOfYear;
    }
    public double getSixMonthInterestPayment(){
        return getMonthlyInterest()*6;
    }

    public static void main(String[] args) {
        Collection<String>collection = new ArrayList<>();
        collection.add("Baltimore");
        collection.add("Atlanta");
        collection.add("Seattle");
        collection.add("Madison");
        collection.add("Green Bay");
        collection.add("Los Angeles");


        //Iterator<String> iterator =collection.iterator();
        for( String x: collection){
            System.out.println(x.toUpperCase());

        }
        System.out.println();



    }
}