import java.io.*;
import java.util.*;

public class StringStuff {
    private String a,b,c,d,e,f;
    private int z;
    public String capitalize(String name){
	a=name;
	z=a.indexOf(" ");
	b=(a.substring(0,1)).toUpperCase();
	c=a.substring(1,z+1);
	d=(a.substring(z+1,z+2)).toUpperCase();
	e=a.substring(z+2);
	f=b+c+d+e;
	return f;

    }
    public String bondify(String name) {
	a=name;
	z=a.indexOf(" ");
	b=a.substring(z+1);
	f=b+", "+a+".";
	return f;

    }
}