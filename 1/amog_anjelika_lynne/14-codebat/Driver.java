import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Stringthing st = new Stringthing();
	String s = "xy*yzz";
      	System.out.println(st.toleftChar(s));
	System.out.println(st.torightChar(s));
	System.out.println(st.sameChar(s));
	st.test(s);
    }
}