import java.io.*;
import java.util.*;

public class Coin {
    private String face;

    public void flip() {
	int random = (int)(Math.random() * 100 + 1);
	if (random <= 50)
	    face = "heads";

	else
	    face = "tails";

    }

    public String getFace() {
	return face;
    }

}
