public class Driver {
    public static void main(String[] args) {
	System.out.println("\nwhee, coin purses~--\n");
	Coin quarter = new Coin();
	quarter.print();
	Coin dime = new Coin("Dime",0.10);
	dime.print();
	Coin derp = new Coin("Derp",0.42);
	derp.print();

	CoinPurse nope = new CoinPurse();
	nope.print();
	nope.addTo(quarter);
	nope.print();
	nope.removeFrom(dime);
	nope.print();
	nope.addTo(derp);
	nope.print();
	
	System.out.println();
    }
}
