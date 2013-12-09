import java.io.*;
import java.util.*;

public class StringStuff{
    private String name;
    
    public StringStuff(String localname){
	name = localname;
    }

    public String getName(){
	return name;
    }

    public String capitalize(String name){
	int spacelocation;
	String s1,s2,s3,s4;
	spacelocation = name.indexOf(" ");
	s1 = name.substring(1,spacelocation+1);
	s2 = name.substring(spacelocation + 1,spacelocation + 2);
	s2 = s2.toUpperCase();
	s3 = name.substring(0,1);
	s3 = s3.toUpperCase();
	s4 = name.substring(spacelocation + 2);
	return s3 + s1 + s2 + s4;
    }

    public String bondify(String name){
	int spacelocation;
	String s1,s2;
	s1 = capitalize(name);
	spacelocation = s1.indexOf(" ");
	s2 = s1.substring(0,spacelocation);
	s2 = s2 + ", ";
	return s2 + s1;
    }





}
