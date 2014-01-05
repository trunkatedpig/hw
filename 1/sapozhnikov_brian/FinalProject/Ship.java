import java.io.*;
import java.util.*;

public class Ship{
    private ArrayList<ShipPart> parts = new ArrayList<ShipPart>();
    private int direction; //use 0-3 to describe the direction the ship is facing?
    private boolean isEnemy;
    private String name;

    public Ship(String name, boolean enemy){
	this.name = name;
	isEnemy = enemy;
    }

   
    public ArrayList getParts(){
	return parts;
    }
    public int getDirection(){
	return direction;
    }
    public boolean isEnemy(){
	return isEnemy;
    }
    public String getName(){
	return name;
    }

    public void addPart(ShipPart p){
	parts.add(p);
    }

    public String toString(){
	return name;
    }
}
