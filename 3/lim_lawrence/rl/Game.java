public class Game { 
    private Player plr;
    private Map curmap;
    private Terminal term;

    public Game(Terminal t, Player p, Map m) {
	term=t;
	plr=p;
	curmap=m;
    }

    public void spawnPlayer(int x, int y) {
	curmap.getTile(x,y).setCreature(plr);
    }
}
