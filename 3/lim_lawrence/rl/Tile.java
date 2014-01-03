public class Tile {
    private int x,y;
    private int type;
    private Creature creature;

    public Tile(int ax, int ay) {
	x=ax;
	y=ay;
	type=0;
	creature=null;
    }

    public Creature getCreature() {return creature;}

    public char getOut() {
	if(creature==null) {
	    return '.';
	} else {
	    return creature.getOut();
	}
    }

    public void setCreature(Creature c) {
	creature = c;
    }

}
