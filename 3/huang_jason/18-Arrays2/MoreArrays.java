public class MoreArrays{

    public static int[] RevFill(int n){
	int[] ans = new int[n];

	for(int i=n; i>0 ; i--){
	    ans[i] = i;
	}
	return ans;
    }

   public static void main(String[] args){

    System.out.println(RevFill(5));

    }
}