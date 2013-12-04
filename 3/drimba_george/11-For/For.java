public class For {
    public int fact2(int n) {
        int x=1;
        for (int i=n; i>0; i--) {
            x=x*i;
        }
        return x;
    }
    public String reverse(String s) {
        String r ="";
        for (int i=s.length(); i>0; i--) {
            r=r+s.substring(i-1,i);
        }
        return r;
    }
    public String table(int n, int m) {
        String r="  ";

        for (int z=1; z<=n; z++) {
            r=r+z+" ";
        }   
        r=r+"\n";
        //--------------------------//
        for (int i=1; i<=m; i++) {
            r=r+i+" ";
            for (int z=1; z<=n; z++) {
                r=r+(i*z)+" ";
            }
            r=r+"\n";
        }

        return r;
    }
}
