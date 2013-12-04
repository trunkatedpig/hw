public class StringStuff {
    public StringStuff() {
    }
    public String capitalize(String name) {
	int i = name.indexOf(" ");
	return name.substring(0,1).toUpperCase()+name.substring(1,i+1)+name.substring(i+1,i+2).toUpperCase()+name.substring(i+2);
    }
    public String bondify(String name) { // James Bond -> Bond, James Bond
	int i = capitalize(name).indexOf(" ");
	return capitalize(name).substring(i+1)+", "+capitalize(name);
    }
}