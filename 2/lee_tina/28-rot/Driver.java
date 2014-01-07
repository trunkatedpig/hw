import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Rot r = new Rot();
	System.out.println(r.encode("hello",3));
	System.out.println(r.encode("abcxyz",3));
	System.out.println(r.encode("hi there!",1));
    }
}
