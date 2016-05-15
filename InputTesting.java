/**
 * Created by owner on 2/17/2016.
 */
import java.util.Scanner;
public class InputTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user to enter two stringn
        System.out.println("Enter the first string");
        String str = input.nextLine();
        try {
            getName(str);
            //System.out.println("wrong input");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Execute normal programming");



    }
    public  static String getName(String a)throws IllegalArgumentException{
        char ch = a.charAt(0);
        if(Character.isDigit(ch) )
            throw new IllegalArgumentException("wrong input");
        return a;
    }
}
