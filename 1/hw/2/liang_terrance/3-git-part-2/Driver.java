import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Greeter a,b;
		String hresult, sresult;
		
		a = new Greeter ();
		hresult = a.happyGreet ("John");
		sresult = a.sadGreet ("Joanna");
		System.out.println (hresult);
		System.out.println (sresult);
		
		b = new Greeter ("Welcome", "Go away");
		hresult = b.happyGreet ("Michael");
		sresult = b.sadGreet ("Michelle");
		System.out.println (hresult);
		System.out.println (sresult);
	}
}
