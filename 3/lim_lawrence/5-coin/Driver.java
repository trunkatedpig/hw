public class Driver {
    public static void main(String[] args) {
	System.out.println("\nwhee, coin flipping~--\n");
	Coin c = new Coin();
	c.print();
	c.setFace(1);
	c.setHeads(10);
	c.setTails(20);
	c.setOdds(30);
	c.print();

	Coin c2 = new Coin(25);
	c2.print();
    }
}
