/**
 * Created by owner on 2/23/2016.
 */
public class ArrayObject {
    public static void main(String[] args) {
        int [] array = createArray();
        printArray(array);


        int[] x = {1, 2, 3, 4, 5};
        xMethod(x, 5);
    }

    public static void xMethod(int[] x, int length) {
        System.out.print(" " + x[length - 1]);
        xMethod(x, length - 1);
    }



    public static int[]createArray() {
        int[] array = {2,2,3,4,5,6,7,8,9};
        int [] result = new int[array.length];
        for(int i = 0,j=result.length -1;i<array.length;i++,j--){
            result[i]= array[i];
        }
           return result;
        }


     public static void printArray(int [] array){
    for(int i = 0; i<array.length;i++){
        System.out.println(array[i]);
    }

}

}