import java.io.*;
import java.util.*;

public class MoreFor {    
    public String diag(int n) {
	String ans = "";
	String space = "";
	for (int i = 0;i < n;i = i + 1) {
	    for (int x = i;x != 0;x = x - 1) {
		space = space + " ";
	    }
	    ans = ans + space + "*" + "\n";
	    space = "";
	}
	return ans;
    }

    public String diagWord(String w) {
	String ans = "";
	String space = "";
	for (int i = 0;i < w.length();i = i + 1) {
	    for (int x = i;x != 0;x = x - 1) {
		space = space + " ";
	    }
	    ans = ans + space + w.substring(i,i+1) + "\n";
	    space = "";
	}
	return ans;
    }

    public String fence(int h, int w) {
	String topbot = "";
	String stuff = "";
	String middle = "";
	String space = "";
	String ans = "";
	if (h>2 && w>2) {
	    for (int y = 0;y < w - 2;y = y + 1) {
		stuff = stuff + "-";
	    }
	    topbot = "+" + stuff + "+" + "\n";
	    for (int i = 0;i < h - 2;i = i + 1) {
		for (int x = 0;x < w - 2;x = x + 1) {
		    space = space + " ";
		}
		middle = middle + "|" + space + "|" + "\n";
		space = "";
	    }
	    ans = ans + topbot + middle + topbot;
	return ans;
	}
	else {
	    return "";
	}
    }
}