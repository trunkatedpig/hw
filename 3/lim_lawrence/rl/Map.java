public class Map {
    final int width = 60;
    final int height = 20;
    private Tile[][] tiles;
    
    public Map() {
	tiles = new Tile[width][height];
	initTiles();
    }

    private void initTiles() {
	for(int y=0; y<height; y++) {
	    for(int x=0; x<width; x++) {
		tiles[x][y] = new Tile(x,y);
	    }
	}
    }

    public Tile getTile(int x,int y) {return tiles[x][y];}
}
