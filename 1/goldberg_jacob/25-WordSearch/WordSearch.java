public class WordSearch{

    private char[][] Array1;

    public boolean InsertWordH(int r, int c, String s){
	
	// check if any spaces have existing characters
	for (int i = 0; i < s.length(); i++){
	    int x = c;
	    if (!(Array1[r][x] == ('-')))
		if (!(Array1[r][x] == (s.charAt(i))))
		    return false;
	    c++;
	}
	for (int j = 0; j < s.length(); j++){
	    Array1[r][c+j] = s.charAt(j);
	}
	return true;
    }

}
