public class Driver {

    public static void main(String[] args) {
	Coin c = new Coin();
	c.setFlips(5);
	System.out.println(c.getFlips());
	c.reset();
	System.out.println(c.getFlips());
    }







}