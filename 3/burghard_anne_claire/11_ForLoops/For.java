import java.io.*;
import java.util.*;

public class For {

    public int fact2 (int n) {
	int i;
	int answer;
	i = n;
	answer = 1;
	for  (i = n; i > 0; i = i -1) {
	    answer = answer * i;
	}
	return answer;
    }

    public String Reverse (String s) {
	int i;
	String answer = "";
	for (i = s.length(); i > 1; i = i -1) {
	    answer = s.substring(0) + answer;
	    s = s.substring(1, i);
	}
	return answer;
    }
}

