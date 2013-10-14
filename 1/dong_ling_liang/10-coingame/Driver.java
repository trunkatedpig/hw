import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
	CoinGame game = new CoinGame();
	game.setup();
	game.play(35);
	System.out.println(game.winning());
    }
}