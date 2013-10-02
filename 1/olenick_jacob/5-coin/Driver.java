import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Coin A = new Coin();
	System.out.println(A.getHeads());
	System.out.println(A.getTails());
	System.out.println(A.getFace());
	A.flip();
	A.flip();
	A.flip();
	A.flip();
	A.flip();
	A.flip();
       	System.out.println(A.getHeads());
	System.out.println(A.getTails());
	System.out.println(A.getFace());

    }
}