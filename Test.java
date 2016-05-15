/**
 * Created by owner on 2/19/2016.
 */

import java.util.Stack;
 public class Test {
     public static void main(String[] args) {
         Stacks myStack = new Stacks(4);
         myStack.push(5);
         System.out.println(myStack.peek());
         myStack.push(6);
         myStack.push(7);
         myStack.push(8);
         System.out.println(myStack.peek());

     }
 }
class Stacks{

    int maxSize;
    int []list;
    int top =0;


    public Stacks(int newMaxSize){
        maxSize = newMaxSize;
        list = new int[maxSize];
        top = 0;

    }
    // to put and integer into the top of the stack
    public void push(int n){
        list[top]= n;
        top++;
    }
    // to remove integer from the stack
    public int pop(){
        if(top !=0){
            int temp = this.peek();
            list[top -1]= 0;
            top--;
            return temp;
        }else
            return 0;

    }
    // check if the stack is empty
    public boolean empty(){
        if(top == 0)
            return true;
        else
            return false;
    }
    public int peek(){
        return list[top -1];
    }

    }

