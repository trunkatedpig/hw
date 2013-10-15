public class Loops {
    public boolean isPrime(int n) {
	// I'm not sure whether negatives count as prime. This assumes they don't
	int tryN;
	tryN = n - 1;
	while (tryN > 1) {
	    if (n % tryN == 0)
		return false;
	    tryN -= 1;
	}
	return true;
    }

    public boolean isPrimeFor(int n) {
	// I'm not sure whether negatives count as prime. This assumes they don't
	for (int tryN = n - 1; tryN > 1; tryN--) {
	    if (n % tryN == 0)
		return false;
	}
	return true;
    }

    public String reverse(String s) {
	String answer = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	    answer += s.substring(i,i+1);
	}
	return answer;
    }

    public String table(int n, int m) {
	String result = "";
	for (int j = 1; j <= n; j++) {
	    result += Integer.toString(j) + " ";
	}
	result += "\n";
	for (int i = 1; i <= m; i++) {
	    for (int j = 0; j <= n; j++) {
		if (j == 0) {
		    result += Integer.toString(i) + " ";
		    continue;
		}
		result += Integer.toString(i * j) + " ";
	    } 
	    result += "\n";
	}
	return result;
    }
}
