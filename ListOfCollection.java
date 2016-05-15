import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by owner on 3/31/2016.
 */
import java.util.*;
import java.util.Stack;

public class ListOfCollection {
    public static void main(String[] args){
        Stack<String>list = new Stack<>();

        list.push("Read");
        System.out.println(list);
        List<String>collection1 = Arrays.asList("yellow","Green","white","Black","Red","Red");
        List<String>collection2 = Arrays.asList("Gray","Black", "Blue");
        System.out.println(Collections.disjoint(collection1,collection2));
        Collections.copy(collection1,collection2);
        System.out.println(collection1);
        System.out.println(Collections.frequency(collection1,"Red"));

        LinkedHashSet<String >set = new LinkedHashSet<>();
        set.add("Baltimore");
        HashSet<String>set2 =new LinkedHashSet<>(set);
        System.out.println(set2);


    }
}
