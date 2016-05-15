/**
 * Created by owner on 3/10/2016.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java. util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter  a nonnagative number");
        int n = input.nextInt();
        System.out.println("Factorial of "+ n + " is "+ factorial(n));

    }
    public static int factorial(int x){
        if(x == 0)
            return 1;
        else
            return x*factorial(x-1);
    }
}
