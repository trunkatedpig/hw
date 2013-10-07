public class Driver {
    public static void main(String[] args) {
		Coin c = new Coin("Quarter", 0.25);
		CoinPurse cp = new CoinPurse(0.00);
		System.out.println(cp.getAmount());
		cp.addTo(c);
		System.out.println(cp.getAmount());
		cp.removeFrom(c);
		System.out.println(cp.getAmount());
    }
}