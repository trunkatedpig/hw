public class codingBat {
	public boolean sameStarChar(String str) {
		int ind = 1;
		boolean same = false;
		while (ind < str.length() - 1) {
			if (str.substring(ind, ind + 1).equals("*")) {
				same = str.substring(ind - 1, ind).equals(str.substring(ind + 1, ind + 2));
			}
			ind = ind + 1;
		}
		return same;
	}
	public String sameEnds(String string) {
  		String retStr = "";
  		int length = string.length();
  		for (int i = 1; 2 * i <= length; i++){
  			if (string.substring(0, i).equals(string.substring(length - i))){
  				retStr = string.substring(0, i);
  			}
  		}
  		return retStr;
	}
}