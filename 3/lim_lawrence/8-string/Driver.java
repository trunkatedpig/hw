public class Driver {
    public static void main(String[] args) {
	StringStuff ss = new StringStuff();

	String s1="james bond";
	System.out.println(s1);
	System.out.println(ss.capitalize(s1));
	System.out.println(ss.bondify(s1));
	System.out.println();
	
	String s2="hello";
	String s3="my name is inigo montoya";
	String s4="you killed my father";
	String s5="prepare to die";
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(ss.piglatinify(s2));
	System.out.println(ss.piglatinify(s3));
	System.out.println(ss.piglatinify(s4));
	System.out.println(ss.piglatinify(s5));
    }
}
