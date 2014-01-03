import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("*-* Testing class Cipher *-*");
        System.out.println();

        Cipher c = new Cipher();

        System.out.println("Original Word: AnNa");
        System.out.println("Character Offset by 2");
        String word = c.caesarEncode("AnNa",2);
        System.out.println("Caesar Word: " + word);
        System.out.println();

        System.out.println("Original Word: ELEphAnt");
        System.out.println("Character Offset by 15");
		word = c.caesarEncode("ELEphAnt",15);
        System.out.println("Caesar Word: " + word);
        System.out.println();

        System.out.println("Original Sentence: I'm almost a second-term senior!");
        System.out.println("Character Offset by 10");
		word = c.caesarEncode("I'm almost a second-term senior!",10);
        System.out.println("Caesar Word: " + word);

    }
}

