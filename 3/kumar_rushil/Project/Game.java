import java.io.*;
import java.util.*;

public class Game{
    MainPlayer player = new MainPlayer("Rushil");
    Character c1 = new Character("David");
    Gui g;

    public void battle(){
// need to do this somehow with a while loop
       	// while(g.isShowing()){
    	g = new Gui(player,c1);
	// }
	player = g.getMainPlayer();
	c1 = g.getEnemy();
	System.out.println(player.getHealth());
    }

}
