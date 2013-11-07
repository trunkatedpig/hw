import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Driver{
    public static void main (String[] args){
	Arrays2 a = new Arrays2();
	System.out.println(Arrays.toString(a.RevFill(7))); 
	System.out.println(Arrays.toString(a.makeRandom(5,22,60)));
    }
}
