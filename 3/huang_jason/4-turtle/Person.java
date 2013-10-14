public class Person{
    
    private String name;
    private Turtle turt;

    public Person(String personname){
	name = personname;
    }

    public void setTurtle(Turtle t){
	turt = t;
    }

    public Turtle getPet(){
	return turt;
    }

    public int getTurtleSpeed(){
	return turt.getSpeed();
    }
}