import java.io.*;
import java.util.*;

public class loops{
    public int fact(int n){
	int x;
	if (n == 0)
	    x = 1;
	else
	    x = n*(fact(n-1));
	return x;
    }
    
    public int factw(int n){
	int x = 1;
	if (n == 0)
	    x = x * 1;
	while (n > 0){
	    x = x * n;
	    n = n - 1;
	}
	return x;
    }
}
