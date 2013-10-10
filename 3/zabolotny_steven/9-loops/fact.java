import java.io.*;
import java.util.*;

public class fact {
    public int fact(int n) {
	if (n > 0) {
	    return fact(n - 1) * n;
	} else {
	    return 1;}
    }
    public int fact2(int n) {
	int ans = 1;
	while (n > 0) {
	    ans = ans * n;
	    n = n - 1;}
	return ans;
    }
}