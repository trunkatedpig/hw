public class StringStuff{

    public String capitalize(String name){
	String answer,firstL,lastL;	
	int space;
	firstL=name.substring(0,1);
	firstL=firstL.toUpperCase();
	space=name.indexOf(" ");
	lastL=name.substring ((space+1), (space+2));
	lastL=lastL.toUpperCase();
	answer=firstL;
	answer= answer + name.substring(1,(space+1));
	answer=answer+lastL;
	answer=answer+(name.substring(space+2));
	return answer;
    }

      public String bondify(String name){
	  String first,last,answer;
	int space;
	space=name.indexOf(" ");
	first=name.substring(0,space);
	last=name.substring((space+1));
	answer=last+", "+first+" "+last;
	return answer;
        }

 public String vowelit(String word){
	String answer;
	answer=word + "ay";
	return answer;
    }

    public String consonantit(String word){
	String answer;
	answer=word.substring(1)+word.substring(0,1)+"ay";
        return answer;
    }

    public String PigLatinit(String word){
	String vowels="aeiouAEIOU";
	String firstL=word.substring(0,1);

	if (vowels.contains(firstL))
	    return vowelit(word);
	else {return consonantit(word);}
	}
}
