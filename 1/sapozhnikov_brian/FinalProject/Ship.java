import java.io.*;
import java.util.*;

public class Ship{
    private ArrayList<ShipPart> parts = new ArrayList<ShipPart>();
    private int direction; //use 0-3 to describe the direction the ship is facing?
    private boolean isEnemy;

    public Ship(boolean enemy){
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
}
