import java.util.*;
import java.math.*;

public class Driver {
    public static void main(String[] args) {
	System.out.println("Objects\t|Radix:t|Type:Compares\tAssignments\tTime");
	for (int objs=1000;objs<=25000;objs+=1000) {
	    Radix r1 = new Radix(objs,5);
	    Radix r2 = new Radix(objs,5);
	    Radix r3 = new Radix(objs,5);
	    Radix r4 = new Radix(objs,5);
	    int t = 0;
	    int start = (int) (System.currentTimeMillis());
	    r1.sort(r1.getA());
	    int end = (int) (System.currentTimeMillis());
	    t=end-start;
	    System.out.print(""+objs+"\t|R:"+t+"\t|I:");
	    start = (int) (System.currentTimeMillis());
	    r2.isort(r2.getA());
	    end = (int) (System.currentTimeMillis());
	    t=end-start;
	    System.out.print(""+t+"\t|B:");
	    start = (int) (System.currentTimeMillis());
	    r3.bsort(r3.getA());
	    end = (int) (System.currentTimeMillis());
	    t=end-start;
	    System.out.print(""+t+"\t|S:");
	    start = (int) (System.currentTimeMillis());
	    r4.ssort(r4.getA());
	    end = (int) (System.currentTimeMillis());
	    t=end-start;
	    System.out.println(t);
	}
    }
}
