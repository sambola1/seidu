
public class Methods{
    public static void main(String[] args) {
        // Add the two numbers
        int number1 = 5;
        int number2 = 10;


        // Subtract the two numbers
        int n1 = 40;
        int n2 = 20;

        // Multiply the two number
        int num1 = 11;
        int num2 = 17;

        // Divide the two numbers
        double s1 = 25;
        double s2 = 5;




        System.out.println("The sum  of "+ number1+" plus "+ number2+ " is  "+ Add(number1, number2));
        System.out.println("Th  different    " + n1 +"  minus  "+ n2 + " is "+ Substract(n1, n2));
        System.out.println("The product of  "+num1+ "  times "+num2+ " is  "+  Multiplication(num1, num2));
        System.out.println("The quiten  "+s1 +"  divided "+ s2+ "  is  "+ Division(s1,s2));

    }

    public static int Add(int ch1, int ch2){

        return  ch1 +ch2;
    }
    public static int Substract(int var1, int var2){
        return var1-var2;
    }
    public static int Multiplication(int cha1, int cha2){
        return cha1* cha2;
    }
    public static double Division(double char1, double char2){
        return (char1/char2);
    }




}




