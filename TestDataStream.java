/**
 * Created by owner on 3/6/2016.
 */
import java.io.*;
public class TestDataStream {
    public static void main(String[] args)  throws IOException{
        try(
                DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("tem.dat")));
                ){
            output.writeUTF("Seidu Sambolah");
            output.writeDouble(89.0);
            output.writeUTF("George Gray");
            output.writeDouble(100.00);
            output.writeUTF("Thomas Jeffreson");
            output.writeInt(1000);

        }
        try(
                DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat")));

        ){
            System.out.println(input.readUTF()+ "    "+ input.readDouble());
            System.out.println(input.readUTF()+ "    "+ input.readDouble());
            System.out.println(input.readUTF()+ "     "+input.readInt());
        }

    }
}
