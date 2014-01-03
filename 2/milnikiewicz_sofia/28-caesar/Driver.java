import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Caesar c = new Caesar();
	System.out.println(c.encode("Zoidberg", 3));
	System.out.println(c.encode("FISH", 6));
    }
}
