public class For{
    public String  Reverse (String s){
	String newstring = "";
	for ( int i = s.length() - 1; i >= 0; i = i - 1)
	    {
		newstring = newstring + s.substring(i,i+1);
	    }
	return newstring;
    }
    public String table(int n, int m){
	String Answer = "  ";
	for (int l = 1; l <= n; l = l + 1){
	    Answer = Answer +  l+ " ";
	}
	Answer = Answer + "\n"; 
	for (int i = 1; i <= m ; i = i + 1){
	    Answer = Answer + i+ " ";
	    for (int q = 1; q <= n; q = q + 1){
		Answer = Answer + (i * q)+ " ";
	    }
	    Answer = Answer + "\n";
	}
	return Answer;
    }
    //worked with Maria
        public int GCD3(int a, int b){
	int g = 0;
	int i = 0;
	if (a < b)
	    g = a;
	else 
	    g = b;
	for (i = g;(b % i ) != 0 || (a % i) != 0; i =i -1){
	}
	return i;
    }
	
}
	    
	
	    
