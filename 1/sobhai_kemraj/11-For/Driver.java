import java.io.*;
import java.util.*;

public class Driver{

	public static void main (String[] args){
		//Testing out the Reverse Method
		For forloop;

		forloop = new For();

		String output = forloop.Reverse("Hello");
		System.out.println(output);

		String output1 = forloop.Reverse("Hello  ");
		System.out.println(output1);
		//Seems to be working fine
	}

}
