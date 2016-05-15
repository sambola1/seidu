/**
 * Created by owner on 2/25/2016.
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        GeometricObject  circle = new CircleFromSimpleGeometricObject(1);
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        circle.setColor("white");

    }
}
class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this. color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;

    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return " created on " + dateCreated + "\ncolor " + color + " and filled " + filled;

    }
}
class CircleFromSimpleGeometricObject extends GeometricObject{
    private double radius;
    CircleFromSimpleGeometricObject() {


    }
    CircleFromSimpleGeometricObject(double newRadius){

    }
    CircleFromSimpleGeometricObject(double newRadius,String color, boolean filled){
        this.radius = newRadius;
        setColor(color);
        setFilled(filled);

    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;

    }

}

