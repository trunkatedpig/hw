public class Person {
    public String name;
    public Turtle turtle;
    
    public Person(String n){
	name = n;
    }

    public void setTurtle(Turtle t) {
	turtle = t;
    }
    
    public String getPet() {
	return turtle.getName();
    }

    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }
}