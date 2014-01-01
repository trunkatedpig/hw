import java.io.*;
import java.util.*;

public class MainPlayer extends Character{

    Gui g;

    public MainPlayer(String s){
	super(s);
    }

    public void battle(Character other){
	//need to transfer most of this to the Gui class
	//the two characters inside the gui will fight and then the characters that were put in the gui will be equaled to the ones that just fought
    // 	int test = 1;
    // 	while (test == 1){
    // 	    test = this.meleeAttack(other);
    // 	    if (test == 1){
    // 		test = other.meleeAttack(this);
    // 	    }
    // 	}
	g = new Gui(this,other);
    }
}
