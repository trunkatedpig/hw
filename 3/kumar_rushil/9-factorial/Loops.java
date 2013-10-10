import java.io.*;
import java.util.*;
public class Loops{

    public int fact(int n){
    if (n == 1){
	return n;
    } else {
	return (n * fact((n-1)));
    }
    }
    public int fact2(int n){
	int result = n;
	while (n > 1){
	    result = result * (n - 1);
	    n--;
	}
	return result;
    }
}
