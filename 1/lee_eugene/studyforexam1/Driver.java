//Driver

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {

	Turtle A, B;

	A = new Turtle("Sydney", 16, 12);
	System.out.println("Turtle A's name is " + A.getName());
	System.out.println(A.getName() + "'s speed is " + A.getSpeed());
	System.out.println(A.getName() + "'s age is " + A.getAge());


	B = new Turtle("Mr. Z", 299, 137872);
	System.out.println("Turtle B's name is " + B.getName());
	System.out.println(B.getName() + "'s speed is " + B.getSpeed());
	System.out.println(B.getName() + "'s age is " + B.getAge());


    }
}
