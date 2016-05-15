import java.io.*;
import java.util.*;

/**
 * Created by owner on 4/12/2016.
 */
public class HashSetExample {
    public static void main(String[] args)throws Exception {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("test.text"));
        Set<String> set = new HashSet<>();
        set.add("Baltimore");
        set.add("Washington DC");
        set.add("New York City");
        set.add("Alexander");
        set.add("Tacoma");
        set.add("Los vegas");

        Integer[]array = {1,3,4,5,6,6};
        Character[]arrays = {'z','x','v','b','n','m','a','s','d','f','g','h','j','k','l','q','w','e'};
        Set<Integer > set1 = new HashSet<>(Arrays.asList(array));
        Set<Character>set3 = new HashSet<>(Arrays.asList(arrays));
        Set<String >set4 = new LinkedHashSet<>(set);
        output.writeObject(set1);
        output.writeObject(set3);
        output.writeObject(set4);


        output.close();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("test.text"));
        set1 = (HashSet<Integer>) input.readObject ();
        set4 = (HashSet<String>) input.readObject();

         set3 = (HashSet<Character>) input.readObject ();



        System.out.println(set1);
        System.out.println(set3);
        System.out.println(set4);

        output.close();






    }



}
