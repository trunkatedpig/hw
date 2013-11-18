public class Driver {
	public static void main (String [] args) {
		moreArrays a = new moreArrays();
		System.out.println ( a.makePretty (a.RevFill(6)) );
		System.out.println ( a.makePretty (a.makeRandom(6,3,10)) );
	}
}
