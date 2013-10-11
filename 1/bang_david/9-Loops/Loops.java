import java.util.*;
import java.io. *;

public class Loops {
    public int fact (int n) {
	int n2 = 1;
	while (n > 0){
	    n2 =  n2 * n ;
	    n = n - 1;
	}
	return n2;
    }
       
}
