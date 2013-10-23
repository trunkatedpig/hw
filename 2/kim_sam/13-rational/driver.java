import java.io.*;
import java.util.*;

public class driver {
    public static void main(String[] args) {
	rational r1, r2;
	r1 = new rational(16,3);
	r2 = new rational(7,2);

	System.out.println(r1.getTop() + "/" + r1.getBot() + "=" + r1.getFrac() + "\n");
	System.out.println(r2.getTop() + "/" + r2.getBot() + "=" + r2.getFrac() + "\n");
	System.out.println("It is " + r1.equals(r2) + " that " + 
			   r1.getTop() + "/" + r1.getBot() + " is equal to " +
			   r2.getTop() + "/" + r2.getBot() + "\n");
	System.out.println(r1.getTop() + "/" + r1.getBot() + " times " + 
			   r2.getTop() + "/" + r2.getBot() + " = " + 
			   r1.mult(r2).getFrac() + "\n");
	System.out.println("If both fractions are equal, 0 will return. " + 
			   "If r1 > r2, 1. If r1 < r2, -1. ---->" + 
			   r1.getTop() + "/" + r1.getBot() + " vs " + 
			   r2.getTop() + "/" + r2.getBot() + " : " + 
			   r1.compareTo(r2));
    }
}