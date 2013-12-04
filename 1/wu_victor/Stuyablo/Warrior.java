import java.io.*;
import java.util.*;

public class Warrior extends Character {
    private boolean shield;

    public Warrior () {
	super(100, 15, 5, 5, 10);
	shield = false;
    }

    public Warrior (int health, int str, int def, boolean s) {
	super(health, str, 5, 5, def);
	shield = s;
    }

    // Get Functions

    public boolean getShield () {
	return shield;
    }
}
