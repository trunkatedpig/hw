import java.io.*;
import java.util.*;

public class Loops {

    public int fact (int n) {
	int p;
	if (n > 1) {
	    p = n * fact(n-1);
	} else {
	    return 1; }
	return p; }
    
    public int fact2 (int n) {
	int r = 1;
	while (n > 1) {
	    r = r * n;
	    n = n - 1; }
	return r; }

}
