import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c1;
	c1 = new Coin(5, 2, 3, 50);
	System.out.println(c1.getFace());
	c1.coinReset();
	System.out.println(c1.getFlips());
    }
}
    