import java.io.*;
import java.util.*;

public class Loops {

    public int fact (int n) {
	if (n == 0) {
	    return 1;
	}
	else {
	    return n * fact (n - 1);
	}
    }

    public int fact2 (int n) {
	int ans = 1;
	while (n > 0) {
	    ans = ans * n;
	    n = n - 1;
	}
	return ans;
    }
}
