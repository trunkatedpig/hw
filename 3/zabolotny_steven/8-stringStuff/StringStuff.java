import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name) {
	int space = name.indexOf(" ");
	String fletter = name.substring(0,1).toUpperCase();
	String fname = name.substring(1,space);
	String sletter = name.substring(space + 1,space + 2).toUpperCase();
	String sname = name.substring(space + 2);
       	return fletter + fname + " " +  sletter + sname;
    }
    public String bondify(String name) {
	int space = name.indexOf(" ");
	String fname = name.substring(0,space);
	String sname = name.substring(space + 1);
	return sname + ", " + fname + " " + sname;
    }
    public String PigLatinify(String name) {
	int a = name.indexOf("a");
	int e = name.indexOf("e");
	int i = name.indexOf("i");
	int o = name.indexOf("o");
	int u = name.indexOf("u");
	int ae = Math.min(a,e);
	int aei = Math.min(ae,i);
	int aeio = Math.min(aei,o);
	int firstvowel = Math.min(aeio,u);
	if (firstvowel == 0) {
		name = name + "yay";
	    }
	else {
	    String firstgroup = name.substring(0,firstvowel);
	    String postgroup = name.substring(firstvowel);
	    name = postgroup + firstgroup + "ay";
	}
	return name;
    }
}