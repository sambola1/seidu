/**
 * Created by owner on 2/23/2016.
 */
import java.util.Scanner;
public class TestDiscriminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer for a");
        int a = input.nextInt();
        System.out.println("Enter the integer for b");
        int b = input.nextInt();
        System.out.println("Enter the integer for c");
        int c = input.nextInt();

        QuadraticEquation myQuadratic = new QuadraticEquation(a,b,c);
        System.out.println("The value for  a "+myQuadratic.getA());
        System.out.println("The value for  b "+myQuadratic.getB());
        System.out.println("The value for c " +myQuadratic.getC());
        System.out.println("The discriminant is "+myQuadratic.getDiscriminants());

        System.out.println("root1 of the equation is "+myQuadratic.getRoot1());
        System.out.println("Root2 of the equation is "+ myQuadratic.getRoo2());
        myQuadratic.getDiscriminant();


    }
}

class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    QuadraticEquation(int newA, int newB, int newC) {
        this.a = newA;
        this.b = newB;
        this.c = newC;
    }

    public int getA() {
        return a;

    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public double getDiscriminants(){
        return Math.pow(b,2)-4*a*c;

    }

    public void getDiscriminant() {
        if ((Math.pow(b, 2)) - (4 * a * c) >= 0) {
            System.out.println((-b + (Math.pow(b, 2)) - (4 * a * c) / (2 * a)) + " and " + (-b - (Math.pow(b, 2)) - (4 * a * c) / (2 * a)));

        } else if (Math.pow(b, 2) - (4 * a * c) == 0) {
            System.out.println((-b + (Math.pow(b, 2)) - (4 * a * c) / (2 * a)));
        } else
            System.out.println( " below is the root of the equation");
    }



    public double getRoot1() {
        if((Math.pow(b, 2)) - (4 * a * c) >= 0)
            return ((-b+Math.pow(b,2)-(4*a*c)/(2*a)));
        else
            return 0;
    }
    public double getRoo2(){
        if((Math.pow(b, 2)) - (4 * a * c) >= 0)
            return ((-b-Math.pow(b,2)-(4*a*c)/(2*a)));
        else
            return 0;


    }
}

