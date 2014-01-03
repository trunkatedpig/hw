public class Player implements Creature {
    private String name;
    private Tile curtile;
    private Map curmap;
    
    public Player() {
	name = "BAKA";
    }

    public String getName() {return name;}
    public Tile getCurTile() {return curtile;}
    public Map getCurMap() {return curmap;}

    public char getOut() {
	return '@';
    }
}
