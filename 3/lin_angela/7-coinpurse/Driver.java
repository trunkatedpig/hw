public class Driver{
    public static void main(String[]args){
	Coin c = new Coin();
	System.out.println(c.getValue());
	System.out.println(c.currentHead());
	System.out.println(c.Heads());
	System.out.println(c.Flips());
	CoinPurse cp = new CoinPurse();
	cp.addTo(c);
	System.out.println(cp.getAmount());
	cp.removeFrom(c);
	System.out.println(cp.getAmount());

	Coin c2 = new Coin("nickel",0.05); //using constructor w/ parameters
	System.out.println(c2.getValue());
	CoinPurse cp2 = new CoinPurse();
	cp2.addTo(c2);
	System.out.println(cp2.getAmount());
	cp2.removeFrom(c2);
	System.out.println(cp2.getAmount());
    }

}
