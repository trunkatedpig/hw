import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class ShipPart extends JPanel{
    private Ship ship;
    private boolean visable;

    public ShipPart(Ship s){
	ship = s;
	visable = !(ship.isEnemy());
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
    public String toString(){
	return ship.toString() + "part";
    }
    
       
       

}
