import java.io.*;
import java.util.*;


public class Loops {
    int answer;
    
    public int fact(int n) {
	if (n == 0)
	    answer = 1;
	else
	    answer = n * (n - 1);
	return answer;
    }

    public int fact2(int n) {
	answer = 1;
	while (n > 0) {
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }
}
