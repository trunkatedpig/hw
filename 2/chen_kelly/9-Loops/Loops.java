import java.io.*;
import java.util.*;

public class Loops{

    public int fact (int n){
	if(n == 0){
	    return 0;
	}
	else if (n==1){
	    return 1;
	}
	else{
	    return n * fact(n - 1);
	}
    }

    public int fact2 (int n){
	int answer = 1;
	if (n ==0){
	    return 0;
		}
	else while (n != 0){
	    answer = answer * n;
	    n = n - 1;
	} 
	return answer;
    }
}
