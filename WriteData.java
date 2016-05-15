/**
 * Created by owner on 3/4/2016.
 */


import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class WriteData {
    public static void main(String[] args)  {


       PrintWriter output = new PrintWriter("seidu.txt");
        output.print(123);
        output.print("Paul Brown");
        output.print('A');
        output.println(34.0);
        output.print("124 Main Street");
        output.print("324 Rund Street");
        output.print('A');
        output.close();

        Scanner input = new Scanner(new File("seidu.txt"));
        System.out.println(input.nextDouble());
        System.out.println(input.nextInt());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.shuffle(list);
        System.out.println(list);





        




    }


}
