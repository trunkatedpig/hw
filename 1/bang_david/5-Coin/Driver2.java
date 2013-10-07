import java.io.*;
import java.util.*;

public class Driver2 {
    public static void main(String[] args) {
    Coin c;
    c = new Coin();
    c.setFace ("High");
    
    System.out.println (c.getFace ());

    c.resetCount ();

    System.out.println (c.getFace ());
    }
}
