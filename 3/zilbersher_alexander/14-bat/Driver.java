import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	CodingBat c = new CodingBat();
	System.out.println(c.sameStarChar("xy*yzz"));
	System.out.println(c.sameStarChar("xy*zzz"));
	System.out.println(c.sameStarChar("*xa*az"));
	System.out.println(c.sameStarChar("*xa*bz"));
	System.out.println(c.sameStarChar("*xa*a*"));
	System.out.println(c.sameStarChar(""));
	System.out.println(c.sameStarChar("*xa*a*a"));
	System.out.println(c.sameStarChar("*xa*a*b"));
	System.out.println(c.sameStarChar("*12*2*2"));
	System.out.println(c.sameStarChar("12*2*3*"));
	System.out.println(c.sameStarChar("abcDEF"));
	System.out.println(c.sameStarChar("XY*YYYY*Z*")); 
	System.out.println(c.sameStarChar("XY*YYYY*Y*")); 
	System.out.println(c.sameStarChar("12*2*3*"));
	System.out.println(c.sameStarChar("*"));
	System.out.println(c.sameStarChar("**"));
	System.out.println(c.sameEnds("abXYab"));
	System.out.println(c.sameEnds("xx"));
	System.out.println(c.sameEnds("xxx"));
	System.out.println(c.sameEnds("xxxx"));
	System.out.println(c.sameEnds("javaXYZjava"));
	System.out.println(c.sameEnds("javajava"));
	System.out.println(c.sameEnds("xavaXYZjava"));
	System.out.println(c.sameEnds("Hello! and Hello!"));
	System.out.println(c.sameEnds("x"));
	System.out.println(c.sameEnds(""));
	System.out.println(c.sameEnds("abcb"));
	System.out.println(c.sameEnds("mymmy"));
    }
}