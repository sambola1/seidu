/**
 * Created by owner on 3/5/2016.
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ReadData {
    public static void main(String[] args)throws Exception {
        File file = new File("information.txt");

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int age = input.nextInt();
            System.out.println(firstName + " " + middleName + " " + lastName + " " + age);
        }
        input.close();

    }
}
