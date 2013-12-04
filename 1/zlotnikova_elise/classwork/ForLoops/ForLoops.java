import java.io.*;
import java.util.*;

public class ForLoops {
    public int fact(int n) {
	int result = 1;
	for (n=n; n>=1; n=n-1) {
	    result = result * n;
	}
	return result;
    }
    public void test() {
	for (int i = 0; i<10; i++) {
	    // stuff
	}
    }
}