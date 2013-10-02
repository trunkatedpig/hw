public class Greeter {
    public String greet() {

	private String happyGreeting, sadGreeting, greeting;

	public Greeter(String sad, String happy){
	    setSad(sad);
	    setHappy(happy);
	}

	public Greeter () {
	    setSad("Leave me alone!");
	    setHappy("Hey there");
	}

	public void setSad(String greet){
	    sadGreeting = greet;
	}
	
	public void setHappy(String greet){
	    happyGreeting = greet;
	}
	/*think of them like functions. public, returns nothing,name is setHappy,  accepts parameter greet. 
	  the one below accepts a string, which is a name and it returns a string.
	*/

	public String greetSad(String name){
	    String message;
	    message = sadGreeting + " " + name;
	    //sadGreeting has already been set. whatever was entered for setSad is now sadGreeting
	    return message;
	}
	
	public String greetHappy(String name){
	    String message;
	    message = happyGreeting + " " + name;
	    return message
		}
    }
}
