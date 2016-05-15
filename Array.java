/**
 * Created by owner on 5/14/2016.
 */
import java.util.*;


public class Array {
    public static void main(String[] args)  {
        Scanner input =new Scanner(System.in);

        ArrayList<String>list = new ArrayList<>();
        String a = "Yellow";
        System.out.println("Enter a string(input end with 'Yellow'");
        String value = input.next();
        while (!value.equals(a)){
            System.out.println("Enter string (input end with 'Yellow' ");
            value =input.next();
            if(!list.contains(value)&& !value.equals(a)){
                list.add(value);
            }


        }

        System.out.println(list);
         Collections.sort(list);
        System.out.println();
        System.out.println(list);
        list.remove(3);
        System.out.println(list);









    }
}
