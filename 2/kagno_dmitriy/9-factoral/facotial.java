import java.io.*;
import java.util.*;

public class facotial{
    private int i,j;

    public int nfact(int i){
	this.i = i;
	
	j = 1;
	while(i > 1){
	    j = j * i;
	    i = i - 1;
	}
        return j;
    }
	    
	    
}
