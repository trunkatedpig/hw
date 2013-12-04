public class Driver {
    public static void main(String[] args) {
	System.out.println("Creating coin:");
       	Coin c = new Coin();
	System.out.println(c);
	System.out.println("\nStatus of coin:");
	System.out.println(c.getFace());
	System.out.println("\nFlipping coin:");
	c.flip();
	System.out.println(c.getFace());
	c.flip();
	System.out.println(c.getFace());
	c.flip();
	System.out.println(c.getFace());

	System.out.println("\nCreating unfair coin:");
	Coin c2 = new Coin(1.0);
	System.out.println(c2);
	System.out.println("\nFlipping coin:");
	c2.flip();
	System.out.println(c2.getFace());
	c2.flip();
	System.out.println(c2.getFace());
	c2.flip();
	System.out.println(c2.getFace());
    }
}
