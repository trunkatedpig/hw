// Problem 1 

public boolean sameStarChar(String str) {
  int length = str.length();
  boolean ans = true;
  for(int i = 1; i < (length - 1); i++) {
     String thisChar = str.substring(i, i + 1);
     String prevChar = str.substring(i - 1, i);
     String nextChar = str.substring(i + 1, i + 2);
     if (thisChar.equals("*")) {
        if (!(prevChar.equals(nextChar))) {
           ans = false;
        }
     }
  }
  return ans;
}

// Problem 2

public String sameEnds(String string) {
	int length = string.length();
	int halfLength = (int)(length / 2); 
	String firstHalf;
	String secondHalf;
	if ((length % 2) == 0) {
		firstHalf = string.substring(0, halfLength);
		secondHalf = string.substring(halfLength);
	} else {
		firstHalf = string.substring(0, halfLength);
		secondHalf = string.substring(halfLength + 1);
	}

	for (int i = 0; i < firstHalf.length(); i++) {
		if (firstHalf.equals(secondHalf)) {
			return firstHalf;
		} else {
			firstHalf = firstHalf.substring(0, firstHalf.length() - 1);
			secondHalf = secondHalf.substring(1);
		}
	}

	firstHalf = "";
	return firstHalf;
}