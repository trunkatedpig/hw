import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Diag d1,d2,d3,d4;

	d1 = new Diag();
	String return1 = d1.Diag(5);
	System.out.println(return1);

	d2 = new Diag();
	String return2 = d2.diagWord("success");
	System.out.println(return2);

	d3 = new Diag();
	String return3 = d3.fence(8,6);
	System.out.println(return3);

        d4 = new Diag();
	String return4 = d4.fence(1,1);
	System.out.println(return4);
    }
}
