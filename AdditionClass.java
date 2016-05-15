/**
 * Created by owner on 5/13/2016.
 */
import java.util.*;
public class AdditionClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 =  (int) (Math.random() * 6);
        int number2 =  (int) (Math.random() * 6);
        System.out.println(" what is  " + number1 + " - " + number2);
        int answer = input.nextInt();
        if(number1< number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }




        while (number1 - number2 != answer) {
            System.out.println("Wrong answer, Try again. What is " + number1 + " - " + number2);
            answer = input.nextInt();


        }
        System.out.println( "You got it");






    }
}
