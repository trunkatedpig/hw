public class ForLoops{

    public String diag(int n){
	for (int i = 1; i <= n; i = i + 1){
	    for (int q = 1; q <= i; q = q + 1){
	    System.out.print(" ");
		}
		     System.out.println("*");
	}
	return null;
    }

    public String diagWord (String w){
	for (int i = 0; i < w.length(); i = i + 1){
	    for (int q = 1; q <= i; q = q + 1){
		System.out.print(" ");
	    }
	    System.out.println(w.substring(i,i+1));
	}
	return null;
    }

    public String fence (int h, int w){
	System.out.print ("+");
	for (int i = 0; i < w - 2; i = i + 1){
	    System.out.print("-");
		}
	System.out.println ("+");
       	for (int j = 0; j <= h-2; j = j + 1){
	    System.out.print ("|");
		for (int q = 0; q < w-2; q = q + 1){
		    System.out.print(" ");
		}
		System.out.println("|");
	}
	System.out.print ("+");
	for (int i = 0; i < w - 2; i = i + 1){
	    System.out.print("-");
	}
	System.out.println ("+");
	return null;
    }
}
