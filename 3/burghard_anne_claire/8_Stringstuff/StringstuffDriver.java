import java.io.*;
import java.util.*;

public class StringstuffDriver {

    public static void main(String[] args){
	Stringstuff s = new Stringstuff();
	System.out.println(s.capitalize("claire burghard"));
	System.out.println(s.bondify("Nina Svirsky"));
	System.out.println(s.piglatinify("animalia"));
	System.out.println(s.piglatinify("uranus"));
	System.out.println(s.piglatinify("frites"));
    } 
}
