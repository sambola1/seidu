/**
 * Created by owner on 2/17/2016.
 */
public class Driver {
    public static void main(String[] args) {
        try{
            ExceptionHandling exception = new ExceptionHandling(-5);
            ExceptionHandling exception2 = new ExceptionHandling(0);
            ExceptionHandling exception3 = new ExceptionHandling(6);
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println(ExceptionHandling.getNumberOfObject());


    }
}
