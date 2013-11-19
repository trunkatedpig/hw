import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Character c = new Character();
	Warrior w = new Warrior();
	Warrior w1 = new Warrior(500, 182, 200, true);

	System.out.println(c.getHealth());
	System.out.println(c.getExp());
	System.out.println(c.getStr());
	System.out.println(c.getDex());
	System.out.println(c.getWis());
	System.out.println(c.getAtk());
	System.out.println(c.getDef());
	System.out.println("------------------------------------");

	System.out.println(w.getHealth());
	System.out.println(w.getExp());
	System.out.println(w.getStr());
	System.out.println(w.getDex());
	System.out.println(w.getWis());
	System.out.println(w.getAtk());
	System.out.println(w.getDef());
	System.out.println(w.getShield());
	System.out.println("------------------------------------");

	System.out.println(w1.getHealth());
	System.out.println(w1.getExp());
	System.out.println(w1.getStr());
	System.out.println(w1.getDex());
	System.out.println(w1.getWis());
	System.out.println(w1.getAtk());
	System.out.println(w1.getDef());
	System.out.println(w1.getShield());

	
    }
}
