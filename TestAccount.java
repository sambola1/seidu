import java.io.Serializable;
import java.util.*;


public class TestAccount{
    public static void main(String[] args) {


    List<Account> list = new ArrayList<>();
        list.add(new Account(112,2000.0));

        //list.add(new Account());


        for(Account s: list) {
            s.setAnnualInterestRate(4.6);
            s.setBalance(2000.0);
            s.setWithdrawal(500.0);
            s.setDeposit(100);

            System.out.println("the monthly interest is "+s.getMonthlyInterest());
            System.out.println(" the monthly interest  rate is "+ s.getMonthlyInterestRate());

            System.out.println("the  initial balance is "+ s.getInitialBalance());
            System.out.println("the  final balance is "+ s.getFinalBalance());


        }







       // Account myAccount = new Account(112,20000);




        //System.out.println("The balance is: "+(myAccount. getBalance()+myAccount.getDeposit(3000.00)-myAccount.getWithdraw(2500.00)));
        //System.out.println("The monthly interest: "+myAccount.getMonthlyInterest());
        //System.out.println("The date created: "+ myAccount.getDateCreate());


    }

}
    class Account  {

        private int id;
        private double balance;
        private double annualInterestRate;
        private double withdraw;
        private double deposit;
        private String name;
        private int  age;
        private java.util.Date dateCreate;

        Account(String newName,int newAge ,double newDeposit) {
            this.name = newName;
            this.age = newAge;
            this.deposit = newDeposit;

        }
        public String getName(){
            return  name ;
        }
        public int getAge(){
            return  age;
        }

        Account(int newId, double newBalance) {
            this.id = newId;
            this.balance = newBalance;
            dateCreate = new java.util.Date();

        }

        public int getId() {
            return id;
        }

        public void setId(int newId) {
            this.id = newId;
        }

        public double getInitialBalance() {
            return balance;
        }

        public void setBalance(double newBalance) {
            this.balance = newBalance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double n) {
            this.annualInterestRate = n;

        }

        public java.util.Date getDateCreate() {
            return dateCreate;
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12.00;
        }

        public double getMonthlyInterest() {
            return getMonthlyInterestRate() * balance;

        }

        public void setDeposit (double d){

            this.deposit = d;


        }
        public double getDeposit(){
            return  deposit;
        }
        public double getWithdraw(){
            return withdraw;
        }


        public void setWithdrawal(double w) {
            this.withdraw =w;




        }
        public double getFinalBalance(){
            return getInitialBalance()+getDeposit()-getWithdraw();



        }

    }



