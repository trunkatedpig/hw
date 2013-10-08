import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff r=new StringStuff();
	
	System.out.println(r.capitalize("jiminy cricket"));
	System.out.println(r.capitalize("abed nadir"));
	System.out.println(r.bondify("Barney Stinson"));
        System.out.println(r.bondify("ayyo baby"));

    }
}