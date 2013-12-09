public class Person {

    private String pName;
    private Turtle turtle;
    public Person(String name){
	pName = name;
    }
    public void setTurtle(Turtle t){
	turtle=t;
    }
    public Turtle getPet(){
	return turtle;
    }
    public int getTurtleSpeed(){
	return turtle.getSpeed();
    }
}
