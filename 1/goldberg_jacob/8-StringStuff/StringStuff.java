import java.io.*;
import java.util.*;

public class StringStuff {
	private int spaceBreak;
	private String firstname;
	private String lastname;

	public StringStuff(String nme){
		capitalizer(nme);
	}
	
	public void capitalizer(String name){
		spaceBreak = name.indexOf(" ");
		firstname = (name.substring(0, 1)).toUpperCase() + name.substring(1, spaceBreak);
		lastname = (name.substring(spaceBreak + 1, spaceBreak + 2)).toUpperCase() + name.substring(spaceBreak+2);
	}

	public String capitalize(){
		return firstname + " " + lastname;
	}

	public String bondify(){
		return lastname + ", " + firstname + " " + lastname;
	}
}
