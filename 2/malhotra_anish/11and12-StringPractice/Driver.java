public class Driver{
	public static void main(String[] args){
		StringStuff strin = new StringStuff();
		
		System.out.println(strin.reverse("Hello"));
		System.out.println(strin.reverse("Racecar"));
		System.out.println(strin.table(5,3));
		System.out.println(strin.diag(4));
		System.out.println(strin.diagWord("Hello"));
		System.out.println(strin.fence(5,8));
		
		//String s = "Hello";
		//System.out.println(s.substring(4,5));
		//System.out.println(s.indexOf("l"));
	}
}