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

}
