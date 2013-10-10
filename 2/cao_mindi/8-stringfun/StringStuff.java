import java.io.*;
import java.util.*;

public class StringStuff{

    private String f;
    private String l;
    private int x;
    
    public String capitalize(String name){
	x = name.indexOf( " ");
	f = name.substring(0);
	l = name.substring(x, x + 1);
        return f + name.substring(1, x + 1) + l + name.substring(x + 2);
    }
   
   public String bondify(String name){
       x = name.indexOf(" ");
       return name.substring(0, x) + name;
    }
}

