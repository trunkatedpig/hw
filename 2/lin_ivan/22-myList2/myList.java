public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
 data = new int[5];
 numItems=0;
    }

    public boolean isFull() {
 return numItems >= data.length;
    }

    public void grow() {
     // "grow" the array by creating a new one and copying over
     int[] tmpArray = new int[data.length+data.length/2];
     for (int i=0;i<data.length;i++) 
  tmpArray[i]=data[i];
     data = tmpArray;
    }

    public void add(int d) {
 if (isFull()){
     grow();
 }
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
 String s = Arrays.toString(data)+" : "+numItems;
 return s;
    }
 
    public void add(int pos, int d) {
  // to be completed by you
  // inserts the value d at location (index) pos)
  // recall the algorithm we developed in calss:
  // 1. Grow if needed
  // 2. shift everything past the insertion point down
  // 3. add the new item
  // 4. numitems++
      public void add(int d) {
        
        if (numItems>=data.length) {
            System.out.println("Growing from "+data.length+" to "+data.length*1.5);
            // "grow" the array by creating a new one and copying over
            int[] tmpArray = new int[data.length+data.length/2];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }
 }

    public void remove(int pos) {
  // removes the item at location pos
  // 1. shift everything down to remove the item
  // 2. numitems--;
 }
 public int size() {
  // return the number of items in the list
   return data.length;
 }
 public int get(int pos) {
  //return the item at pos;
   return data[pos];
 }
 public int set(int pos, int d) {
  // change the item at pos to have the value d
   data[pos] = d;
 }
}