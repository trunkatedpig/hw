public class myList{
    int[] array;
    public myList(int n){
	array = new int[n];
	for (int x = 0; x < n; x++){
	    array[x] = x;
	}
    }

    public String toString(){
	String s = new String();
	s = "[";
	for (int x = 0; x < array.length-1; x++){
	    s = s + array[x] + ",";
	}
	s = s + array[array.length-1]+"]";
	return s;
    }

    public void insert(int pos, int d){
	int[] a = new int[array.length + 1];
	for (int c = 0; c < pos; c++){
	    a[c] = array[c];
	}
	a[pos] = d;
	for (int c = pos; c < array.length; c++){
	    a[c+1] = array[c];
	}
	array = a;
    }
    public int remove(int pos){
	int x = array[pos];
	int[] a = new int[array.length - 1];
	for (int c = 0; c < pos; c++){
	    a[c] = array[c];
	}
	for (int c = pos+1; c < array.length; c++){
	    a[c-1] = array[c];
	}
	array = a;
	return x;
    }

}
