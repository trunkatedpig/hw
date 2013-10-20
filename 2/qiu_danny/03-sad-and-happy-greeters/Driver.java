import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Greeter g, g2;

        g = new Greeter();
        System.out.println(g.happyGreet("Bob"));
        System.out.println(g.sadGreet("Tom"));

        g2 = new Greeter("You are amazing,", "You suck,");
        System.out.println(g2.happyGreet("Mary"));
        System.out.println(g2.sadGreet("Erica"));
    }
}
