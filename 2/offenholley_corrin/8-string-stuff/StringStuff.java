import java.io.*;
import java.util.*;

//I know, I could haved saved some space. But copy and paste made me a little more secure in my code.

public class StringStuff{
	public String capitalize(String name){
		String splitend;
		splitend = name.substring(name.indexOf(" "),name.indexOf(" ") + 2);
		String fixedend;
		fixedend = splitend.toUpperCase();
		splitbeg = name.substring(0,1);
		String fixedbeg;
		fixedbeg = splitbeg.toUpperCase();
		String firstmid;
		firstmid = name.substring(1,name.indexOf(" "));
		String secondmid;
		secondmid = name.substring(name.indexOf(" ") + 2)
		return (""+fixedbeg+firstmid+fixedend+secondmid)
	}
	public String bondify(String name){
		String splitend, sansspace;
		splitend = name.substring(name.indexOf(" "),name.indexOf(" ") + 2);
		sansspace = name.substring(name.indexOf(" ") + 1,name.indexOf(" ") + 2);
		String fixedend, fixedsans;
		fixedend = splitend.toUpperCase();
		fixedsans = sansspace.toUpperCase();
		splitbeg = name.substring(0,1);
		String fixedbeg;
		fixedbeg = splitbeg.toUpperCase();
		String firstmid;
		firstmid = name.substring(1,name.indexOf(" "));
		String secondmid;
		secondmid = name.substring(name.indexOf(" ") + 2)
		return (""+sansspace+secondmid+", "+fixedbeg+firstmid+fixedend+secondmid)
	}
}
