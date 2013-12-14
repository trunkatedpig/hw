public class Person{
    private String name;
    Turtle turtle;
    public Person(String name) {
	name = name;
	turtle = new Turtle();
    }
    public void setTurtle(Turtle t) {
	turtle = t;
    }
    public Turtle getPet() {
	return turtle;
    }
    public int getTurtleSpeed() {
	return turtle.tellspeed();
    }
    
    }
