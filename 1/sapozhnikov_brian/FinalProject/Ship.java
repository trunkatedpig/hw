import java.io.*;
import java.util.*;

public class Ship{
    private ShipPart[][] board;
    private ArrayList<ShipPart> parts = new ArrayList<ShipPart>();
    private int direction; //use 0-3 to describe the direction the ship is facing?

    public Ship(ShipPart[][] grid){
	board = grid;
    }

    public ShipPart[][] getBoard(){
	return board;
    }
    public ArrayList getParts(){
	return parts;
    }
    public int getDirection(){
	return direction;
    }
}
