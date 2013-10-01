import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args) {
	Coin a,b;
	a = new Coin();
	a.flips = 10;
	a.percentage = 20;
	a.tails = 30;
	a.reset();
	a.face("heads");
	System.out.println(a.Face);
    }
}
