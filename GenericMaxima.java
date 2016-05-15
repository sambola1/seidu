/**
 * Created by owner on 5/1/2016.
 */
public class GenericMaxima {
    public static void main(String[] args) {
        Integer[]list = {2,3,5,6,7,8,9};
        int key =6;
        System.out.println("the maximum element is "+max(list));
        System.out.println ("Linear search "+ LinearSearch(list,key));



    }

    public static <E extends Comparable <E>>E max(E[]list){
        E max = list[0];
        for(int i = 0; i<list.length;i++){
            if(max.compareTo (list[i] )<0){
                max = list[i];
            }


        }




     return max;
    }
    public static <E extends Comparable <E>>E LinearSearch(E[]list,E list2){
        for(int i=0;i<list.length;i++ ) {
            if (list2.compareTo (list[i]) < 0) {


            }

        }
        return list2;

    }




}
