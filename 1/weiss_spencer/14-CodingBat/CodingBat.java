public class CodingBat{
        public boolean sameStarChar(String str){
	        Boolean ans = true;
        	for(int i = 0; i < str.length(); i++){
           		if (str.substring(i, i++).equals("*") && i == 0 || i == (str.length() - 1)){
                	newStr = newStr + "true";
            	}
            	else if (str.substring(i, i + 1).equals("*")){
                	if (str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))){
                    	ans = true;
           	}
            	else{
                	ans = false;
            	}
            	return ans;
	}

	public String sameEnds(String st){
	        String ans = "";
       		int n = st.length();
        	int x = (int)(n/2);
        	for (int i=1;i<half+1;i++){
           		 if (st.substring(0,i).equals(st.substring(n-i,n)))
             		 ans = st.substring(0,i);
        	}
	        return ans;
	}
}

// Tested and works
