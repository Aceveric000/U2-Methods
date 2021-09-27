import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame
{

    public static void main(String[] args)
    {
        JFrame window = new JFrame("thia is a simple method ");
        JPanel panel = new JPanel();
        JButton button = new JButton("wsp foo catch me");


        window.setSize(800, 600);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //window
        button.addActionListener(new buttonListener());
        window.setLocationRelativeTo(null);

        panel.add(button);
        window.add(panel);

        window.setVisible(true);
    }

    static class buttonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Why you click me ");
        }
    }
}
