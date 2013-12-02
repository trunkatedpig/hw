import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Greeter g,g2;
        String ans;
        g = new Greeter();
        g.setHappy("hiya");
        g.setSad("I don't like you all too much");
        g2 = new Greeter();
        ans = g.happyGreet("Fred");
        System.out.println(ans);
        ans = g.sadGreet("Fred");
        System.out.println(ans);
        ans = g2.happyGreet("Sarah");
        System.out.println(ans);
        ans = g2.sadGreet("Sarah");
        System.out.println(ans);
     }
}
