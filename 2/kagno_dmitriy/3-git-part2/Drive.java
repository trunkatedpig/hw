import java.io.*;
import java.util.*;

public class Drive {
    public static void main(String[] args) {
	Greet g,h;
	String result;

	g = new Greet("I hate you","Howdy partner");
	h = new Greet();
	System.out.println(g.Sgree("Tom"));
	System.out.println(g.Hgree("Mike"));
	System.out.println(h.Sgree("Sarah"));	
	System.out.println(h.Hgree("Jamie"));

    }
}
