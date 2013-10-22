public class StringStuff{
	
	public String reverse(String s){
		String result = "";
		for (int count = (s.length() - 1); count >= 0 ; count--){
			if (result.length() == 0)
				result = result + s. substring(count);
			else	
				result = result + s.substring(count,count+1);
		}
		return result;
	}
	
	public String makeRows(int m, int n, int mult){
		String result = "";
		int count = 1;
		while (count <= m){
			result = result + (count*mult) + " ";
			count = count + 1;
		}
		result = result + "\n";
		return result;
	}
	
	public String table(int m, int n){
		String result = makeRows(m,n,1);
		int count = 1;
		while (count <= n){
			result = result + count + " ";
			result = result + makeRows(m,n,count);
			count = count + 1;
		}
		return result;
	}
	

	public String diag(int n){
		String result = "";
		for (int i = 0;i < n;i++){
			for (int j = 0;j<i;j++){
				result = result + " ";
			}
			result = result + "*\n";
		}
		return result;
	}
	
	public String diagWord(String w){
		String result = "";
		for (int i = 0;i<w.length();i++){
			for (int j = 0;j<i;j++){
				result = result + " ";
			}
			result = result + w.substring(i,i+1) + "\n";
		}
		return result;
	}
	
	public String fence(int h,int w){
		String result = "";
		for (int i = 0;i<h;i++){
			if (i == 0 || i == (h - 1)){
				result = result + "+";
			}
			else{
				result = result + "|";
			}
			for (int j = 0;j<(w-2);j++){
				if (i == 0 || i == (h - 1)){
				result = result + "-";
				}
				else{
				result = result + " ";
				}
			}
			if (i == 0 || i == (h - 1)){
				result = result + "+\n";
			}
			else{
				result = result + "|\n";
			}
		}
		return result;
	}
}