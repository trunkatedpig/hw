public class Greeter {
    private String happygreeting, sadgreeting;

    public Greeter() {
	setHappy("Hello");
	setSad("Goodbye");
    }

    public Greeter(String happygreet, String sadgreet) {
	setHappy(happygreet);
	setSad(sadgreet);
    }

    public void setHappy(String greeting) {happygreeting = greeting;}

    public void setSad(String greeting) {sadgreeting = greeting;}

    public String happyGreet(String name) {return happygreeting + " " + name;}

    public String sadGreet(String name) {return sadgreeting + " " + name;}
}
