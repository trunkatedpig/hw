import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin coin = new Coin();
	System.out.println("This flip has returned " + coin.getSide());
	/*if*/
	coin.side = "heads"
	System.out.println("The heads count is now" + coin.heads)
	/*if*/
	coin.reset();
	System.out.println("There have been no flips thus far")
