public class Driver {

    public static void main(String[] args) {
	Coin coin = new Coin();
	coin.setCount(5);
	System.out.println(coin.count);
	coin.resetCount();
	System.out.println(coin.count);
	
	
    }

}
