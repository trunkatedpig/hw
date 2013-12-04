import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
<<<<<<< HEAD
	Coin one;
	one = new Coin();
	System.out.println(one.getFace());
    }
=======
	Coin head1 = new Coin();
	String s = new String("Tails");
	Coin tail1 = new Coin(s);
	s = new String ("Heads");
	Coin head2 = new Coin (s);

	System.out.println("Before flip");
	System.out.println(head1.getFace()+" "+tail1.getFace()+" "+head2.getFace());

	head1.flip();
	tail1.flip();
	head2.flip();
	

	System.out.println("After flip");
	System.out.println(head1.getFace()+" "+tail1.getFace()+" "+head2.getFace());

/* //equals. and compareTo. tests
	System.out.println(head1.equals(tail1));
	System.out.println(head1.equals(head2));
	System.out.println(tail1.equals(head2));
	System.out.println(head2.equals(head1));
	
	System.out.println();
	
	String s1 = "abcde";
	String s2 = "defghi";
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
	System.out.println(s1.compareTo(s1));
	
	System.out.println("a".compareTo("b"));
	System.out.println("b".compareTo("a"));
	System.out.println("A".compareTo("a"));
	*/
    }


>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
}
