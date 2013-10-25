public String sameEnds(String string)
{
        String temp;
        int p = string.length();
        int i;
        if(p%2 == 1)
        {
                i = p/2;
                p = i + 1;
        }
        else
        {
                i = p/2;
                p = i;
        }
        for(; i >= 1; i--, p++)
        {
                temp = string.substring(0, i);
                if(temp.equals(string.substring(p)))
                        return temp; 
        }
        return "";
}


public String sameEnds(String string) {
  int mid = string.length()/2;
  int mid2;
  String beg, end;
  if (string.length()%2 == 0) 
    mid2 = mid;
  else 
    mid2 = mid +1; 
  for (; mid >= 0; mid --, mid2 ++){
    beg = string.substring(0, mid);
    end = string.substring(mid2);
    if (beg.equals(end)){
     return beg;
    }
   
  } 
  return ""; //if nothing in common
}







