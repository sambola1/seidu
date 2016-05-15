/**
 * Created by owner on 3/24/2016.
 */
import java.io.*;
public class Chapter17TestFile {
    public static void main(String[] args) throws Exception {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_01.txt"));

        ) {
            // write 100 integer to the file
            for (int i = 1; i <= 100; i++) {
                output.write(i);
            }
            try (
                    DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_01.txt"))
            ) {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(input.read() + " ");
                }
            }

        }

    }
}





