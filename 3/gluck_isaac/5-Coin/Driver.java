public class Driver {

    public static void main(String[] args) {
	Coin coin = new Coin();
	System.out.println(coin.face);
	System.out.println(coin.tosses);
	System.out.println(coin.heads);
	System.out.println(coin.prob);

	System.out.println();

	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.flip());
	System.out.println(coin.flip());

	System.out.println();

	System.out.println(coin.face);
	System.out.println(coin.tosses);
	System.out.println(coin.heads);
	System.out.println(coin.prob); 

	coin.resetCount();
    }

}
