public class Driver {
    public static void main(String[] args) {
	Coin coin = new Coin(0.5, .25, "Quarter");
	Coin coin2 = new Coin(0.3, .01, "Penny");
	Coin coin3 = new Coin(0.5, .05, "Nickel");
	Coinpurse coinpurse = new Coinpurse();

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

	coinpurse.addTo(coin);
	coinpurse.addTo(coin2);
	System.out.println(coinpurse.getAmount());
	System.out.println(coinpurse.getValues());
	System.out.println(coinpurse.getCoins());
	coinpurse.removeFrom(coin3);
	coinpurse.removeFrom(coin);
	System.out.println(coinpurse.getAmount());
	System.out.println(coinpurse.getValues());
	System.out.println(coinpurse.getCoins());
	
    }
}
