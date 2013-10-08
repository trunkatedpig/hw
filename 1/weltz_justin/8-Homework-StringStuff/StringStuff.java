public class StringStuff {
    public String capitalize(String name){
	int x;
	x = name.indexOf(" ");
	String firstCapital,secondCapital,first,second,firstword,secondword, answer;
	first = name.substring(0, 1);
	second = name.substring(x + 1, x + 2);
	firstCapital = first.toUpperCase();
	secondCapital = second.toUpperCase();
	firstword = firstCapital + name.substring(1,x);
	secondword = secondCapital + name.substring(x + 2);
	answer = firstword + " " +  secondword;
	return answer;
    }
    public String bondify(String name){
	String firstname, lastname, answer;
	int x;
	x = name.indexOf(" ");
	firstname = name.substring(0,x);
	lastname = name.substring(x + 1);
	answer = lastname + ", " + firstname + " " + lastname;
	return answer;
    }
}

	
	
