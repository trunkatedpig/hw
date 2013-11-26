public class Person {
    
    private String name; 
    Turtle turtle ;

    public Person (String identity){
	name = identity;
    }
    public void setTurtle(Turtle t){
	turtle = t;
    }
    public Turtle getPet(){
	return turtle;
    }
    public int getTurtleSpeed(){
	return turtle.getSpeed();
    }
}

