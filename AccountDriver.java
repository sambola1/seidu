/**
 * Created by owner on 2/25/2016.
 */
public class AccountDriver{
    public static void main(String[] args) {

        CheckingAccount myChecking = new CheckingAccount("George",5.5,1000.0,112);
        System.out.println("Get the name "+myChecking.getName() );
        System.out.println("annualInterest rate: "+ myChecking.getAnnualInterestRate());
        System.out.println("Balance: "+ myChecking.getBalance());

        myChecking.deposit(30.0);
        myChecking.deposit(40.0);
        myChecking.deposit(50.0);

        myChecking.withdraw(5.0);
        myChecking.withdraw(4.0);
        myChecking.withdraw(2.0);
        java.util.ArrayList list = myChecking.getTransaction();

        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");

        for (int i = 0; i < list.size(); i++) {
            Transaction transaction = (Transaction)(list.get(i));
            System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDateOfTransaction(),
                    transaction.getCh(), transaction.getAmount(), transaction.getBalance());
        }


    }
}


