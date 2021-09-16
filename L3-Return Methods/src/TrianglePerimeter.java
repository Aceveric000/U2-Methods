import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     get input coordinates
     calculate distances = 1,2,3;3,1
     calculate perimeter
      display and round *\




     */

    public static void main(String[] args) {
        int x1 = getInput("point 1, x- cord");
        int y1 = getInput("put input y1");

        int x2 = getInput("whats x2");
        int y2 = getInput("put y2");

        int x3 = getInput("x3");
        int y3 = getInput("get y3");
        double distance1 = distance(x1, x2, y1, y2);
        double distance2 = distance(x2, x3, y2, y3);
        double distance3 = distance(x1, x3, y1, y3);
        double perimeter = triPerm(distance1, distance2, distance3);

        outputResults(perimeter);
        System.exit(0);
    }


    //input method
    public static int getInput(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));


    }
    //distance method
        public static double distance(int x1, int x2, int y1, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
        }
        //perimeter method
    public static double triPerm(double side1, double side2, double side3){
        return side1 + side2 + side3;
        }

    //output
    public static void outputResults(double perimeter) {
        DecimalFormat round = new DecimalFormat("#,###.000");

    }
    }

