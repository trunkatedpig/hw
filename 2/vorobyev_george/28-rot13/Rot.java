public class Rot{

	public static void main(String[] args){
		System.out.println(encode("hello",3));
		System.out.println(encode("abcxyz",3));
		System.out.println(encode("apples",13));
	}

	public static String encode(String in, int offset){
		String temp = in.toLowerCase();
		String result = "";

		for(int i = 0; i < temp.length(); i++){
			char c = temp.charAt(i);
			if(c >= 'a' && c<= 'z')
				c = (char)((c - 'a' + offset) % 26 + 'a');
			result += c;
		}
		return result;
	}
}
