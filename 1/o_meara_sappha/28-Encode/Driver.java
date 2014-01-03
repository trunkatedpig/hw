import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
	Encode e = new Encode();
        System.out.println(e.encode("hello",4));
	//should return lipps
        System.out.println(e.encode("abcde",5));
	//should return fghij
	System.out.println(e.encode("fghij", -5));
	//should return abcde
    }

}
