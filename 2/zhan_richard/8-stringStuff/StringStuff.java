public class StringStuff{
    public String capitalize(String name){
	String F = name.substring(0,1);
	F = F.toUpperCase();
	int space = name.indexOf(" ");
	String L = name.substring(space+1,space+2);
	L = L.toUpperCase();
	String result = F + name.substring(1,space) + " " + L + name.substring(space+2);
	return result;
        
    }
    public String bondify(String name){
        String F = name.substring(0,1);
	F = F.toUpperCase();
	int space = name.indexOf(" ");
	String L = name.substring(space+1,space+2);
	L = L.toUpperCase();
	String result =  L + name.substring(space+2)+ ", " + F + name.substring(1,space)+ " " +  L + name.substring(space+2);
	return result;
    }
}
