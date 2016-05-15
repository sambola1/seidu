/**
 * Created by owner on 3/24/2016.
 */
public class GenericLinearSearch {
    public static void main(String[] args) {
        Integer []list = {1,2,3,4,5,6,7,8,9,10};
        Integer key =9;

        System.out.println("Generic linear Search  "+ linearSearch(list, key));
    }
    public static<E extends Comparable<E>> int linearSearch(E[]list, E key) {
        for (int i= 0; i<list.length; i++){
            if (key.compareTo(list[i])==0) {
                return i;
            }

    }
        return -1;

    }
}
