import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){

	stringStuff n;
	n = new stringStuff();
	System.out.println(n.capitalize("mike zamansky"));
	System.out.println(n.bondify("mike zamansky"));
	System.out.println(n.pigLatinify("Position"));
	System.out.println(n.pigLatinify("Apple"));
	System.out.println(n.pigLatinify("Check"));
    }
}
