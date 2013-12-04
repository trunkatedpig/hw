import java.io.*;
import java.util.*;

public class Driver{

    public static void main (String [] args){
		pigLatinify pl1;
		pl1=new pigLatinify();
		System.out.println(pl1.pigLatin("cookies"));
		System.out.println(pl1.pigLatin("emus"));
		System.out.println(pl1.pigLatin("apples"));
		System.out.println(pl1.pigLatin("tree"));
		System.out.println(pl1.pigLatin("knife"));
	}
}
