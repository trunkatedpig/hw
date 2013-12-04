public class Loops {
    public int fact(int n) {
	int c = n;
	int answer = 1;

	while (c > 0) {
	    answer = answer*(c);
	    c--;
	}

	return answer;
    }

    public int GCD(int a, int b) {
	int x = Math.min(a, b);

	while (x > 1) {
	    if (a%x == 0 && b%x == 0)
		return x;
	    else
		x--;
	}

	return 1;
    }

    public int GCD2(int a, int b) {
	if (a == 0 || b == 0)
	    return Math.max(a, b);
	else
	    return GCD2(Math.min(a, b), Math.max(a,b) % Math.min(a, b));
    }

    // While loop version
    public int GCD2L(int a, int b) {
	while (a != 0 && b != 0)
	    if (a < b)
		b = b%a;   //b is bigger
	    else
		a = a%b;   //a is bigger
	
	return Math.max(a, b);
    }

  //Worked with Spencer Weiss on isPrime

    public Boolean isPrime(int n) {
	if (n <= 1)
	    return false;

	for (int i=2; i<n; i++) {
	    if (n%i == 0)
		return false;
	}
	return true;
    }

//While loop version for:
   public Boolean isPrimeL(int n) {
       if (n <= 1)
	   return false;

       int i = 2;
       while (i < n) {
           if (n%i == 0)
	       return false;
	   else
	       i++;
      }
      
      return true;
  }

    public void backwards(String s) {
	String ans = "";

	for (int i=s.length()-1; i>=0; i--) {
	    ans = ans + s.substring(i, i+1);
	}

	System.out.println(ans);
	//System.out.println(i);  -Does not work, can't find symbol error
    }
}
