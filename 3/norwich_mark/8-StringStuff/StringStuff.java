public class StringStuff{
   
    public String capitalize(String name){
	 a = indexOf(" ");
         A = toUpperCase(name.substring(0, 1)) + name.substring(1, a);
	 B = name.substring(a+1, a+2).toUpperCase() + name.substring(a+2);
				  return A + " " + B;
	 }
      public String bondify (String name){
         A = name.indexOf(" ");
         last= name.substring(a+1);
         return last+", "+ name;
	}
      
	public String pigLatinify(String lword){
	    String A, B ,C;
        A = lword.substring(0,1);
        B = lword.substring(1);
        C = lword.substring(lword.length() - 1);
        if (A == "a" || A == "e" || A  == "i" || A == "o" || A  ==  "u"){
        if (C == "a" || C == "e" || C == "i" || C == "o" || C  == "u"){
                return lword + "yay";
            }
            else{
                return lword + "ay"; 
            }
        }
        else{
            return B + A  + "ay";
        }        
    }
 
  
}	
