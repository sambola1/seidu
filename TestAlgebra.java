/**
 * Created by owner on 2/24/2016.
 */
import java.util.Scanner;
public class TestAlgebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for a ");
        int a = input.nextInt();
        System.out.println("Enter the value for b ");
        int b = input.nextInt();
        System.out.println("Enter the value for c");
        int c = input.nextInt();
        System.out.println("Enter the value for  d ");
        int d = input.nextInt();
        System.out.println("Enter the value for  e ");
        int e = input.nextInt();
        System.out.println("Ent the value for  f ");
        int f = input.nextInt();

        Algebra myAlgebra = new Algebra(a,b,c,d,e,f);
        if(a*d -b*c == 0 )
            System.out.println("The equation does no have solution");
        else
            System.out.println("The equation has solution");
        System.out.println(myAlgebra.isSolvable());
        System.out.println("The equation for y "+myAlgebra.getY());
        System.out.println("The equation for x "+myAlgebra.getX());
        System.out.println("The denominator "+(a*d -b*c));
        System.out.println("The numerator "+(e*d - b*f));

    }


}
class Algebra{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    Algebra(int a2, int b2, int c2,int d2,int e2, int f2){
        this.a = a2;
        this.b = b2;
        this.c = c2;
        this.d = d2;
        this.e = e2;
        this.f = f2;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;

    }
    public int getD(){
        return d;
    }
    public int getE(){
        return e;
    }
    public int getF(){
        return f;
    }
    public boolean isSolvable(){
        if(a*d - b*c!=0)
            return true;
        else
            return  false;
    }
    public  double getX(){
        if(a*d - b*c == 0)
        return  0;
        else
            return ((e*d - b*f)/(a*d - b*c));

        }


    public double getY(){
        if(a*d -b*c == 0)
        return 0;
        else
            return (a*f - e*f)/(a*d -b*c);
    }



}
