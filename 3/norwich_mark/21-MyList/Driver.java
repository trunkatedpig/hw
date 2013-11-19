import java.util.*; 
import java.io.*; 

public class Driver{
    public static void main (String[] args){ 
	MyList List = new MyList(); 
	Random r = new Random(); 
	int a = r.nextInt(30);
	System.out.println("Removing index" + a + "from list"); 
	System.out.println("The original list" + List.toString());
	System.out.println("Magic is happening" + List.remove(a));
	System.out.println("Voila" + List.toString()); 
    }
}
