import java.io.*;
import java.util.*;

public class Driver {
       public static void main(String[] args){
	   StringStuff s;
	   s= new StringStuff();
	   System.out.println(s.capitalize("emily ruby"));
	   System.out.println(s.bondify("natalie ruby"));
	   System.out.println(s.PigLatinify("brusque"));
	   System.out.println(s.PigLatinify("apple"));
	   System.out.println(s.PigLatinify("Always"));
	  
	   
       }
}
