public class Coinpurse{
    private int amount;
    
    public Coinpurse(){
	amount = 0;
    }

    public Coinpurse(int a){
	amount = a;
    }

    public void addTo(Coin c){
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c){
	if (amount >= c.getValue()){
	    amount = amount - c.getValue();
	}
	else {System.out.println("Unable to remove");
	}
    }

    public int getAmount(){
	return amount;
    }
}