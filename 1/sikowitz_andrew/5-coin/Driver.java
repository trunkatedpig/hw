public class Driver {
    public static void main(String[] args) {
	Coin coin = new Coin(0.5);
	for(int i=0; i<100; i++) {
	    coin.roll();
	}

	System.out.println(coin.getHeads());
	System.out.println(coin.getTails());
	System.out.println(coin.getWeight());
	coin.setWeight(0.1);
	coin.reset();

	for(int i=0; i<100; i++) {
	    coin.roll();
	}

	System.out.println(coin.getCount());
	System.out.println(coin.getHeads());
	System.out.println(coin.getTails());
    }
}