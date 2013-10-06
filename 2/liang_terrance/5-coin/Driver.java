import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){
	Coin c;
	c = new Coin();
	c.setFace("Heads");
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	System.out.println("Heads have been flipped " + c.getHeads() + " times.");
	System.out.println("Tails have been flipped " + c.getTails() + " times.");
	
    }

}
