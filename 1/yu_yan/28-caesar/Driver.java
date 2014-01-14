public class Driver{
    public static void main(String[] args){
	Caesar c = new Caesar();
	System.out.println(c.encode("abcdefghijklmnoPQRSTUVWXYZ123!@#", 25));
	String s = c.encode("this is a sentence it is long and hopefully it will work idk tho", 23);
	System.out.println(s);
	System.out.println(c.decode(s));
    }
}
