import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing Coin Class *-*");
		System.out.println();

/* Creates random function for variable r in the interval 0-1 */
		Random generator = new Random();

/* Coin flip of c1 */
		Coin c1;
		c1 = new Coin();
		double z;

		z = generator.nextDouble();
		c1.setCurrentFace(z);
		c1.flipCoin();
		System.out.println(" Coin Flipped ");
		System.out.println(" Coin Face: " + c1.getFace());
		System.out.println(" Total Coin Flips: " + c1.getFlipCount());
		System.out.println(" Total Heads Count: " + c1.getHeadCount());
		System.out.println();


		z = generator.nextDouble();
		c1.setCurrentFace(z);
		c1.flipCoin();
		System.out.println(" Coin Flipped ");
		System.out.println(" Coin Face: " + c1.getFace());
		System.out.println(" Total Coin Flips: " + c1.getFlipCount());
		System.out.println(" Total Heads Count: " + c1.getHeadCount());
		System.out.println();

		z = generator.nextDouble();
		c1.setCurrentFace(z);
		c1.flipCoin();
		System.out.println(" Coin Flipped ");
		System.out.println(" Coin Face: " + c1.getFace());
		System.out.println(" Total Coin Flips: " + c1.getFlipCount());
		System.out.println(" Total Heads Count: " + c1.getHeadCount());
		System.out.println();


		c1.adjustProb();
		System.out.println(" Probability of Coin Landing on Heads: " + c1.getProb());
		System.out.println();


		System.out.println(" Reset Counts ");
		c1.resetCounts();
		System.out.println(" Total Coin Flips: " + c1.getFlipCount());
		System.out.println(" Total Heads Count: " + c1.getHeadCount());
		System.out.println();

	}
}