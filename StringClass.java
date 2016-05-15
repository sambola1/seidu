/**
 * Created by owner on 2/17/2016.
 */
public class StringClass {
    public static void main(String[] args) {
        String str = "abc";

        try {
            char ch = str.charAt(9);

        }
        catch (IndexOutOfBoundsException ex){
            System.out.println();
        }
        finally {
            System.out.println(str.toUpperCase());
        }
    }
}
