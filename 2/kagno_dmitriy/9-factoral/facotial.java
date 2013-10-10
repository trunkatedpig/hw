import java.io.*;
import java.util.*;

public class facotial{
    private int i,j;
   
    public int nfact1(int i){
	if (i> 1){
	    return i * nfact1(i-1);
	}
	else{
	    return 1;
	}
    }
	    

    public int nfact2(int i){
	this.i = i;
	j = 1;
	while(i > 1){
	    j = j * i;
	    i = i - 1;
	}
        return j;
    }
	    
	    
}
