

public class Driver {
    public static void main (String [] args){
        CoinGame c = new CoinGame ();
	c.addPot ();
	System.out.println (c.getPot ());

	c.setBankbalance ();
	
	c.turn ();
	System.out.println (c.getCoinFace ());
	System.out.println (c.getBankAccount ());
	System.out.println (c.getPot ());
	
	c.play (10);
	System.out.println (c.getCoinFace ());
	System.out.println (c.getBankAccount ());
	System.out.println (c.getPot ());

	
	

    }
}
