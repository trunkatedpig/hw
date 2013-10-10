public class PigLatin {
	//worked with Alicia
    public String piglatinify (String word){
	String firstLetter = word.substring(0,1);
	String firstTwoLetters = word.substring(0,2);
	String result;
	if (firstTwoLetters.equalsIgnoreCase("ch") || firstTwoLetters.equalsIgnoreCase("sh")|| firstTwoLetters.equalsIgnoreCase("th") || firstTwoLetters.equalsIgnoreCase("ph")){
	    result = word.substring(2) + firstTwoLetters + "ay";
	}
	else if (firstLetter.equalsIgnoreCase("a") || firstLetter.equalsIgnoreCase("e") || firstLetter.equalsIgnoreCase("i") || firstLetter.equalsIgnoreCase("o") || firstLetter.equalsIgnoreCase("u")) {
	    result = word + "yay";
	}
	else {
	    result = word.substring(1) + firstLetter + "ay";
	}
	return result;
	    }
}