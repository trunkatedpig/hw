public class Loops {
    public int fact(int n) {
	int c = n;
	int answer = 1;

	while (c > 0) {
	    answer = answer*(c);
	    c = c - 1;
	}

	return answer;
    }
}
