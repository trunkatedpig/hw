public class Arrays2{ 

    public int[] RevFill(int n){ 
	int[] fill = new int[n]; 
	for (i = 0; i <= n; i++){ 
	    fill[i] = n; 
	    n = n - 1; 
	} 
	return fill; 
	    }
    public int[] MakeRandom(int size, int min, int max){ 
	Random r = new Random(); 
	int[] random = new int[size]; 
	for(i = 1; i < size; i++)
	    random[i]=  r.nextInt(max) + min; 
	return random;
    }

    
    public int sum13(int[] nums) {
	int x = 0; 
	for (int i = 0; i < nums.length; i++){ 
	    if (nums[i] == 13){
		nums[i] = 0; 
	        nums[i+1] = 0;}
	    else
                x = x + nums[i]; 
         return x;
}


    public boolean modThree(int[] nums) {
	boolean r = false;
	if (nums.length < 3)
	    return false;
	for (int i=0; i<=nums.length-3; i++) {
	    if ((nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) ||(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0) )
           return true;
                }
         return false;
   

}
