import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String args[]) {
	Stuff s = new Stuff(); 

	System.out.println(s.diag(5));
	System.out.println(s.diagWord("Cows make the world go round"));
	System.out.println(s.fence(5,20));
    }
}