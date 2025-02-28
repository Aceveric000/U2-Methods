import           javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;
    Color panelBackground = new Color(33,33,33);
    Color buttonColor = new Color(142, 37, 37);
    Color buttonBack = new Color(99,99,99);
    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */
    public ChangingColorsGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        //create a new Custom color


        panel.setBackground(panelBackground);
        colorClicker.setForeground(buttonColor);
        colorClicker.setBackground(buttonBack);

        colorClicker.addActionListener(new ColorChanger());

        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked

    private class ColorChanger implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(panelBackground);
            colorClicker.setForeground(buttonColor);
            colorClicker.setForeground(buttonBack);

        }

    }


}