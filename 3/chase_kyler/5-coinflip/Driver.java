import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Coin c, c2;
		c = new Coin();
		c2 = new Coin(60);
		System.out.println(c.flipCoin());
		System.out.println(c2.flipCoin());

	}
}
