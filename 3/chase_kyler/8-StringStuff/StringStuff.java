import java.util.*;
import java.io.*;

public class StringStuff {

	public String capitalize(String name) {
		String result;
		result = name.toUpperCase();
		return result;
	}

	public String bondify(String name) {
		String result;
		result = name.substring(name.lastIndexOf(" ") + 1) + ", " + name;
		return result;
	}

	public String pigLatinify(String name) {
		String fl = name.substring(0,1);
		String fl2 = name.substring(0,2);
		String sl = name.substring(1,2);
		if (fl.equals("a") || fl.equals("e") || fl.equals("i") || fl.equals("o") || fl.equals("u")) {
			name = name + "-yay";}
		else if (fl2.equals("ch") || fl2.equals("sh") || sl.equals("l") || sl.equals("r") || fl2.equals("ph") || fl2.equals("ps") || fl2.equals("th") || fl2.equals("sn") || fl2.equals("st") || fl2.equals("gn") || fl2.equals("kn")) {
			name = name.substring(2) + "-" + fl2 + "ay";}
		else {
			name = name.substring(1) + "-" + fl + "ay";}
		return name;


	}

	public String reverse(String s) {
		l = s.lengthOf();
		

}



