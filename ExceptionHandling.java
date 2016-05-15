/**
 * Created by owner on 2/17/2016.
 */
public class ExceptionHandling {
    int radius;
   private static int numberOfObject =0;

   public   ExceptionHandling() {
       this(1);


    }

     ExceptionHandling(int newRadius) {
        setRadius(newRadius);
         numberOfObject++;
    }

    public void setRadius(int newRadius)
            throws IllegalArgumentException {
        if (newRadius < 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("the radius can not be negative number");


    }
    public static int getNumberOfObject(){
        return numberOfObject;
    }

}







