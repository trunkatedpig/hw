import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name) {
	int space = name.indexOf(" ");
	String fletter = name.substring(0,1).toUpperCase();
	String fname = name.substring(1,space);
	String sletter = name.substring(space + 1,space + 2).toUpperCase();
	String sname = name.substring(space + 2);
       	return fletter + fname + " " +  sletter + sname;
    }
    public String bondify(String name) {
	int space = name.indexOf(" ");
	String fname = name.substring(0,space);
	String sname = name.substring(space + 1);
	return sname + ", " + fname + " " + sname;
    }
    /*    public String PigLatinify(String name) { FAILURE (SUCCESS BELOW)
	if (name.indexOf("a") != -1) {
	    int a = name.indexOf("a");}
	else {
	    int a = name.length();}
	if (name.indexOf("e") != -1) {
	    int e = name.indexOf("e");}
	else {
	    int e = name.length();}
	if (name.indexOf("i") != -1) {
	    int i = name.indexOf("i");}
	else {
	    int i = name.length();}
	if (name.indexOf("o") != -1) {
	    int o = name.indexOf("o");}
	else {
	    int o = name.length();}
	if (name.indexOf("u") != -1) {
	    int u = name.indexOf("u");}
	else {
	    int u = name.length();}
	int ae = Math.min(a,e);
	int aei = Math.min(ae,i);
	int aeio = Math.min(aei,o);
	int firstvowel = Math.min(aeio,u);
	if (firstvowel < 1) {
		name = name + "yay";
	    }
	else {
	    String firstgroup = name.substring(0,firstvowel);
	    String postgroup = name.substring(firstvowel);
	    name = postgroup + firstgroup + "ay";
	}
	//return name;
	return String.valueOf(firstvowel);
	} */
    public int firstVowel(String name, int pos) {
	if (name.substring(pos,pos + 1).equals("a") || name.substring(pos,pos + 1).equals("e") || name.substring(pos,pos + 1).equals("i") || name.substring(pos,pos + 1).equals("o") || name.substring(pos,pos + 1).equals("u")) {
	    return pos;
	} else if (pos == name.length() - 1) {
	    return pos;
	} else {
	    return firstVowel(name,(pos+1));}
    }
    public String PigLatinify(String name) {
	int firstvowel = firstVowel(name,0);
	if (firstvowel == name.length() - 1 || firstvowel == 0) {
	    name = name + "yay";
	} else {
	    String firstgroup = name.substring(0,firstvowel);
	    String postgroup = name.substring(firstvowel);
	    name = postgroup + firstgroup + "ay";
	}
	return name;
	//	return String.valueOf(firstvowel);
    }
}
