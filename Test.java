/**
 * Created by owner on 2/17/2016.
 */
import java.util.*;
public class Test {
    public static void main(String[] args) {
        try {


            int[] list = array();
            System.out.println(list);
            Display(list);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("catch the exception");
        }
        finally {
            System.out.println("The program did not crash");
        }


    }

    public static int[] array()throws ArrayIndexOutOfBoundsException {

        int[] list = new int[100];
        for (int i = 1; i <= list.length; i++) {
            list[i] = (int) (Math.random() * 10);


        }
        return list;
    }

    public static void Display(int[] list) {

        for (int i = 1; i <= list.length; i++) {
            System.out.println(list[i] + "");


        }
    }
}

