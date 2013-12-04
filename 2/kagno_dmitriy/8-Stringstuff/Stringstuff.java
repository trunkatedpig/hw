import java.io.*;
import java.util.*;

public class Stringstuff {
    private String s,s1,s2,s3,s4;
    private int i;
    
    public String Capitalize(String name){
        s = name;
	i = s.indexOf(" ");
	s1 = s.substring(0,1);
 
	s1 = s1.toUpperCase();
	
	s2 = s.substring(1,i);
	s3 = s.substring(i+1,i+2);
	s3 = s3.toUpperCase();
	s4 = s.substring(i + 2);
	s = s1+s2+" "+s3+s4;
	return s;
    }

    public String bondify(String name){
	s = name;
	i = s.indexOf(" ");
	s1 = s.substring(0,1);
 
	s1 = s1.toUpperCase();
	
	s2 = s.substring(1,i);
	s3 = s.substring(i+1,i+2);
	s3 = s3.toUpperCase();
	s4 = s.substring(i + 2);
	s = s3+s4+", "+s1+s2+" "+s3+s4;
	return s;
    }
}
