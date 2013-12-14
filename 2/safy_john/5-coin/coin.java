import.java.io.*;
import.java.util.*;

public class coin {

    public String face;
    public int flipsh;
    public int flipst;
    public int flips;
    public int fair;

    public coin () {
	flipsh = 0;
	flipst = 0;
	flips = 0;
	fair = 0;
    }

    public void reset () {
	flipsh = 0;
	flipst = 0;
	flips = 0;
	//fair = 0; (I'm not sure if we're supposed to set fair to 0 too.)
    }

    public String getFace () {
	return face;
    }
