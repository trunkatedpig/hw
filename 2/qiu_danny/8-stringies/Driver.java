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
    }
}
