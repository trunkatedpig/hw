import java.io.*;
import java.util.*;

public class Stringthing{
    public boolean sameStarChar(String str){
	return true;
    }
    public String toleftChar(String s){
	int star = s.indexOf("*");
	return s.substring(star - 1, star);
    }
    public String torightChar(String s){
	int star = s.indexOf("*");
	return s.substring(star + 1, star + 2);
    }
    public boolean sameChar(String s){
	return this.toleftChar(s).equals(this.torightChar(s));
    }
    public void test(String s){
	int star = s.indexOf("*");
	System.out.println(this.toleftChar(s));
	System.out.println(this.torightChar(s));
	System.out.println(this.sameChar(s));
	System.out.println(s.substring(star + 1));
    }
}