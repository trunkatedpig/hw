public class Driver {
    public static void main(String[] args) {
	Coin head1 = new Coin();
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



    }
}
