import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	letters i = new letters();
	System.out.println(i.rearrange(0, "hello"));
	System.out.println(i.rearrange(4, "hello"));
	System.out.println(i.rearrange(12, "hello"));
	System.out.println(i.rearrange(15, "hello"));
	System.out.println(i.rearrange(37, "hello")); // hmmm does this work right?
    }
}
