import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */


    public static void main(String[] args) {
        JFrame window = new JFrame("thia is a simple method ");
        JPanel panel = new JPanel();
        JButton button = new JButton("distance in feet");
        JButton button2 = new JButton("the meters is");

        window.setSize(800, 600);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //window
        button.addActionListener(new SimpleFrame.buttonListener());
        window.setLocationRelativeTo(null);

        button.addActionListener(new buttonListener());
        button2.addActionListener(new button2Listener());

        panel.add(button);
        panel.add(button2);
        window.add(panel);

        window.setVisible(true);
    }

    static class buttonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
    double number = Double.parseDouble(JOptionPane.showInputDialog("enter feet"));

        double result = number / 3.28;

            JOptionPane.showMessageDialog(null, result + "in meters. " );

        }
    }

    static class button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double number = Double.parseDouble(JOptionPane.showInputDialog("enter meter"));

            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + "in feet. ");

        }
    }
}