import java.io.*;
import java.util.*;

public class Loops {

    public int fact(int n) {
	int answer;
        if (n > 1) {
	    answer = n * fact(n-1);
	}
	else {
	    answer = 1;
	}
	return answer;
    }

    public int fact2 (int n) {
	int countdown;
	int i;
	int answer;
	countdown = n;
	i = n;
	answer = 1;
	while (i > 0) {
	    answer = answer * countdown;
	    countdown = countdown - 1;
	    i = i - 1;
	}
	return answer;
    }
}
	    
	
	
	    
	    
