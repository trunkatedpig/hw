public class Person {

    private String name;

    private Turtle pet;

    public Person(String name){
	this.name = name;
    }
    public void setTurtle (Turtle t){
	this.pet = t;
    }

    public Turtle getPet(){
	return pet;
    }

    public int getTurtleSpeed(){
	return pet.getSpeed();
    }
}
