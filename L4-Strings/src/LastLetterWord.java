import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */
    // get the input only 3
    // isolate the last 3 any word
    // combine #2 pf all three words
    //runn itttttttttttttttt



    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("enter word one ");
        String word2 = JOptionPane.showInputDialog("enter word two ");
        String word3 = JOptionPane.showInputDialog("word three ");

        String output = lastLetters(word1) + lastLetters(word2) + lastLetters(word3);
        JOptionPane.showMessageDialog(null, output);
    }

    public static String lastLetters(String word){

        return word.substring(word.length()-3);

    }

}
