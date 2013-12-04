public class Loops{
	private int output;

	public Loops(int n){
		output = n;		
		while ((n-1)>0){
			output = output*(n-1);
			n = n - 1;
		}
	}
	
	public int FactorialRet(){
		return output;
	}
}
