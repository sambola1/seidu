/**
 * Created by owner on 2/28/2016.
 */
public class Transaction {
    private java .util.Date dateOfTransaction;
    private char ch;
    private double amount;
    private double balance;
    private String description;
    public Transaction(char ch,double amount, double balance,String description){
        this.ch = ch;
        this.amount  = amount;
        this.balance = balance;
        this.description = description;


    }
    public java.util.Date getDateOfTransaction(){
        return  dateOfTransaction;
    }
    public char getCh(){
        return ch;
    }
    public void setCh(char ch){
        this.ch = ch;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getDescription(){
        return  description;
    }
    public void setDescription(String description){
        this.description = description;
    }

}