import javafx.beans.binding.ListExpression;

import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    // get the input
    // isolate the p
    // only use those three letter after
    // output the mf results



    public static void main(String[] args) {
        String words =  JOptionPane.showInputDialog("enter word one ");
        String output = theP(words);
        JOptionPane.showMessageDialog(null, output);


    }
        public static String theP(String words){
        int Pindex = words.indexOf("p");

        String split = words.substring(Pindex , Pindex + 4);

        return split;

    }

}
