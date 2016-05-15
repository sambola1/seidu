/**
 * Created by owner on 2/21/2016.
 */
public class TestFan {
    public static void main(String[] args) {
        Fan myFan = new Fan();
        Fan myFan2 = new Fan();
        myFan.setSpeed(3);
        myFan.setRadius(10);
        myFan.setColor("yellow");
        System.out.println("turn the fan on :"+ myFan.toString());
        myFan2.setSpeed(2);
        myFan2.setRadius(5);
        myFan2.setColor("blue");
        System.out.println("fan is turn off : " +myFan2.toString());
        //System.out.println("turn the fan off  "+myFan2.o);

    }
}
class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
        final int SLOw = 1;
        final int MEDIUM = 2;
        final int FASt = 3;
        int speed = 1;
        String color = "blu";
        double radius = 5;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public boolean isOn() {
        return true;

    }

    public void setOn(boolean newOn) {
        this.on = true;
    }

    public String toString() {
        return "off";

        }

    }
