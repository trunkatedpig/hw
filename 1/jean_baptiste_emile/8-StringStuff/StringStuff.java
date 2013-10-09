import java.io.*;
import java.util.*;

public class StringStuff {
public String capitalize(String name) {
String s1,s2;
s1 = name.substring(0,name.indexOf(" "));
s2 = name.substring((name.indexOf(" ") + 1));
return s1.substring(0,1).toUpperCase() + s1.substring(1) + " " + s2.substring(0,1).toUpperCase() + s2.substring(1);

}
public String bondify(String name) {
String s1;
s1 = name.substring((name.indexOf(" ") + 1));
return s1 + ", " + name;
}
}