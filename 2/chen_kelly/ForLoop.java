//Tina Lee and Kelly Chen
import java.io.*; 
import java.util.*;

public class ForLoop{
   
    private int result;
    public int factFor(int n){   
	for (result = 1; n>=1; result = result * n){
	    return result;
	}
	return 1;
    }
}