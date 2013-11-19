//Andrew Fischer, John Safy

public class coinPurse {
    //Instance Vars
    private double amt;
    private double coinVal;
    
    //Methods

    public void addTo(Coin c) {
	c = new coinPurse();
       }


    public void reset(){
	amount = 0;
    }
    

    public double getAmt(){
	return amt;
    }


    public void addTo(Coin c){
	amt = amt + c.getVal();
    }

    public void removeFrom(Coin c){
	amount = amount - c.getVal();
    }

}
