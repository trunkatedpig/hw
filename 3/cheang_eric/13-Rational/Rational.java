public class Rational{
    
    public String RationalNumber;
    public int Numerator;
    public int Denominator;
    
    public Rational(int Numerator, int Denominator){
	
	RationalNumber = Numerator + "/" + Denominator;
	Numerator = Numerator;
	Denominator = Denominator;
	
    }

    public int getNum(){
	
	return Numerator;
	
    }
    
    public int getDen(){
	
	return Denominator;
	
    }
   
    
    // public void ReNUMDEN(int NUM, int DEN){
	
    // 	Numerator = NUM;
    // 	Denominator = DEN;
	
    // }
    
    
     public String getRationalNumber(){
	
    	return Numerator + "/" + Denominator;

     } 
    
    public void setNewInt(int newInt, String Choice){
       
	int slashIndex = RationalNumber.indexOf("/");
	
	if (Choice.equals("Numerator")) {
	    
	    String subString = RationalNumber.substring(slashIndex + 1);
	    
	    RationalNumber = Choice + "/" + subString;
	    
	    Numerator = newInt;

	}
	
	else{
	
	    if (Choice.equals("Denominator")) {
	    
		String subString = RationalNumber.substring(0,slashIndex);
	    
		RationalNumber = Choice + "/" + subString;
		
		Denominator = newInt;
	    
	    }
	    
	    else{
		
		System.out.print("setNewInt(int newInt, String Choice)");
		
	    }}}
    
    public int gcd(int Numerator, int Denominator){
	
	if (Denominator == 0){
	    
	    return Numerator;
		
	}
	
	else{
	    
	    return gcd(Denominator,Numerator%Denominator);
	    
	}}
	
    public void reduce(){
	
	Numerator = Numerator / gcd(Numerator,Denominator);
	
	Denominator = Denominator / gcd(Numerator,Denominator);
	
    }

    public boolean equals(Rational other){
		
	reduce();
	other.reduce();
	
	if (this.getDen() == other.getDen()  && getNum() == other.getNum() ){
	   
	    return true;
	    
	}
	
	else {
	    
	    
	    return false;
		
	}}
	
	public Rational mult(Rational other){
	    
	    Rational returnRational;
	    
	    returnRational = new  Rational(this.getNum() * other.getNum(),
					   this.getDen() * other.getDen());
	    
	    
	    return returnRational;
	}

    public int compareTo(Rational other){
	
	int thisRational = this.getNum() / this.getDen();
	
	int otherRational = other.getNum() / other.getDen();
	
	if (thisRational > otherRational){
	    
	    return 1;
	    
	}

	if (thisRational == otherRational){
	    
	    return 0;
	    
	}
	
	if (thisRational < otherRational){
	    
	    return -1;
	    
	}
	
	return 1;
    }
	
    
}



    
    
	
	
    
	    
	    
	    
	
	
    
    
