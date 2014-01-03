import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Encoder e = new Encoder();
	System.out.println(e.encode("hello", 0));
	System.out.println(e.encode("hello", 4));
	System.out.println(e.encode("hello", 13));
	System.out.println(e.encode("hello", 25));
    }
}
