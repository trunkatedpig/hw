import java.io.*;
import java.util.*;

public class Stringstuff{
    public String string; 
    public String capitalize(String name){
	return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
    public String bondify (String name) {
	name = capitalize(name);
	int a = name.indexOf(" ");
	String b = name.substring(a+1);
	String result = b + ", " + name;
	return result;
    }
}