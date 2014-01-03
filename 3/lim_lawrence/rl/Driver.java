public class Driver {
    public static void main(String[] args) {
	Terminal term = new Terminal();
	Map m1 = new Map();
        Player plr = new Player();
	Game g = new Game(term, plr, m1);

	term.setCurMap(m1);

	g.spawnPlayer(4,4);
	term.update();
	term.print();
    }
}
