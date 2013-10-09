import java.io.*;
import java.util.*;

public class Driver{

    public static void main (String [] args){
		/*StringStuff s1;		
		s1=new StringStuff();
		String namae1="emma lou";
		s1.indexHolder(namae1);
		System.out.println(s1.capitalize(namae1));
		
		System.out.println(s1.bondify(namae1));*/
		
		pigLatinify pl1;
		pl1=new pigLatinify();
		System.out.println(pl1.pigLatin("cookies"));
		System.out.println(pl1.pigLatin("emus"));
		System.out.println(pl1.pigLatin("apples"));
		System.out.println(pl1.pigLatin("tree"));
		System.out.println(pl1.pigLatin("knife"));
	}
}