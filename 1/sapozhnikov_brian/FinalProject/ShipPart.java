import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class ShipPart extends JPanel{
    private Ship ship;
    private int r,c;
    private boolean visable;

    public ShipPart(Ship s, int r, int c){
	ship = s;
	this.r=r;
	this.c=c;
	visable = !(ship.isEnemy());
    }


    public int getRow(){
	return r;
    }
    public void setRow(int r){
	this.r = r;
    }
    public int getColumn(){
	return c;
    }
    public void setColumn(int c){
	this.c = c;
    }
    public Ship getShip(){
	return ship;
    }
    public boolean getVisability(){
	return visable;
    }
    public void setVisability(boolean b){
	visable = b;
    }
       
       

}
