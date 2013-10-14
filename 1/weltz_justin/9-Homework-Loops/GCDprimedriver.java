import java.io.*;
import java.util.*;

public class GCDprimedriver{
    public static void main (String [] args){
	GCD g = new GCD();
	GCD g2 = new GCD();
	GCD g3 = new GCD();
	
	System.out.println(g.GCD(5,10));
	System.out.println(g.GCD(8,50));
        System.out.println(g2.GCD2(5,10));
	System.out.println(g2.GCD2(8,50));
	System.out.println(g3.Prime(19));
	System.out.println(g3.Prime(10));
    }
}
