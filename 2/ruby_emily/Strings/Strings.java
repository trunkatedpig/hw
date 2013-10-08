import java.io.*;
import java.util.*;

public class Strings{
    private String name;

    public String stringCapitalize(String n){
	String s,i,s1;
	s=n.substring(0,1).toUpperCase();
	i=n.indexOf(" ");
	s1=(i+1).toUpperCase();
	name=n;
	return s+ (n.substring(1,i))+s1 + (n.substring(i+1);
    }
    public String getName(){
	return name;
    }

}
