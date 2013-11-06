import java.io.*;
import java.util.*;

public class Character {
    protected double atk;
    protected int health, exp, str, dex, wis, def;

    public Character () {
	health = 100;
	exp = 0;
	str = 10;
	dex = 10;
	wis = 10;
	atk = str/10;
	def = 0;
    }
    public Character (int h) {
	health = h;
	exp = 0;
	str = 10;
	dex = 10;
	wis = 10;
	atk = str/10;
	def = 0;
    }
    public Character (int h, int s, int d, int w, int f) {
	health = h;
	exp = 0;
	str = s;
	dex = d;
	wis = w;
	atk = str/10;
	def = f;
    }

    // Get Functions

    public int getHealth () {
	return health;
    }

    public int getExp () {
	return exp;
    }

    public int getStr () {
	return str;
    }

    public int getDex () {
	return dex;
    }

    public int getWis () {
	return wis;
    }

    public double getAtk () {
	return atk;
    }

    public int getDef () {
	return def;
    }
}
