import java.util.*;
import java.io.*;

public class Hello{
    public static void main(String[] args){
	ArrayList<String> a = new ArrayList<String> (10);
	a.add("The boy");
	a.add("who lived");
	a.add("was Harry");
	a.add("James Potter");
	a.add("Ronald Weasley");
	a.add("Hermione Granger");
	a.add("Were his best");
	a.add("friends");
	a.add("And Voldemort");
	a.add("his enemy");
	System.out.println(a);
	a.set(2,"Severus Snape");
	System.out.println(a);
	System.out.println(a.get(8));
	System.out.println(a.size());
	a.remove(2);
	System.out.println(a.size());
	System.out.println(a.subList(0,5));
	System.out.println(a.isEmpty());

	
    }
}
	
	
