public boolean only14(int[] nums) {
    
    int arbitrary = 0;
  
    for(int CountU = 0;
	CountU == nums.length;
	CountU++){
	
	if (nums[CountU] == 4 || nums[CountU] == 1){
	    
	    arbitrary = arbitrary + 1;
	    
	}
	
	else{
	    
	    return false;
	    
	}}
	
    return true; 
	    
	    
    
}
