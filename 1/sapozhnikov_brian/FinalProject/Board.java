import java.io.*;
import java.util.*;

public class Board{
    private ShipPart[][] board;

    public Board(int r, int c){
	board = new ShipPart[r][c];
    }

    public boolean movePartForward(ShipPart p){
	int dir = p.getShip().getDirection();
	int dRow = 0;
	int dCol = 0;
	switch(dir){
	case 0:
	    dRow = -1;
	    break;
	case 1:
	    dCol = 1;
	    break;
	case 2:
	    dRow = 1;
	    break;
	case 3:
	    dCol = -1;
	    break;
	}
	try{
	    board[p.getRow()+dRow][p.getColumn()+dCol] = p;
	} catch(ArrayIndexOutOfBoundsException e){
	    return false;
	}
	board[p.getRow()][p.getColumn()] = null;
	p.setRow(p.getRow()+dRow);
	p.setColumn(p.getColumn()+dCol);
	return true;
    }

    public void clear(){
	for (ShipPart[] row : board){
	    for(ShipPart part : row){
		part = null;
	    }
	}
    }
}
