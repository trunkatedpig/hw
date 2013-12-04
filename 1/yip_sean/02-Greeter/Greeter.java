public class Greeter {
    public String greeting;

    public void setGreeting(String greet) {
        greeting = greet;
    }

    public String greet(String name) {
	return greeting + " " + name;
    }
}
