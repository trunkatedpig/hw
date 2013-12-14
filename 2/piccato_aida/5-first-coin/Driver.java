import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin face, flips;
	String result;
	int result2;
	face = new Coin();
	face.setFace("heads");
        result = face.getFace();
	System.out.println(result);
	flips = new Coin();
	flips.setFlips(10);
	result2 = flips.getFlips();
	System.out.println(result2);
	flips.reset();
	result2 = flips.getFlips();
	System.out.println(result2);

    }
}
