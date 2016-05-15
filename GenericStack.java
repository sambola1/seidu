/**
 * Created by owner on 3/24/2016.
 */
public class GenericStack {
    private int []elements;
    int size ;
    public static final  int DEFAULT_CAPACITY = 0;

public GenericStack() {
    this(DEFAULT_CAPACITY);

}
    public GenericStack(int capacity){

        elements =new int[capacity];
    }


    public  void push(int value){

        if(size>= elements.length) {
            int[] newElement = new int[elements.length*2];
            System.arraycopy(elements, 0, newElement, 0, elements.length);
            elements = newElement;
        }
        elements[size++]=  value;


    }
    public  int getSize(){
        return size;
    }
    public int peek(){
        return  elements[size-1];
    }
    public  int pop(){
        return elements[--size];
    }
    public  boolean isEmpty(){
        return  true;
    }
    public String toString(){
        return  "stack "+elements.toString();
    }
    public void Display(){
        for(int i =0; i<elements.length; i++){
            System.out.println(elements[i]+ "" +" ");
        }
        System.out.println();
    }
    public int getSide(){
        return size;
    }


    public static void main(String[] args) {
        GenericStack stack1 = new GenericStack(3);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();
        stack1.Display();
        System.out.println(stack1.getSide());



    }


}
