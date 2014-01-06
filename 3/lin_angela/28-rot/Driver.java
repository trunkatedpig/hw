
public class Driver {

    public static void main(String args[]){

	Rot r = new Rot();
	System.out.println(r.encode("hello",3));//khoor
	System.out.println(r.encode("abcxyz",3));//defabc
	System.out.println(r.encode("HELLO!@",3));//khoor!@
	//char a = 'a';
	//	System.out.println((char)123);


    }
}
