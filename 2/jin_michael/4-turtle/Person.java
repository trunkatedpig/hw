public class Person{
    public String name;
    public Turtle turtle;

    public Person(){
      	name="Michael";
    }
    public void setTurtle(Turtle t){
	turtle=t;
    }

    public Turtle getPet(){
	return turtle;
    }

    public String getTurtleSpeed(){
	return turtle.getSpeed();
    }

    public String getPersonName(){
	return name;
    }
}
