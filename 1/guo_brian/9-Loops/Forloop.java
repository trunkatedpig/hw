import java.io.*;
import java.util.*;

public class Forloop{
    

    public int fact2(int n) {
	int result = 1;
	for (int i = 1; i < n; i++) {
	    result = result * i;
	}
	return result;
    }
}


