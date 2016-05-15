/**
 * Created by owner on 3/23/2016.
 */
public class LeanerSearch {
    public static void main(String[] args) {
        int[] list = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 3;

        System.out.println("The linear search is " + Search(list, key));


    }

    public static  int Search(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key==(list[i])) {
                return i;
            }

        }
            return -1;
        }


    }