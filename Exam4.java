

/**
 * Created by owner on 3/24/2016.
 *
 */
import java.io.*;
public class Exam4 {
    public static void main(String[] args) throws IOException {
        try(
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))
                ){
              output.writeUTF("John");
              output.writeUTF("Hello World");
        }
        try(
                DataInputStream input = new DataInputStream(new FileInputStream("tem.dat"))
                ){


            System.out.println(input.readUTF());
            System.out.println(input.readUTF());
        }

    }
}
