import java.util.*;
import java.io.*;

public class Rational {
    int num = 0;
    int dem = 0;

    public void setRational (int n, int d) {
	num = n;
	dem = d;
    }
    
    public int gcd(int a,int b) {
	if (b==0) {
	    return a;
	}
	else {
	    return gcd(b,a%b);
	} 
    }

    public void reduce() {
	num = num / gcd(num,dem);
	dem = dem / gcd(num,dem);
    }

    public boolean equals(Rational other) {
	reduce();
	other.reduce();
	if ((this.num == other.num) && (this.dem == other.dem)) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public Rational mult(Rational other) {
	Rational rnew = new Rational();
	rnew.setRational ((this.num * other.num), (this.dem * other.dem));
	return rnew;
    }

    public int compareTo(Rational other) {
	int answer = 0;
        reduce();
	other.reduce();
	if (this.num > other.num) {
	    answer = 1;
	}
	else {
	    if (this.num == other.num) {
		answer = 0;
	    }
	    else {
		answer = -1;
	    }
	}
	return answer;
    }
}
