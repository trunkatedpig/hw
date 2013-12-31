import java.io.*;
import java.util.*;

public class MainPlayer extends Character{

    public MainPlayer(String s){
	super(s);
    }

    public void battle(Character other){
	int test = 1;
	while (test == 1){
	    test = this.meleeAttack(other);
	    if (test == 1){
		test = other.meleeAttack(this);
	    }
	}
    }


}
