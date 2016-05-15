/**
 * Created by owner on 3/13/2016.
 */
import java.util.*;
public class RecursiveTest {
    public static void main(String[] args) {

        String s = "MOM";
        System.out.println(s.substring(1,2));
        Scanner input = new Scanner(System.in);
        System.out.println("Ente a nonnagative arg for xmethod");
        int num = input.nextInt();
        System.out.println("Sum is "+ xMethod(num));
        System.out.println("enter a nonnagetive number for ymethod");
        int n = input.nextInt();
        yMethod(n);
        System.out.println("enter the power of m");
        int m = input.nextInt();
        System.out.println( zMethod(m));
        System.out.println("Enter an index for the fibonacci number");
        int index = input.nextInt();
        System.out.println("The fibonacci number at index  "+ index + "  is "+fib(index));
        System.out.println("Is uncle a palindrome "+isPalindrome("uncle"));
        System.out.println("is dad a  palindrome "+ isPalindrome("dad"));
        System.out.println("is this word palindrome "+ isPalindrome("abdxcxdba"));
        System.out.println("is this word palindrome "+isPalindrome("abcba"));

    }
    public static int xMethod(int n){
        if(n == 0)
            return 1;
        else
            return  n+xMethod(n-1);
    }
    public static void yMethod(int m){
        if(m > 0) {
            System.out.println(m % 10);
             yMethod(m / 10);
        }

    }
    public static int zMethod(int a){
        if(a== 0)
            return 1;
        else
            return (int) Math.pow(2,a)*zMethod(a-1);

    }
    public static long fib(long index){
        if(index == 0)
            return 0;
        else if(index ==1)
            return 1;
        else
            return fib(index-1)+fib(index -2);
    }
    public static boolean isPalindrome(String s){
        if(s.length()<=1)
            return true;
        else if(s.charAt(0)!= s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));


    }
}
