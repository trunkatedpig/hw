import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayStuff as = new ArrayStuff();
	int[] b = new int[20];
	b[0]=9;
	b[1]=2;
	b[2]=5;
	b[3]=4;
	b[4]=12;
	b[5]=7;
	b[6]=8;
	b[7]=11;
	b[8]=9;
	b[9]=3;
	b[10]=7;
	b[11]=4;
	b[12]=12;
	b[13]=5;
	b[14]=4;
	b[15]=10;
	b[16]=9;
	b[17]=6;
	b[18]=9;
	b[19]=4;
	System.out.println(as);
	System.out.println(as.find(as.get(18)));
	System.out.println(as.find(-30));
	System.out.println(as.get(as.findMaxIndex()));
	System.out.println(as.mean());
	System.out.println(as.mean(b));
	System.out.println(as.stddev());
	System.out.println(as.stddev(b));
    }
}
