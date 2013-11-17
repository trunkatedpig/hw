import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Coin coin = new Coin();
	System.out.println("The side is" + " " + coin.getSide());

	coin.heads = 1;
	System.out.println("The head count is" + " " + coin.heads);
	coin.reset();
	System.out.println("The head count is" + " " + coin.heads);
<<<<<<< HEAD
=======
    coin.flip();
    System.out.println(coin.getSide());
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
