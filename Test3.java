import java.io.*;

/**
 * Created by owner on 3/10/2016.
 */
public class Test3 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try(
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream( "object.txt"))
                ){
            output. writeObject(new A());

        }
        catch (NotSerializableException e){
            System.out.println("I caugh the exception");
        }

    }
}
class A implements Serializable{
      B b = new B();
}
class B{

}
