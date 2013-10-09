
public class Piglatin {
	
	public String firstLetter(String s){
		String result;
		result = s.substring(0,1);
		return result;
	}
	
	public String piglatinfy(String s){
		s.toLowerCase();
		String firstChar = firstLetter(s);
		String result = "";
		String[] VOWELS = {"a","e","i","o","u"};
		
		for (int i = 0; i < VOWELS.length; i = i + 1){
			if (VOWELS[i] == firstChar){
				result = s + "yay";
			}
			else if (s.startsWith("th") || s.startsWith("ch") || s.startsWith("sh")){
				result = s.substring(2) + s.substring(0,2) + "ay";
			}
			else {
				result = s.substring(1) + firstLetter(s) + "ay";
			}
		}
		return result;
	}
}
