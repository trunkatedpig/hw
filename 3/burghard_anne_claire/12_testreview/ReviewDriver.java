import java.util.*;
import java.io.*;

public class ReviewDriver {
    public static void main (String [] args) {

	Review r = new Review();

	System.out.println(r.diag(16));
	System.out.println(r.diagWord("Diagonal!"));
	System.out.println(r.fence(12,19));
    }
}
