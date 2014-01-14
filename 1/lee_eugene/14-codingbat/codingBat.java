public boolean sameStarChar(String str){
        int counter;
        boolean ans = true;
        for (counter = 0;counter < str.length();counter++){
            if (str.substring(counter,counter+1).equals("*") && counter != 0 && counter != str.length()-1){
                if (str.substring(counter-1,counter).equals(str.substring(counter+1,counter+2)))
                    ans = true;
                else
                    return false;
            }
        }
        return ans;
    }

public String sameEnds(String string) {
  String ans ="";
  String first;
  String last;
  int counter = 1;
  first = string.substring(0,1);
  last = string.substring(string.length()-1,string.length());
  while (first.equals(last)){
    ans = first;
    counter ++;
    first = string.substring(0,counter);
    last = string.substring(string.length()-counter,string.length());
  }
  return ans;
}
