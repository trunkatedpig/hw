public class codingbat{

public String sameEnds(String string) {
String answer="";
int n=string.length();

if (n%2==0){
   int q=(n/2);
   int a=0;
   int b=q;
   while (a<q && b<n){
      String c=string.substring(a,a+1);
      String d=string.substring(b,b+1);
      if (c.equals(d)){
         answer=answer+c;
         a=a+1;
         b=b+1;}
      else {
         b=b+1;}}
   return answer;}

else{
int q=(n/2)+1;
int a=0;
   int b=q;
   while (a<q && b<n){
      String c=string.substring(a,a+1);
      String d=string.substring(b,b+1);
      if (c.equals(d)){
         answer=answer+c;
         a=a+1;
         b=b+1;}
      else {
         b=b+1;}}
   return answer;}}

public boolean sameStarChar(String str) {
  if (str.indexOf("*")==-1){
     return true;}
  for (int n=1;n<str.length()-1;n++){
     String a=str.substring(n-1,n);
     String b=str.substring(n,n+1);
     String c=str.substring(n+1,n+2);
     if (b.equals("*")){
           if (!(a.equals(c)))
           return false;}}
  return true;}

}
