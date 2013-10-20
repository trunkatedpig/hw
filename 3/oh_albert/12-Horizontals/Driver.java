import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Diag d1,d2;

	d1 = new Diag();
	String return1 = d1.Diag(5);
	System.out.println(return1);

	d2 = new Diag();
	String return2 = d2.diagWord("success");
	System.out.println(return2);
    }
}
