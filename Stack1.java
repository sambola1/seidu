/**
 * Created by owner on 3/25/2016.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class Stack1{
    private int[]elements;
    private int size;
    private int top;
    public Stack1(){

    }
    public Stack1(int size){
        this.size = size;
        elements = new int[size];
    }
    public void push(int value){
        top++;
        elements[top]= value;


    }
    public void Display(){
        for(int i =1; i<elements.length;i++){
            System.out.println(elements[i]+ " ");

        }
        System.out.println();
    }
    public void pop( int value){
        elements[-- top] = value;
    }
    public boolean isEmpty(){
        return true;

        }
    public  int getSize(){
        return size;
    }
    public  void peek(int value){
        elements[top--]= value;
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1();

        stack.push(2);
        stack.push(8);
        stack.push(9);
        //stack.Display();
        stack.pop(9);

        int []number = new int[100];
        for(int i= 0;i< number.length; i++){
            number[i]= 1+(int) (Math.random()*7);
            System.out.println(number[i]);
        }
    }






    }


