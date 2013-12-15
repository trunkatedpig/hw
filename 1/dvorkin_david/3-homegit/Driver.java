import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        Greeter g,g2;

        String result;
        g = new Greeter("Yo", "QQ");
        g2 = new Greeter();
        System.out.println(g.sadgreet("Alla"));
        System.out.println(g2.happygreet("Eugene"));
    }
}
