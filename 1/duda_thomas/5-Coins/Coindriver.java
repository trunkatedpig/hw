import java.io.*;
import java.util.*;

public class Coindriver {
    public static void main (String [] args) {

        Coin c;

        c = new Coin ();
        c.setCount();

        System.out.println(c.getTotalFlips());
        System.out.println(c.getHeads());
        System.out.println(c.getTails());
        System.out.println(c.getHeadPercent());

        System.out.println("----------------------------");

        c.resetCount();

        System.out.println(c.getTotalFlips());
        System.out.println(c.getHeads());
        System.out.println(c.getTails());
        System.out.println(c.getHeadPercent());
    }
}
