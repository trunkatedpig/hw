import java.io.*;
import java.util.*;

public class CodingBat{
	
	public boolean sameStarChar(String str){
		boolean isIt=true;
		for (int i=1; i<str.length()-1; i++){
			String check=str.substring(i,i+1);
			if (check.equals("*")){
				if (!str.substring(i-1,i).equals(str.substring(i+1,i+2))){
					isIt=false;
				}
			}
		}
		
		return isIt;
	}
	
	//needs editing
	
	public String sameEnds(String string){
		String same="";
		int middle;
		if (string.length()%2 != 0){
			middle=(string.length()+1)/2;
			String part1=string.substring(0,middle);
			String part2=string.substring(middle+1,string.length()-1);
			for (int i=0; i<middle; i++){
				if (part1.substring(i,i+1).equals(part2.substring(i,i+1))){
					same=same + part1.substring(i,i=1);
				}
			}
		}
		else {
			middle=string.length()/2;
		}
		return same;
	}
}