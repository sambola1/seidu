import javafx.scene.control.Slider;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by owner on 3/25/2016.
 */
public class Books {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] array = {1, 2, 3, 4, 5};
        java.util.Date date = new java.util.Date();
        java.util.ArrayList<String> cities = new ArrayList<>();
        cities.add("Baltimore");
        cities.add("Washington Dc");
        cities.add("Boston");
        cities.add(" GreenBay");
        cities.add("Tampa");
        cities.add("Miami");
        cities.add("Olando");
        cities.add("los Angeles");
        cities.add("Wilmington");
        Loans loan = new Loans(10.5,5,1200.0);
        Loans loan1 = new Loans(10.5,5,12000.0);
        Loans loan2 = new Loans(10.5,5,12000.0);
        Loans loan3 = new Loans(10.5,5,12000.0);
        Loans loan4 = new Loans(10.5, 5,12000.0);
        Loans loan5 = new Loans(10.5,5,12000.0);

        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))

        ) {
            output.writeObject(array);
            output.writeObject(date);
            output.writeDouble(5.5);
            output.writeObject(cities);
            output.writeObject(loan.getSixMonthInterestPayment());
            output.writeObject(loan1.getMonthlyPayment());
            output.writeObject(loan2.getTotalPayment());
            output.writeObject(loan3.getLoanDate());
            output.writeObject(loan4.getMonthlyInterest());
            output.writeObject(loan5.getTotalInterestPayment());
        }

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"))

        ) {


            int[] newNumber = (int[]) (input.readObject());
            java.util.Date newDate = (java.util.Date) (input.readObject());
            double score = input.readDouble();
            java.util.ArrayList<String>newCities = (java.util.ArrayList)(input.readObject());



            System.out.println( newDate);
            System.out.println();
            System.out.println(score);
            System.out.println();
            System.out.println(newCities);
            System.out.println();
            System.out.println("The monthly payment "+loan1.getMonthlyPayment());
            System.out.println();
            System.out.println("The total payment  "+loan2.getTotalPayment());
            System.out.println();
            System.out.println(" The loan date "+loan3.getLoanDate());
            System.out.println();
            System.out.println("The six months interest Payment "+loan.getSixMonthInterestPayment());
            System.out.println();
            System.out.println("The monthly interest "+loan4.getMonthlyInterest());
            System.out.println();
            System.out.println("The total interest payment "+loan5.getTotalInterestPayment());
            System.out.println();

            for(int i =0;i<newNumber.length;i++)
                System.out.print(newNumber[i]+ " ");
            System.out.println();

        }

    }




    }










