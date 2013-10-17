import java.io.*;
import java.util.*;
import java.math.*;

public class Coin{
    private String face;

    public Coin() {
	flip();}

    public void flip() {
	if (Math.random() > 0.50) {
	    face = "heads";}
	else {
	    face = "tails";}
    }
    
    public String getFace() {
	return face;}
}
