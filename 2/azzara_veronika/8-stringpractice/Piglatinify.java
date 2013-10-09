
public class Piglatinify{
    private String word;
    public boolean isVowel(String l){
	if (l=="a"){return true};
	if (l=="e"){return true};
	if (l=="i"){return true};
	if (l=="o"){return true};
	if (l=="u"){return true};
    }
    public boolean isDigraph(String l){
	if (l=="sh"){return true};
	if (l=="th"){return true};
	if (l=="ch"){return true};
    }
    public String Piglatinify(String w){
	word = w;
	firstletter=word.substring(0,1)
	if (isVowel(firstletter)){
	    return word+"yay";
	    }
	if (isDigraph(word.substring(0,2))){
	    return word.substring(1)+word.substring(0,2)+"ay";
	else{
	    return word.substring(1)+firstletter+"ay";
	}
    }
}