import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    //private static Object radius;

    //public static void main(String[] args) {
        //double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the length? "));
        //area(radius);
      //  circumference();

    //}

    //private static void area(double radius) {
    //}

    //private static <radius> void circumference(radius) {
        //double circumference = 2 * Math.PI * radius;

        //JOptionPane.showInputDialog("your area is " + radius);

   // }


    //re-write the method to calculate a circle's area using parameters
    //public static void area(){

        //double area = Math.PI * Math.pow( radius, 2);

       // JOptionPane.showInputDialog("your area is " + radius);

    //re-write the method to calculate a circle's perimeter using parameters
    public static void main(String[] args) {
        double radius = getInput("please put radius");

        double area = area(radius);

        double circlesPerimeter = circlesPerimeter(radius);

        JOptionPane.showMessageDialog(null, displayResults(area, circlesPerimeter));


    }
    public static double getInput (String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));

    }
    public static double area(double radius) {


        return Math.pow(radius, 2) * Math.PI;
    }
    public static double circlesPerimeter( double radius )
    {
        return 2 * Math.PI * radius;
    }
    public static String displayResults(double area, double circlesPerimeter ){
        DecimalFormat round = new DecimalFormat("#.##");
        String message = "the area is" + round.format(area);
        message += "\nthe circumference is " + round.format(circlesPerimeter) ;
        return message;
    }



}
