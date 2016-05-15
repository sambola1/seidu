/**
 * Created by owner on 2/18/2016.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritertoFile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        FileWriter fw;
        try {
            fw = new FileWriter("Jukebox1.txt");
            fw.write("Hello/World\n");
            fw.write("Hello/World\n");
            fw.write("Hello/World\n");
            fw.write("Hello/World\n");
            fw.write("Hello/World\n");
            fw.write("Hello/World\n");
            fw.write("Hello/World\n");
            fw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader("Jukebox1.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
