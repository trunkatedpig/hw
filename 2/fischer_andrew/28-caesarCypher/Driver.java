public class Driver {
    public static void main (String[] args){
	
	caesar c = new caesar();

	System.out.println(c.encode("hello", 3));
	System.out.println(c.encode("khoor", 29));
	System.out.println(c.encode("khoor", -3));
    }

}
