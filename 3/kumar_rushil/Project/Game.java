import java.io.*;
import java.util.*;

public class Game{
    Character player = new Character("Rushil");
    // Character c1 = new Character("David");

    public void battle(Character other){
	int test = 1;
	while (test == 1){
	    test = player.meleeAttack(other);
	    if (test == 1){
		test = other.meleeAttack(player);
	    }
	}
    }
}
