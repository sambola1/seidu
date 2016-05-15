/**
 * Created by owner on 2/28/2016.
 */
public class AtmGames{
    private int[] id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
    private double withDraw;
    private double deposit;


    public AtmGames(){
        dateCreated = new java.util.Date();

    }
    public AtmGames( double balance){
        this.id = new int[10];
        this.balance = balance;
        this.dateCreated = new java.util.Date();


    }
    public int[] getId(){
        return id;
    }
    public void setId(int[] id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12.00;
    }
    public double getMonthlyInterest(){
        return (annualInterestRate/12.00)*(balance);
    }
    public void setWithDraw(double w){
       balance-=w;


    }


    public void setDeposit(double d){
        balance+=d;


       // System.out.println("The amount deposit is:" + d);
    }
}
