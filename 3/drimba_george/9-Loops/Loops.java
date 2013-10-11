import java.io.*;
import java.util.*;
//Loops
public class Loops {
    public int fact(int n) {
	int answer;
	if (n == 1 || n == 0 ) 
	    answer = 1;
	else
	    result = n * fact(n-1);
	return answer;
    }
    //recursion(while)
    public int fact2(int n) {
	int answer, count, fact;
	count = n;
	fact = 1;
	while (count != 1) {
	    fact = fact*count;
	    count = count - 1;
	}
	return fact;
    }

    public static void main(String[ ] args) {
	Loop g = new Loop();
	System.out.println(g.fact(31));
	System.out.println(g.fact2(9));
	System.out.println(g.fact2(1));
    }
