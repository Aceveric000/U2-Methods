import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {
        String name = "big";
        String greeting = "hello";

        //style 1
        int stringSize = name.length();
        System.out.println(name + " has " + stringSize + " letters");

        //style 2
        System.out.println(name + " has " + name.length() + " Letters ");

        System.out.println(greeting + " has " + greeting.length() + " letters ");


        ///finna make a program that capitolizes

        // numa 1
        // 1. get input
        // 2. get the first letter
        // 3. capitalize it
        // 4. isolate the rest of the letters
        // 5. put them together
        // 6. run that mf

        System.out.println(capFirst(name));

    }
    public static String capFirst(String name) {

        String letter = name.substring(0, 1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);
    }
}
