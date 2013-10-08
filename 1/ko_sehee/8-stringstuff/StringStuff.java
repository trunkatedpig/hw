import java.io.*;
import java.util.*;

public class StringStuff{
    private String name1, name2,full;
    private int sp;
    public String capitalize(String name){
	sp = name.indexOf(" ");
	name1= name.substring(0,1);
	name2= name.substring(sp + 1, sp + 2);
	name1 = name1.toUpperCase();
	name2 = name2.toUpperCase();
	full = name1 + name.substring(1,sp) + " " + name2 + name.substring(sp + 2);
	return full;
    }
    public String bondify(String name){
	sp = name.indexOf(" ");	
	name1= capitalize(name);
	full= name1.substring(sp + 1) + ", " + name1;
	return full;
    }
	 
}

	
	
