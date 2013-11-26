import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args) {
	Coin a,b;
	a = new Coin();
	a.setFace = "tails";
	a.flips = 10;
	a.percentage = 20;
	a.tails = 30;
	a.reset();
	a.setFace("heads");
	System.out.println(a.Face);
	b = new Coin();
	System.out.println(b.Name);
	System.out.println(b.amount);
	System.out.println(b.Face);
	System.out.println(b.percentage);
	b.Flip();
	System.out.println(b.Face);
	System.out.println(b.flips);
    }
}
