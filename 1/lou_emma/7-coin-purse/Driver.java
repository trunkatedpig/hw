public class Driver {
    public static void main(String[] args) {
	
	/*Coin head1 = new Coin();
	String s = new String("Tails");
	Coin tail = new Coin(s);
	s = new String("Heads");
	Coin head2 = new Coin(s);


	System.out.println(head1.getFace()+" "+tail.getFace()+" "+head2.getFace());
	
	System.out.println(head1.equals(tail));
	System.out.println(head1.equals(head2));
	System.out.println(tail.equals(head2));
	System.out.println(head2.equals(head1));

	System.out.println();

	String s1 = "abcde";
	String s2 = "defghi";
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
	System.out.println(s1.compareTo(s1));

	System.out.println("a".compareTo("b"));
	System.out.println("b".compareTo("a"));
	System.out.println("A".compareTo("a"));
	

	System.out.println("Before flip");
	System.out.println(head1.getFace()+" "+tail.getFace()+" "+head2.getFace()+" "+head1.getTosses()+" "+head1.getHeads());
	System.out.println("After flip");
	head1.flip();
	tail.flip();
	head2.flip();
	
	System.out.println(head1.getFace()+" "+tail.getFace()+" "+head2.getFace()+" "+head1.getTosses()+" "+head1.getHeads());*/
    Coin c1 = new Coin("penny");
	Coin c2= new Coin(00.25);


	//c1.Coin("nickel");
	System.out.println("Coin c1: "+ c1.getValue());
	//c2.Coin(00.01);
	System.out.println("Coin c2:" +c2.getName());
	
	CoinPurse Purse1=new CoinPurse();
	Purse1.addTo(c1);
	System.out.println(Purse1.getAmount());
	Purse1.addTo(c2);
	System.out.println(Purse1.getAmount());
	Purse1.removeFrom(c1);
	System.out.println(Purse1.getAmount());
	
	
	}
}
