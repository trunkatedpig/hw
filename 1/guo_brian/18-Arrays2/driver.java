import java.io.*;
import java.util.*;

public class driver {
    
    public static void main (String[] args) {
	classarraywork r = new classarraywork();
	for (int i = 0; i< r.makeRandom(5,7,10).length; i++){
	    System.out.println(r.makeRandom(5,7,10)[i]);
	}
    }
}