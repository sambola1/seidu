/**
 * Created by owner on 2/28/2016.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class AtmDriverClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("   Main menu");
        //System.out.println("\n 1: check balance\n 2: withdraw\n 3: deposit\n 4: exit");
        int counter = 10;
        int[] id = new int[counter];
        System.out.println("Enter the id to display the Main menu");
        for (int i = 0; i < id.length; i++) {

            id[i] = input.nextInt();
            if (id[i] == 5)
                System.out.println("\n Main menu\n 1: check balance\n 2: withdraw\n 3:deposit\n 4: exit");
            else
                System.out.println("Enter the correct account id to displace the Main menu ");

            AtmGames myAccount = new AtmGames(100.00);
            if (id[i] == 1) {
                System.out.println("\n Main menu\n 1: check balance\n 2: withdraw\n 3:deposit\n 4: exit");

                System.out.println("The balance is: " + myAccount.getBalance());
            }
            if (id[i] == 2) {
                System.out.println("\n Main menu\n 1: check balance\n 2: withdraw\n 3:deposit\n 4: exit");
                 myAccount.setWithDraw(3.00);
                System.out.println("The account balance is: "+myAccount.getBalance());
            } if (id[i]==3) {
                System.out.println("\n Main menu\n 1: check balance\n 2: withdraw\n 3:deposit\n 4: exit");
                myAccount.setDeposit(10.0);

                System.out.println("The account balance is:" + (myAccount.getBalance()));



            }





        }


    }

}







