import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	//testing out the code//
	StringStuff s = new StringStuff();
	System.out.println(s.capitalize("beef stew"));
	System.out.println(s.capitalize("chicken poo"));

	System.out.println(s.bondify("Tyler Wang"));
	System.out.println(s.bondify("Brian Guo"));

	//flaws still present in the code//
	StringStuff s1 = new StringStuff();
	System.out.println(s1.capitalize("elise spider-queen"));
	System.out.println(s1.bondify("Tianshi Wang Jr."));
	
	//pig latin testing
	System.out.println(".............................");
	System.out.println("TESTING PIG LATIN");
	pigLatin p = new pigLatin();
	System.out.println(p.runPigLatin("apple"));
	System.out.println(p.runPigLatin("Elephant"));
	System.out.println(p.runPigLatin("Chimera"));
	System.out.println(p.runPigLatin("shriek"));
	System.out.println(p.runPigLatin("monster"));
	System.out.println(p.runPigLatin("Lullaby"));
	System.out.println(p.runPigLatin("Mr. Wang"));
	System.out.println(p.runPigLatin("forget-me-not"));
			   
    }
}
