import java.util.*;
import java.io.*;

public class stringDriver{
    public static void main (String[] args){
	myStringList L = new myStringList();
	L.add("Harry");
	L.add("Potter");
	L.add("Ron");
	L.add("Weasley");
	L.add("Hermione Granger");
	System.out.println(L);
	L.add(5,"Lord");
	L.add(6,"Voldemort");
	L.add(1,"Snape");
	System.out.println(L);
	L.remove(0);
	L.fremove("Snape");
	System.out.println(L);
	System.out.println(L.find("Weasley"));
	System.out.println(L);
	System.out.println(L.get(4));
	L.set(5,"Dumbeldore");
	System.out.println(L);
	System.out.println(L.size());
			   
			
    }
}
