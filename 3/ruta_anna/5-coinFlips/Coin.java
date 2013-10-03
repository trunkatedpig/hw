import java.io.*;
import java.util.*;

public class Coin {

	private String face;
	private int flipCount;
	private int headCount;

	public void resetCounts() {
		flipCount = 0;
		headCount = 0;
	}

/* Does not set the value of the face, only returns current face value */

	public String getCurrentFace() {
		return face;
	}

}