/**
 * Created by owner on 3/5/2016.
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class ReadingData {
    public static void main(String[] args) throws IOException{
        File file = new File("Story.txt");
        PrintWriter output = new PrintWriter(file);
        output.print("Java 101");

        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());
        input.close();
    }
}
