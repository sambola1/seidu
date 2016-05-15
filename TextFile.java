import java.io.File;
import java.io.PrintWriter;


/**
 * Created by owner on 4/13/2016.
 */

import java.util.*;
public class TextFile {

    public static void main(String[] args) throws Exception {
        ArrayList<String >list = new ArrayList<> ();
        list.add("Zebra");
        list.add("Red");
        list.add("yellow");
        list.add("Brown");
        try (
                PrintWriter output = new PrintWriter(new File("temp.txt"))

        ) {
            output.print (list);


        }


        try (


                Scanner input = new Scanner(new File("temp.txt"));
        ) {
            ArrayList<String > list1 = new ArrayList<> ();
            String m =(String)input.nextLine ();
            Collections.sort (list1);
            System.out.println (list1);




    }


    }
}
