import java.io.*;
import java.util.*;

public class For{
    //Rewriting GCD with a for loop
    public int GCD (int a, int b){
	int small, big;
	if (a > b) {
	    big = a;
	    small = b;
	}
	else {
	    big = b;
	    small = a;
	}
	for ( ;big%small != 0; small = small - 1){
	}
	return small;
    }


    public String Reverse (String s){
	String answer;
	answer = "";
	for (int index = s.length()-1; index >= 0; index = index - 1){
	    answer = answer + s.substring(index,index+1);
	}
	return answer;
    }

    public String table (int n, int m){
	String answer= "  ";
	int place,mult;
	for (place = 1; place <= n; place = place + 1){
		answer = answer + place + " ";
	}
	answer = answer + "\n";
        for (mult = 1; mult <= m; mult = mult + 1){
	    answer = answer + mult + " ";
	    for (place = 1; place <= n; place = place + 1){
		answer = answer + (mult*place) + " ";
	    }
	    answer = answer + "\n";
	}
	return answer;
    }

}
