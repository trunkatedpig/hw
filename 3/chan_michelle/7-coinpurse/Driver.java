public class Driver{
    public static void main(String[] args){
	Coin c = new Coin();
	System.out.println(c.getValue());
	CoinPurse y = new CoinPurse();
	y.addTo(c);
	System.out.println(y.getAmount());
	y.removeFrom(c);
	System.out.println(y.getAmount());
	
	Coin c2 = new Coin("dime", 0.05);
	System.out.println(c2.getValue());
	CoinPurse y2 = new CoinPurse();
	y2.addTo(c2);
	System.out.println(y2.getAmount());
	y2.removeFrom(c2);
	System.out.println(y2.getAmount());
    }
}
	
