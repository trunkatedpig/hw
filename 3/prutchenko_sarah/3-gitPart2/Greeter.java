public class Greeter {

    private String happyGreeting ;
    private String sadGreeting; 
    public Greeter(){
	happyGreeting="Hiya!";
	sadGreeting="Ugh. Go away";
    }
    public Greeter(String happy, String sad){
	happyGreeting = happy;
	sadGreeting= sad;
    }
    
    public void setSadGreeting(String sgreet){
	sadGreeting =sgreet;
    }
    public void setHappyGreeting(String hgreet){
	happyGreeting = hgreet;
    }
    public String sgreet(String name){
	String message;
	message = sadGreeting + " " + name;
	return message;
    }
    public String hgreet(String name){
	String message;
	message = happyGreeting + " " + name;
	return message;
	}
}
