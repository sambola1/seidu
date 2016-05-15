/**
 * Created by owner on 2/17/2016.
 */
import java.util.*;
public class Stack {

    int [] stack;
    int size;
    int top;
    public Stack(int size){
        this.size = size;
        top = -1;
        stack = new int[size];
    }
    public void push(int i){
        top++;
        stack[top]= i;
    }
    public void display(){
        for(int i= 0; i<stack.length; i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.print("");

    }
    public void pop(int value){

        stack[--top]= value;
    }
    public int peek(){
        return size;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        //stack.pop();
        stack.peek();
        stack.display();
        PriorityQueue<String> list = new PriorityQueue<>();
        list.offer("Oklohoma");
        list.offer("Indiana");
        list.offer("Georgia");
        list.offer("Texas");
        System.out.println("priority queue using the comparable");
        while(list.size()>0) {
            System.out.println(list.remove());

        }
        PriorityQueue<String> list1 = new PriorityQueue<>(4,Collections.reverseOrder());
        list1.offer("Oklohoma");
        list1.offer("Indiana");
        list1.offer("Georgia");
        list1.offer("Texas");
        System.out.println("priority queu using the comparator");
        while(list1.size()>0){
            System.out.println(list1.remove());
        }
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.offer(56);
        number.offer(1);
        number.offer(100);
        number.offer(4);
        while(number.size()>0){
            System.out.println(number.remove());
            System.out.println();
        }
        PriorityQueue<Integer>number1 = new PriorityQueue<>(4,Collections.reverseOrder());
        number1.offer(56);
        number1.offer(1);
        number1.offer(100);
        number1.offer(4);
        while(number1.size()>0){
            System.out.println(number1.remove());
        }


    }
}



