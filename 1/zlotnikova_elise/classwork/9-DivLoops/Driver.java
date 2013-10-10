import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Numbers n = new Numbers();
	System.out.println(n.GCD2(8,12));
	System.out.println(n.GCD2(13,7));
	System.out.println(n.GCD2(12,12));
	System.out.println(n.GCD2(82,85));
    }
}
