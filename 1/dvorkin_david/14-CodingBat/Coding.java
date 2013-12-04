public boolean sameStarChar(String str) {

        boolean x=true;
        for (int i = 1; i < str.length() - 1;i = i + 1){
            if (str.substring(i,i+1).equals("*")){
                 if (str.substring(i-1, i).equals(str.substring(i+1,i+2))){
                 x = true;
                 }
                 else{
                 x=false;
                 }
                }


            }


        return x;
    }

public String sameEnds(String str) {
        int stop=str.length()/2;
        String result="";
        for (int i=0;i<=stop; i++) {
            if (str.substring(0,i).equals(str.substring(str.length()-i))) {
               result=str.substring(0,i);
            }
        }
        return result;
    }
