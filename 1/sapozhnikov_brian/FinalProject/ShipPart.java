import java.io.*;
import java.util.*;

public class ShipPart{
    private ShipPart[][] board;
    private Ship ship;
    private int r,c;

    public ShipPart(Ship s, int r, int c){
	ship = s;
	board = ship.getBoard();
	board[r][c] = this;
	this.r=r;
	this.c=c;
    }
    
    public Ship getShip(){
	return ship;
    }

}
