import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        StringStuff s;
        String input;

        s = new StringStuff();

        if (args.length == 2) {
            input = args[0] + " " + args[1];
        }
        else {
            input = "danny qiu";
        }

        System.out.println("CAPS: " + s.capitalize(input));
        System.out.println("BOND: " + s.bondify(input));

        System.out.println("PIGLATIN: apple - " + s.pigLatinfy("apple"));
        System.out.println("PIGLATIN: potato - " + s.pigLatinfy("potato"));
        System.out.println("PIGLATIN: troll - " + s.pigLatinfy("troll"));
        System.out.println("PIGLATIN: three - " + s.pigLatinfy("three"));

        if (args.length == 1) {
            input = args[0];
            System.out.println("PIGLATIN: (input) - " + s.pigLatinfy(input));
        }
    }
}
