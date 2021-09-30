import javafx.scene.control.Labeled;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickCount = 0;
            static JLabel clickCountLabel;
            static JTextField input;


    public static void main(String[] args) {
        JFrame window = new JFrame("clicks");
        JPanel panel = new JPanel();
        JLabel inputLabel = new JLabel("enter name");
    clickCountLabel = new JLabel("click count");
       input = new JTextField(15);
        JButton button = new JButton("Click for boom ");

        window.setSize(300,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(inputLabel);
        panel.add(input);
        panel.add(clickCountLabel);
        panel.add(button);

        window.add(panel);

        window.setVisible(true);

    }

    static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            String product = input.getText();

            clickCount++;
            clickCountLabel.setText(" i changed it " + clickCount + " Number of times " + product);

            }

        }

    }
