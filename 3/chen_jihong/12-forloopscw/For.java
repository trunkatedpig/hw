public class For{
    public String diag(int n){
	String result = "";
	String space ="";
	for (int temp = 0;temp < n;temp++){
	    result = result + space + "*" + "\n";
	    space = space +" ";
	}
	return result;
    }
    public String diagWord(String w){
	String result = "";
	String space = "";
	String l = "";
	for(int temp = 0;temp < w.length();temp ++){
	    l = Character.toString(w.charAt(temp));
	    result = result + space + l + "\n";
	    space = space + " ";
	}
	return result;
    }
    public String fence(int h,int w){
	String result = "";
	String space = "";
	if(h < 2 || w < 2){
	    return result;
	}
	result = "+";
	for(int temp = 2;temp < w;temp++){
	    result = result + "-";
	    space = space + " ";
	}
	result = result + "+";
	String topline = result;
	result = result + "\n";
	for(int temp = 2;temp < h;temp ++){
	    result =result + "|" + space + "|" + "\n";
	}
	result = result + topline;
	return result;
    }
}