import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin g = new Coin();
	g.Flip();
	System.out.println(g.getHeads());
	System.out.println(g.getTails());
	System.out.println(g.getFlips());
	System.out.println(g.getFairness());
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	System.out.println(g.getHeads());
	System.out.println(g.getTails());
	System.out.println(g.getFlips());
	System.out.println(g.getFairness());
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	System.out.println(g.getHeads());
	System.out.println(g.getTails());
	System.out.println(g.getFlips());
	System.out.println(g.getFairness());
}}
