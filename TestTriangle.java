/**
 * Created by owner on 2/24/2016.
 */
import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for side1 ");
        double side = input.nextDouble();
        System.out.println("Enter the value for side2 ");
        double side2 = input.nextDouble();
        System.out.println("Enter the value for side3 ");
        double side3 = input.nextDouble();
        System.out.println("Enter the color");
        String color = input.next();

        System.out.println(" Enter the  filled ");
        boolean fill = input.nextBoolean();

        Triangle myTriangle = new Triangle(1.0,1.0,1.0);

        System.out.println("The area of the triangle : "+myTriangle.getArea());
        System.out.println("The perimeter of the triangle: "+ myTriangle.getPerimeter());
        System.out.println("The color of the triangle: "+myTriangle.getColor());
        System.out.println("The triangle: "+myTriangle.toString());
        myTriangle.setFilled(true);
        myTriangle.setColor("white");




    }
}

class GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    GeometricObject(){
        dateCreated = new java.util.Date();
    }


    GeometricObject(String newColor, boolean newFilled){
        this.color = newColor = "white";
        this.filled = newFilled;
        dateCreated = new java.util.Date();
    }
    public String getColor(){
        return  color;

    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean newFilled){
        this.filled = newFilled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }


}

class Triangle extends GeometricObject{
    private double  side = 1.0;
    private double  side2 = 1.0;
    private double side3 = 1.0;

    Triangle(){


    }
    Triangle(double side1, double side2, double side3){
        this.side = side1;
        this. side2 = side2;
        this.side3 = side3;

    }
    Triangle(double side1,double side2, double side3, String color, boolean filled){
        this.side= side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }
    public double getSide(){
        return side;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double s= (side + side2+side3)/2;
        ;
        return Math.sqrt(s*(s-side)*(s-side2)*(s-side3));


    }
    public double getPerimeter(){
        return side+side2+ side3;

    }
    public String toString(){
        return "Triangle: side = "+ side +" side2= "+side2 +" side3 = "+side3;
    }


}
