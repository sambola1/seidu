import java.util.ArrayList;

/**
 * Created by owner on 2/25/2016.
 */
public class CheckingAccount extends Account {
    private double annualInterestRate = 5.5;
    private double balance =1000.0;
    private java.util.Date dateCreated;
    private String name = "George";
    private int id = 112;
    ArrayList<Double>list =new java.util.ArrayList<>();
    public CheckingAccount(){
        dateCreated = new java.util.Date();

    }
    public CheckingAccount(String name,double annualInterestRate,double balance,int id ){
        this.name = name;
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
        this.id = id;
    }

    public static void setAnnualInterestRate(double annualInterestRate){
        annualInterestRate = annualInterestRate;

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

    }
    public String getName(){
        return name;
    }


}
