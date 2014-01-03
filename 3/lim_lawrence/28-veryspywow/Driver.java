public class Driver {
    public static void main(String args[]) {
	Cipher c = new Cipher();
	System.out.println(c.caesarShift("hello",3));
	System.out.println(c.caesarShift("abcxyz",3));
	System.out.println(c.caesarShift("YOU SEEM DISTRESSED !#@($(!#@$",3));
    }
}
