import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Cypher c = new Cypher();
	//System.out.println(""+(char)('c'+5));
	System.out.println(c.encode("hello",3));
	System.out.println(c.encode("abcxyz",3));
    }
}
