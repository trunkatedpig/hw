import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Loops a = new Loops();
	System.out.println(a.diag(5));
	System.out.println(a.diag(2));

	System.out.println(a.diagWord("HEllo"));
	System.out.println(a.diagWord("abcdefghi"));

	System.out.println(a.fence(5,5));
	System.out.println(a.fence(1,0));
	System.out.println(a.fence(2,9));
    }
}