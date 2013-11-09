import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
        Arrays a = new Arrays();

        int[] b = a.RevFill(10);

        for (int c=0;c<b.length;c++){
            System.out.print(b[c] + ",");
	}
       
	System.out.println (" ");
	int[] d = a.MakeRandom(10,10,15);

        for (int c=0;c<d.length;c++){
            System.out.print(d[c] + ",");
	}


        /*codingbat problems worked online */
    }
}

