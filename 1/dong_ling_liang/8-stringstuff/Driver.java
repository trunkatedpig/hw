import java.io.*;
import java.util.*;

public class Driver { 
    public static void main(String[] args){
	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("james bond"));
	System.out.println(s.capitalize("James Bond"));
	System.out.println(s.capitalize("sanghyeok lee"));
	System.out.println(s.bondify("sanghyeok lee"));
	System.out.println(s.bondify("first last"));
    }
}