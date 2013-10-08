import java.io.*; 
import java.util.*;

public class Driver {
    
    public static void main (String[] args) {
	

	Greeter2 a = new Greeter2(); 

	a.setup();

	System.out.println(a.happyGreet()); 
	System.out.println(a.sadGreet()); 

    
	a.setGreet ("YOLO", "NOLO"); 

	System.out.println(a.happyGreet()); 
	System.out.println(a.sadGreet()); 

    }
}
