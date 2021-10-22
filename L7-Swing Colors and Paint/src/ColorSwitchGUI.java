/*
Create a GUI with three buttons and each button changes
the color of the panel background and the button backgrounds and foregrounds.

Create the GUI in the ColorSwitchGUI class.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window = new JFrame("window");
    JPanel panel = new JPanel();
    JButton colorClicker = new JButton("Change the Colors");
    JButton colorTwo = new JButton("Button numba two");
    JButton colorThree = new JButton("Button numba three");

    public void main(String[] args) {


        //Create your class object
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel.add(colorTwo);
        panel.add(colorThree);
        window.add(panel);
        panel = new JPanel();

        colorClicker.addActionListener(new Changer());
        colorTwo.addActionListener(new buttonTwo());
        colorThree.addActionListener(new buttonThree());

        window.add(panel);
        window.setVisible(true);


    }


    private class Changer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color ChangerPanel = new Color(25, 30, 35);
            Color TwoButton = new Color(25, 30, 35);
            Color ThreeText = new Color(25, 30, 35);

            colorTwo.setBackground(TwoButton);
            colorThree.setForeground(ThreeText);

            panel.setBackground(ChangerPanel);
        }
    }

        private class buttonTwo implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color ColorChanger = new Color(257, 30, 35);
                Color buttonTwo = new Color(25, 30, 35);
                Color buttonThree = new Color(25, 30, 35);

                colorClicker.setBackground(buttonTwo);
                colorThree.setForeground(buttonThree);

                        panel.setBackground(ColorChanger);


            }
    }
        private class buttonThree implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color ColorThree = new Color(26, 30, 35);
                Color buttonTwo = new Color(25, 30, 35);
                Color buttonThree = new Color(25, 30, 35);

                colorClicker.setBackground(buttonTwo);
                colorTwo.setForeground(buttonThree);

                panel.setBackground(ColorThree);
            }
        }
}

