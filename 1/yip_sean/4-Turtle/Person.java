public class Person {
    private String name;
    private Turtle turtle;

    public Person(String name) {this.name = name;}

    public void setTurtle(Turtle t) {turtle = t;}

    public Turtle getPet() {return turtle;}

    public int getTurtleSpeed() {return turtle.getSpeed();}
}
