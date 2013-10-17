public class For{

    public String reverse (String a) {
        for (int i = a.length();i>0;i=i-1){
            System.out.print(a.substring(i-1, i));
        }
        System.out.println("");
        return null;
    }
    public int gcda (int a, int b) {
        for(int dcg = a; dcg > 0; dcg=dcg-1) {
            if ( a%dcg==0 && b%dcg==0)
                return dcg;
        }
                return 1;
    }
    public String table(int n, int m){
	for (int x = 1; x <= n; x = x + 1){
		System.out.print(x + " ");
	}
	System.out.println ("");
	System.out.println ("");
	for (int col = 1; col <= m; col = col + 1){
	    System.out.print (col +"  ");
	    for (int i = 1; i <= n; i = i + 1){
		System.out.print (col * i + " ");
	    }
	System.out.println ("");
	}
	return null;
    }
}
