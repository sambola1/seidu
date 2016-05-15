/**
 * Created by owner on 3/20/2016.
 */
public class quiz {
    public static void main(String[] args) {


        try {
            System.out.println("Welcome to Java");
            int i = 0;
            int y = 2 / i;
            System.out.println("Welcome to HTML");
        }
        catch (ArithmeticException ex){
            System.out.println("Catch the error");

        }
        finally {
            System.out.println("The finally clause is executed");

        }


    }
}
