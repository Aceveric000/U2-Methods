import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {
    static double price20 = 0.99;
    static double price16 = 0.50;
    static double tax = 7.5;


    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {
        int num16 = Integer.parseInt(JOptionPane.showInputDialog(" How many sixteen ounce drinks would you like? "));
        double num20 = Double.parseDouble(JOptionPane.showInputDialog(" How many twenty ounce drinks would you like? "));

        calculateCost(num16, (int) num20);
    }



    private static void calculateCost(int num16, int num20) {
        DecimalFormat round = new DecimalFormat("#,###.00");

      double cost16 = num16 * price16;
      double cosr20 = num20 * price20;

      double total16 = cost16 * (1+(tax/100));
      double total20 = num20 * (1+ (tax/100));

      double total = total16 + total20;

      String message = "Your order:";
      message += "\n\t16 oz: " + num16;
        message += "\n16 oz: " + num16;
        message += "\n120 oz : " + num20;



        JOptionPane.showMessageDialog(null, "The total for sixteen ounce drinks is " + total);


    }
    }



