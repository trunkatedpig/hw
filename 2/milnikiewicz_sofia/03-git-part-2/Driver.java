import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter h,s;
	String hresult,sresult;

	h = new Greeter();
        hresult = h.happyGreet ("Fish");
	sresult = h.sadGreet("Fishy");
	System.out.println (hresult);
	System.out.println (sresult);

	s = new Greeter("You smell nice", "You smell horrible");
        hresult = s.happyGreet ("Dan");
	sresult = s.sadGreet("Horace");
	System.out.println (hresult);
	System.out.println (sresult);
    }
}
