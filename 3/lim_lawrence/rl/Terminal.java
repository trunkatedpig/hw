public class Terminal {
    final int width = 80;
    final int height = 25;
    private char[][] out;
    private Map curmap;
    
    public Terminal() {
	out = new char[width][height];
	initOut();
    }
    
    private void initOut() {
	for(int y=0; y<height; y++) {
	    for(int x=0; x<width; x++) {
		out[x][y]='#';
	    }
	}
    }
    
    public void setCurMap(Map m) {curmap=m;}

    public void update() {
	for(int y=0; y<curmap.height; y++) {
	    for(int x=0; x<curmap.width; x++) {
	        out[x][y]=curmap.getTile(x,y).getOut();
	    }
	}
    }

    /* y u lie to me stackoverflow
    public void clear() {
	String os = System.getProperty("os.name");
	try {
	    if (os.contains("Windows")){
		Runtime.getRuntime().exec("cls");
	    } else {
		Runtime.getRuntime().exec("clear");
	    }
	} catch(Exception e) {
	    System.out.println(os);
	    System.out.println(e);
	}
    }
    */
    
    public void print() {
	String r = "";
	for(int y=0; y<height; y++) {
	    for(int x=0; x<width; x++) {
		r+=out[x][y];
	    }
	    r+="\n";
	}
	//clear();
	System.out.println(r);
    }
}
