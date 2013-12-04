import java.io.*;
import java.util.*;

public class Rational {
private int a,b;

public Rational(int i) {
	a = i;
	b = 1;
}

public Rational(int i1, int i2) {
	a = i1;
	b = i2;
}

public int gcd(int i,int j) {
  if (j==0)
   return i;
  else {
   return gcd(j,i%j);
}
} 

public void reduce() {
  a = a / gcd(a,b);
  b = b / gcd(a,b);
}

public boolean equals(Rational other) {
	return ((a/b) == (other.a/other.b));
}

public Rational mult(Rational other) {
	Rational r;
	r = new Rational((a * other.a),(b* other.b));
	return r;
}

public int compareTo(Rational other) {
	if ((a/b) == (other.a/other.b))
	return 0;
	else if ((a/b) > (other.a/other.b))
	return 1;
	else
	return -1;
}
}
