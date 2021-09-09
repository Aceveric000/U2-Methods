import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        area();

        circumference();

        System.exit(0);
    }

    private static void circumference() {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the length? "));
        double circumference = 2 * Math.PI * radius;

        JOptionPane.showInputDialog("your area is " + radius);
    }


    //call the area method
        public static void area() {

            double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the length? "));

            double area = Math.PI * Math.pow(radius, 2);

            JOptionPane.showInputDialog("your area is " + radius);
            //call the circumference method


            //write a method to calculate a circle's area


            //write a method to calculate a circle's circumference
        }
    }
