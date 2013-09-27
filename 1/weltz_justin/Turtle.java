public class Turtle {
    private String turtle;
    private int speed,age;
    public Turtle() {
	speed = 0;
	age = 0;
	turtle = "Tom";
    }
    public Turtle(String name){
	turtle = name;
	age = 0;
	speed = 0;
    }
    public void SpeedUp(int n){
	speed = speed + n;
    }
    public void SlowDown(int n){
	speed = speed - n;
    }
    public void GetOlder(){
	age = age + 1


}


 }