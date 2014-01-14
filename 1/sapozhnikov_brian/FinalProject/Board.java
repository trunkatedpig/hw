import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Board extends Container{
    private ShipPart[][] board;

    public Board(int r, int c){
	board = new ShipPart[r][c];
	clear();
    }

    public ShipPart[][] getBoard(){
	return board;
    }

    public void set(int r, int c, ShipPart p){
	board[r][c] = p;
    }

    public int getRow(ShipPart p){
	for(int r=0; r<board.length; r++){
	    for(int c=0; c<board[r].length; c++){
		if (board[r][c].equals(p)){
		    return r;
		}
	    }
	}
	return -1;
    }
    public int getColumn(ShipPart p){
	for(int r=0; r<board.length; r++){
	    for(int c=0; c<board[r].length; c++){
		if (board[r][c].equals(p)){
		    return c;
		}
	    }
	}
	return -1;
    }

    public boolean movePartForward(ShipPart p){
	int dir = p.getShip().getDirection();
	int dRow = 0;
	int dCol = 0;
	int row;
	int col;
	row = getRow(p);
	col = getColumn(p);
	if(row<0 || col<0){
	    return false;
	}
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
	board[row+dRow][col+dCol] = p;
	board[row][col] = null;
	return true;
    }

    public void clear(){
	for (ShipPart[] row : board){
	    for(ShipPart part : row){
		part = null;
	    }
	}
    }

    public String toString(){
	String s = "";
	for (ShipPart[] row : board){
	    for(ShipPart p : row){
		s = s + p + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
}
