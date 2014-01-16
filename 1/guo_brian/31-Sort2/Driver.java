import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
	Sort2 j = new Sort2(10);
	Sort2 k = new Sort2(10);
	long start = System.currentTimeMillis();		   
	j.insertsort();
	System.out.println(j);
    }
}
