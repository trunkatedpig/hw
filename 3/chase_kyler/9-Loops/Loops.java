import java.util.*;
import java.util.*;

public class Loops {	

	public int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;}
		else
			return (fact_helper(n, 1));
	}

	public int fact_helper(int n, int result) {
		if (n == 1) {
			return result;}
		else {
			result = result * n;
			n = n - 1;
			return fact_helper(n, result);}
	}

	public int fact2(int n) {
		int result;
		result = 1;
		while (n > 1) {
			result = result * n;
			n = n - 1;}
		return result;
	}
		
}












