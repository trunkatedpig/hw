public boolean sameStarChar(String str) {
  int x = 1;
  while ( x < str.length() - 1 ) {
    if ( str.substring ( x , x + 1 ).equals ( "*" ) )
      if ( !str.substring ( x - 1 , x ).equals ( str.substring ( x + 1 , x + 2 ) ) )
        return false;
    x = x + 1;
  }
  return true;
}

public String sameEnds(String string) {
  String ans = new String();
  ans = "";
  for ( int x = 1 ; x <= string.length()/2 ; x++ ) {
    if ( string.substring ( 0 , x ).equals( string.substring ( string.length()- x ) ) )
      ans = string.substring ( 0 , x );
      }
  return ans;
}
