import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by owner on 2/25/2016.
 */

abstract class Account {
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    private java.util.ArrayList Transaction = new ArrayList();
    
     // the default constructor
    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new java.util.Date();
    }

    public Account (String name, int id, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }


     public int getId() {
        return id;
    }
    public java.util.ArrayList getTransaction(){
        return Transaction;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }
    public String getName(){
        return name;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
        Transaction.add(new Transaction('w', amount, balance, ""));
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction.add(new Transaction('D', amount, balance, ""));
    }
}

