public class Cipher {
    public static void main ( String[] args ) {
	Cipher a = new Cipher();
	System.out.println ( a.encode ( "hello" , 3 ) );
	System.out.println ( a.encode ( "abcxyz" , 3 ) );
	System.out.println ( a.encode ( "hi there!" , 1 ) );
	System.out.println ( a.encode ( "hello" , 13 ) );
	System.out.println ( a.encode ( "uryyb" , 13 ) );
    }

    public String encode ( String code2 , int rotate ) {
	String code = code2;
	code.toLowerCase();
	String ans = new String();
	for ( int i = 0 ; i < code.length() ; i++ ) {
	    if ( code.charAt ( i ) < 'a' || code.charAt ( i ) > 'z' )
		ans = ans + code.charAt ( i );
	    else if ( code.charAt ( i ) + rotate <= 'z' )
		ans = ans + Character.toString ( (char) ( code.charAt ( i )  + rotate ) );
	    else {
		int add = 'a' + ( rotate + code.charAt ( i ) - 'z' - 1 );
		ans = ans + Character.toString ( (char) add );
	    }
	}
	return ans;
    }
}
