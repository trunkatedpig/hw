public class myList{
    public void insert (int[] a, int pos, int d){
	int[] b=new int[a.length+1];
	for (int i=0;i<pos;i++){
	    b[i]=a[i];}
	b[pos]=d;
	for (int i=pos+1;i<b.length;i++){
	    b[i]=a[i-1];}
	a=b;
	for (int i=0;i<a.length;i++){
	    System.out.println(a[i]);}
    }
}
