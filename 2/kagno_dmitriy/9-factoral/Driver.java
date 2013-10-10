import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	
        facotial f = new facotial();
	System.out.println(f.nfact1(3));
	System.out.println(f.nfact1(4));
	System.out.println(f.nfact1(5));
	System.out.println("-------------------");
	System.out.println(f.nfact2(3));
	System.out.println(f.nfact2(4));
	System.out.println(f.nfact2(5));
    }
}
