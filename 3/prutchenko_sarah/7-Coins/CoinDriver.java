public class CoinDriver{
    public static void main(String[] args){
	Coin c1 = new Coin(1);
	Coin c2 = new Coin (5);
	Coin c3 = new Coin(10);
	Coin c4 = new Coin(25);
	CoinPurse p = new CoinPurse();
	CoinPurse p1 = new CoinPurse(5);
	System.out.println("Testing values and names for the coins begins here");
	System.out.println(c1.getValue());
	System.out.println(c2.getValue());
	System.out.println(c3.getValue());
	System.out.println(c4.getValue());
	System.out.println("Done testing values. Starting to add money to the coinpurse");
	System.out.println("Testing on empty purse begins");
	System.out.println(p.getAmount());
	System.out.println("Adding c1");
	p.addTo(c1);
	System.out.println(p.getAmount());
	System.out.println("Done with the empty purse, begins testing on p1");
	System.out.println(p1.getAmount());
	System.out.println("Adding c3");
	p1.addTo(c3);
	System.out.println(p1.getAmount());
    }
}
    
