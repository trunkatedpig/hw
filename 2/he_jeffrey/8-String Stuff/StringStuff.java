public class StringStuff {
   
    public String capitalize(String name) {
	int v;
	name = name.substring(0,1).toUpperCase() + name.substring(1);
	v = name.indexOf(" ");
	name = name.substring(0,v+1) + name.substring(v+1,v+2).toUpperCase() + name.substring(v+2);
	return name;
    }
    
    public String bondify(String name) {
	String capFirst, capLast;
	int sp;
	sp = name.indexOf(" ");
	capFirst = name.substring(0,1).toUpperCase() + name.substring(1,sp);
	capLast = name.substring(sp+1,sp+2).toUpperCase() +  name.substring(sp+2);
	return capLast + ", " + capFirst + " " + capLast;
	
    }
}
