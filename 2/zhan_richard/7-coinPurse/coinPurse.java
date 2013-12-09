public class coinPurse{
    private int amount;
    public coinPurse(){
	amount = 0;
    }
    public coinPurse(coin C){
	amount = C.getCents();
    }
    public void addTo(coin C){
	amount = amount + C.getCents();
    }
    public void removeFrom(coin C){
	amount = amount - C.getCents();
    }
    public int getPurse(){
	return amount;
    }
}
