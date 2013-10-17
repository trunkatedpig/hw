import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Pictures p = new Pictures();

	System.out.println("diag(6): \n" + p.diag(6));
	System.out.println("diag(0): \n" + p.diag(0));
	System.out.println("diagWord(\"hello\"): \n" + p.diagWord("hello"));
	System.out.println("diagWord(\"\"): \n" + p.diagWord(""));
	System.out.println("fence(4,4): \n" + p.fence(4,4));
	System.out.println("fence(0,1): \n" + p.fence(0,1));
	System.out.println("fence(2,2): \n" + p.fence(2,2));	

    }
}
