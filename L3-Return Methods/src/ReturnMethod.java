import javax.swing.*;


public class ReturnMethod{


    public static void main(String[] args) {

        double length = Double.parseDouble(JOptionPane.showInputDialog("What is it"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("what is it?"));
        JOptionPane.showMessageDialog(null, "the area os " + area (length,width) + "\n the perimeter is" + perimeter(length,width));
        System.exit(0);
    }

    public static double area(double length, double width){
    return length * width;

    }
    public static double perimeter(double length, double width){
        return 2 * (width + length);
    }


}
