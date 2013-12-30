import java.io.*;
import java.util.*;

public class Weapon{
    protected int value, wpndmg;
    protected String name;

    public Weapon(){
	wpndmg = 10;
	value = 0;
	name = "Iron Sword";
    }

    public int getDamage(){
	return wpndmg;
    }

}
