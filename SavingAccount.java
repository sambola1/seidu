/**
 * Created by owner on 2/25/2016.
 */

public class SavingAccount  {
    private double annualInterestRate = 5.5;
    private double balance =1000.0;
    private java.util.Date dateCreated;
    private String name = "George";
    private int id = 112;

    public SavingAccount(){
        dateCreated = new java.util.Date();

    }
    public SavingAccount(String name,double annualInterestRate,double balance,int id ){
        this.name = name;
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
        this.id = id;
    }
    public  double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;

    }
    public double getBalance(){
        return  balance;
    }
    public void setBalance(double balance){
        this.balance = balance;

    }
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void makeDeposit(double  d){
        balance+= d;
    }
    public void makeWithdraw(double w){
        balance-=w;
    }
    public String getName(){
        return name;
    }


}

