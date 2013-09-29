import java.io.*;
import java.util.*;

public class Turtle {
    private String Name;
    private int Speed;
    private int Age;

    public Turtle() {
	Name = "T-Rex";
	Speed = 10;
	Age = 30;
    }
    public Turtle(String iName) {
	Name = iName;
	Speed = 10;
	Age = 30;
    }
    public Turtle(String iName,int iSpeed,int iAge) {
	Name = iName;
	Speed = iSpeed;
	Age = iAge;
    }

    public void SpeedUp(int n) {
	Speed = Speed + n;
    }
    public void SlowDown(int n) {
	Speed = Speed - n;
    }
    public void GetOlder(int n) {
	Age = Age + n;
    }

    public String getName() {
	return Name;
    }
    public int getSpeed() {
	return Speed;
    }
    public int getAge() {
	return Age;
    }
}