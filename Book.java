import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by owner on 2/11/2016.
 */
import java.util.Scanner;
public class Book {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        System.out.println("enter a string");
        String name = input.next();
        try {


            int number3 = quotient ( number1, number2);
            System.out.println(number1+ "/" +number2);



        }catch (ArithmeticException ex){
            System.out.println("an integer can not be divided by zero");
        }
        try {

            Display(name);
            System.out.println(name);
        }catch (InputMismatchException ex){
            System.out.println( "input require String");
        }







    }
    public static int quotient(int number1, int number2){
        if(number2 == 0)
            throw  new ArithmeticException("divisor can not be zer0");
        return number1/number2;

    }
    public static String Display(String name)throws InputMismatchException {


        return name;

    }


    }



