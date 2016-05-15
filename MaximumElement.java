/**
 * Created by owner on 3/24/2016.
 */
public class MaximumElement {
    public static void main(String[] args) {
        Integer[]list ={11,32,34,22,55,34,67,87,90,53};
        max(list);
        System.out.println("The max Element in the array is "+max(list));

    }
    public static<E extends Comparable<E>> E max(E[]list ){
        E max = list[0];
        for(int i= 0;i<list.length;i++){
            if(list[i].compareTo(max)>0)
                max =list[i];
        }
        return max;
    }
}
