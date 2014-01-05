public class Driver{
    public static void main(String[] args){
	Cipher c=new Cipher();
	System.out.println(c.encode("hello",3));
	System.out.println(c.encode("abcxyz",3));
	System.out.println(c.encode("hi there!",1));
	System.out.println(c.encode("HI THERE!",1));
    }
}
