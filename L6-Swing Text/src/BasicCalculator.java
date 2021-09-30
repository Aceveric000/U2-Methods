import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    public class BasicCalculator {

    static JTextField inputField1, inputField2;
    static JLabel result;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calc");
        JPanel panel = new JPanel();
        JLabel inputNum1 = new JLabel ("enter num");
        JLabel inputnum2 = new JLabel("enter num");
        inputField1 = new JTextField(20);
        inputField2 = new JTextField(20);

        JButton button = new JButton("add");
        JButton button2 = new JButton("Divide");
        JButton button3 = new JButton("multiply");
        JButton button4 = new JButton("Subtract");

        result = new JLabel("0.00");


        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new BasicCalculator.buttonListener());
        button2.addActionListener(new button2Listener());
        button3.addActionListener(new button3Listener());
       button4.addActionListener(new button4Listener());
        panel.add(inputNum1);
        panel.add(inputField1);
        panel.add(inputnum2);
        panel.add(inputField2);
        panel.add(result);

        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);




        window.add(panel);

        window.setVisible(true);
    }

    private static class buttonListener implements ActionListener {
        /*
          1.get input
           2. do math'
           3.put result
         */
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

        result.setText(String.valueOf(num1 + num2));

        }
    }
    static class button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            result.setText(String.valueOf(num1 / num2));


        }
    }
    static class button3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            result.setText(String.valueOf(num1 * num2));


        }
    }
    static class button4Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            result.setText(String.valueOf(num1 - num2));


        }
    }
}

