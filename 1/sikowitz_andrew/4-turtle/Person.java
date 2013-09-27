public class Person {
    private String name;
    private Turtle turtle;
    private Turtle defaultTurtle = new Turtle("Default",1,5);
    
    public Person(String name) {
	this.name = name;
	turtle = defaultTurtle;
    }

    public void setTurtle(Turtle t) {
	turtle = t;
    }

    public Turtle getPet() {
	return turtle;
    }

    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }

    public String getName() {
	return name;
    }
}