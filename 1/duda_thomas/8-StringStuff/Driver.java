import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
        StringStuff one = new StringStuff();
        System.out.println(one.capitalize("charlie chaplin"));
        System.out.println(one.bondify("david draiman"));
        System.out.println(one.PigLatinize("shoe"));
	System.out.println(one.PigLatinize("egg"));
	System.out.println(one.PigLatinize("wry"));
	System.out.println(one.PigLatinize("game"));
    }
}

