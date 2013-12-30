import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Game g = new Game();
	Character c1 = new Character("David");
	g.battle(c1);
    }
}
