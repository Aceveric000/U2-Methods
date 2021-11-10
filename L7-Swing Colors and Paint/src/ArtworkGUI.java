import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES

    public ArtworkGUI() {
        JFrame frame;

        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new SimpleDrawingGUI.DrawingPanel();

        frame.add(panel);
        frame.setVisible(true);
        //CREATE THE GUI
    }

    private class MyDrawing extends JPanel {
        public MyDrawing() {
            //Set the background color
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g) {

            super.paintComponent(g);


            Color cool_blue = new Color(25, 62, 4);
            g.fillRect(400, 400, 400, 400);
            g.setColor(cool_blue);
            g.fillRect(1, 450, 400, 300);


            Color wood = new Color(202, 164, 114);
            g.setColor(wood);
            g.fillRect(150, 300, 100, 150);


            Color sun = new Color(244, 246, 240);
            g.setColor(sun);
            g.fillRect(10, 10, 50, 50);

            Color Start = new Color(147, 185, 223);
            g.setColor(Start);
            g.drawLine(250, 300, 60, 200);


            Color end = new Color(13, 28, 44);
            g.setColor(end);
            g.drawLine(250, 1, 60, 200);


            g.fillRect(130, 150, 150, 150);


        }
    }
}
