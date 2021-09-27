import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes{

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("this my mf frame ");
        JPanel panel = new JPanel();
        JButton button = new JButton("see my quote");
        JButton button2 = new JButton ("qoute");
        JButton button3 = new JButton ("wsp");
        window.setSize(1000, 100);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //My window go hard fr
        button2.addActionListener(new SimpleFrame.buttonListener());
        button.addActionListener(new SimpleFrame.buttonListener());
        window.setLocationRelativeTo(null);

        button.addActionListener(new buttonListener());
        button2.addActionListener(new button2Listener());
        button3.addActionListener(new button3Listener());


        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        window.add(panel);

        window.setVisible(true);
    }
}
    class buttonListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Why you click me ");
        }
    }



    class button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Why you click me ");
        }
    }
class button3Listener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Why you click me ");
    }
}

