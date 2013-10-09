import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Coin A = new Coin(0.005);
	Coinpurse LV = new Coinpurse();
	System.out.println(A.getHeads());
	System.out.println(A.getTails());
	System.out.println(A.getFace());
	System.out.println(A.getAmount());
	A.flip();
	A.flip();
	A.flip();
	A.flip();
	A.flip();
	A.flip();
       	System.out.println(A.getHeads());
	System.out.println(A.getTails());
	System.out.println(A.getFace());
	LV.addTo(A);
	System.out.println(LV.getAmount());
	LV.addTo(new Coin(0.25));
	System.out.println(LV.getAmount());
    }
}