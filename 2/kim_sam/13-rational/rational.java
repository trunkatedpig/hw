import java.io.*;
import java.util.*;

public class rational {

    private int a;
    private int b;
    private double ratNum;

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }
    
    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public rational (int i, int j) {
	a = i;
	b = j;
	ratNum = (i * 1.0) / (j* 1.0);
    }

    public int getTop () {
	return a;
    }
    
    public int getBot () {
	return b;
    }

    public double getFrac () {
	return ratNum;
    }

    public boolean equals(rational other) {
	return (this.getFrac() == other.getFrac());
    }

    public rational mult(rational other) {
	int k = a * other.getTop();
	int l = b * other.getBot();
	rational r = new rational(k,l);
	return r;
    }

    public int compareTo(rational other) {
	if (this.equals(other)) {
		return 0;
	    }
	else if (this.getFrac() > other.getFrac()) {
	    return 1;
	}
	else return -1;
    }
}