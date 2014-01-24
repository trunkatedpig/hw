import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class chetris {
    public static void main ( String[] args ) {
	ChetrisGame game = new ChetrisGame();
    }
}

class ChetrisGame implements Runnable {
    private JPanel f;
    private JFrame f2;
    private ChessBoard chessBoard;
    private TetrisBoard p1t , p2t , pt;
    //    private JButton start;
    private int player , finishedTurn;
    private Thread t;

    public ChetrisGame() {
	chessBoard = new ChessBoard();
	p1t = new TetrisBoard();
	p2t = new TetrisBoard();
	//	start = new JButton ( "Start" );
	t = new Thread ( this );
	f = new JPanel();
	f2 = new JFrame("Chetris");
	f.add ( p2t );
	f.add ( chessBoard );
	f.add ( p1t );
	f2.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
	f2.getContentPane().setLayout ( new BorderLayout () );
	f2.setVisible ( true );
	//	f2.getContentPane().add ( start , BorderLayout.PAGE_START );
	f2.getContentPane().add ( f );
	f2.show();
	f2.pack();
	player = 1;
	pt = p1t;
	p1t.t.start();
	p2t.t.start();
	p2t.t.suspend();
	t.start();
    }

    public void run() {
	while ( true ) {
	    try {
		t.sleep ( 70 );
	    } catch ( InterruptedException e ) {
	    }
	    if ( chessBoard.moveOver == 1 ) {
		String direction = chessBoard.direction;
		if ( direction.length() > 0 ) {
		    System.out.println ( direction );
		    if ( direction.equals ( "up" ) )
			pt.rotate();
		    if ( direction.equals ( "down" ) )
			pt.wait = 50;
		    if ( direction == "left" ) {
			if ( pt.piece == pt.piece1 && pt.x < pt.buttons [ pt.y ].length + 3 ||
			     pt.x < pt.buttons [ pt.y ].length + 2 ||
			     pt.piece == pt.piece3 && pt.x > 0 ||
			     pt.x > 1 ) {
			    System.out.println ( "going left" );
			    pt.z = -1;
			    pt.recolor();
			    pt.t.resume();
			}
		    }
		    else if ( direction == "right" ) {
			if ( pt.piece == pt.piece1 && pt.x < pt.buttons [ pt.y ].length + 3 ||
			     pt.x < pt.buttons [ pt.y ].length + 2 ||
			     pt.piece == pt.piece3 && pt.x > 0 ||
			     pt.x > 1 ) {
			    System.out.println ( "going right" );
			    pt.z = 1;
			    pt.recolor();
			    pt.t.resume();
			}
		    }
		}
		else {
		    pt.z = 0;
		    pt.wait = 500;
		}
	    }
	    if ( pt.moveOver == 1 ) {
		System.out.println ( "tetris move over" );
		if ( chessBoard.moveOver == 1 ) {
		    if ( pt == p1t )
			pt = p2t;
		    else if ( pt == p2t )
			pt = p1t;
		    pt.moveOver = 0;
		    chessBoard.moveOver = 0;
		    System.out.println (  p1t == pt);
		    pt.start();
		    pt.t.resume();
		}
	    }
	}
    }
}




























class ChessBoard extends JPanel implements ActionListener , KeyListener {
    private JButton[][] buttons = new JButton [ 8 ] [ 8 ];
    private int[] currentMove = new int [ 2 ];
    private ArrayList<int[]> options = new ArrayList<int[]>();
    protected String piece , direction;
    protected int turn , moveOver;

    public ChessBoard() {
	piece = new String();
	direction = new String();
	turn = 1;
	super.setLayout ( new GridLayout ( 8 , 8 ) );
	for ( int row = 0 ; row < buttons.length ; row++ ) {
	    for ( int col = 0 ; col < buttons [ row ].length ; col++ ) {
		if ( row == 1 || row == buttons.length - 2 ) {
		    if ( row == 1 )
			setPiece ( "p2_pawn" , row , col );
		    if ( row == buttons.length - 2 )
			setPiece ( "p1_pawn" , row , col );
		}
		else if ( row == buttons.length - 1 || row == 0 ) {
		    if ( col == 0 || col == buttons [ row ].length - 1 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1_rook" , row , col );
			if ( row == 0 )
			    setPiece ( "p2_rook" , row , col );
		    }
		    else if ( col == 1 || col == buttons [ row ].length - 2 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1_knight" , row , col );
			if ( row == 0 )
			    setPiece ( "p2_knight" , row , col );
		    }
		    else if ( col == 2 || col == buttons [ row ].length - 3 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1_bishop" , row , col );
			if ( row == 0 )
			    setPiece ( "p2_bishop" , row , col );
		    }
		    else if ( col == 3 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1_queen" , row , col );
			if ( row == 0 )
			    setPiece ( "p2_queen" , row , col );
		    }
		    else if ( col == 4 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1_king" , row , col );
			if ( row == 0 )
			    setPiece ( "p2_king" , row , col );
		    }
		}
		else buttons [ row ] [ col ] = new JButton ( row + " " + col );
		System.out.println ( "rowcol: " + row + ", " + col );
		buttons [ row ] [ col ].addActionListener ( this );
		buttons [ row ] [ col ].addKeyListener ( this );
		this.add ( buttons [ row ] [ col ] );
	    }
	}
    }

    public void keyReleased ( KeyEvent e ) {
	direction = new String();
    }
    public void keyPressed ( KeyEvent e ) {
	if ( e.getKeyCode() == KeyEvent.VK_UP ) {
	    direction = "up";
	}
	if ( e.getKeyCode() == KeyEvent.VK_DOWN ) {
	    direction = "down";
	}
	if ( e.getKeyCode() == KeyEvent.VK_LEFT ) {
	    direction = "left";
	}
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	    direction = "right";
	}
    }
    public void keyTyped ( KeyEvent e ) {
    }

    public void setPiece ( String name , int row , int col ) {
	buttons [ row ] [ col ] = new JButton ( row + " " + col + name );
	try {
	    Image image = ImageIO.read ( getClass().getResource ( name + ".png" ) );
	    buttons [ row ] [ col ].setIcon ( new ImageIcon ( image ) );
	} catch ( IllegalArgumentException e ) {
	    System.out.println ( name );
	} catch ( IOException e ) {
	}
	piece = name;
    }

    public Dimension getPreferredSize() {
	return new Dimension ( 300 , 300 );
    }

    public void actionPerformed ( ActionEvent e ) {
	System.out.println ( e );
	System.out.println ( "getText" + ( ( JButton ) e.getSource() ).getText() );
	piece =  ( ( JButton ) e.getSource() ).getText().substring ( 3 );
	String row = ( ( JButton ) e.getSource() ).getText().substring ( 0 , 1 );
	String col = ( ( JButton ) e.getSource() ).getText().substring ( 2 , 3 );
	int r = Integer.parseInt ( row );
	int c = Integer.parseInt ( col );
	System.out.println ( buttons [ r ] [ c ].getBackground().equals ( Color.blue ) );
	if ( buttons [ r ] [ c ].getBackground() != Color.blue ) {
	    System.out.println ( "not blue" );
	    System.out.println ( r + ", " + c );
	    for ( int[] coor : options ) {
		System.out.println ( "set null: " + coor [ 0 ] + ", " + coor [ 1 ] );
		buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( null );
	    }
	    options.clear();
	}
	if ( turn == 1 ) {
	if ( piece.equals ( "p1_pawn" ) ) {
	    getOptions ( "p1 pawn" , r , c );
	    System.out.println ( "pawn selected" );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1_knight" ) ) {
	    getOptions ( "knight" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1_rook" ) ) {
	    getOptions ( "rook" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1_bishop" ) ) {
	    getOptions ( "bishop" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1_king" ) ) {
	    getOptions ( "king" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1_queen" ) ) {
	    getOptions ( "queen" , r , c );
	    selectPiece ( e , r , c );
	}
	}
	if ( turn == 2 ) {
	if ( piece.equals ( "p2_pawn" ) ) {
	    getOptions ( "p2 pawn" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2_rook" ) ) {
	    getOptions ( "rook" , r , c );
	    selectPiece ( e , r , c );
	}
	if (  piece.equals ( "p2_bishop" ) ) {
	    getOptions ( "bishop" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2_knight" ) ) {
	    getOptions ( "knight" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2_king" ) ) {
	    getOptions ( "king" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2_queen" ) ) {
	    getOptions ( "queen" , r , c );
	    selectPiece ( e , r , c );
	}
	}
	System.out.println ( "color matches?" );
	System.out.println ( r + ", " + c );
	System.out.println ( buttons [ r ] [ c ].getBackground().equals ( Color.blue ) );
	if ( ( ( JButton ) e.getSource() ).getBackground() == Color.blue ) {
	    piece = buttons [ currentMove [ 0 ] ] [ currentMove [ 1 ] ].getText().substring ( 3 );
	    System.out.println ( piece );
	    System.out.println ( "move pawn" );
	    System.out.println ( Arrays.toString ( currentMove ) );
	    try {
		System.out.println ("piece" + piece);
		Image image = ImageIO.read ( getClass().getResource ( piece + ".png" ) );
		buttons [ r ] [ c ].setIcon ( new ImageIcon ( image ) );
		buttons [ r ] [ c ].setBackground ( null );
		buttons [ r ] [ c ].setText ( row + " " + col + piece );
		System.out.println ( "change image: " + row + ", " + col );
		System.out.println ( buttons [ r ] [ c ].getText() );
		int[] removed = { r , c };
	    } catch ( IOException ex ) {
		System.out.println ( "fail" );
	    }
	    System.out.println ( "options: " );
	    for ( int[] coor : options ) {
		buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( null );
		System.out.println ( Arrays.toString ( coor ) + "    opt" );
	    }
	    buttons [ currentMove [ 0 ] ] [ currentMove [ 1 ] ].setIcon ( null );
	    buttons [ currentMove [ 0 ] ] [ currentMove [ 1 ] ].setText ( currentMove [ 0 ] + " " + currentMove [ 1 ] );
	    options.clear();
	    System.out.println ( "turn: " + turn );
	    if ( turn == 1 ) {
		turn = 2;
	    }
	    else {
		turn = 1;
	    }
	    moveOver = 1;
	    checkCheck();
	    //getKing ( turn );
	}
    }

    public void checkCheck() {
	int anotherNumber = 0;
	//if ( turn == 0 )
	//anotherNumber = 1;
	String kings = getKing ( turn );
	int[] kingcoors = { Integer.parseInt ( kings.substring ( 0 , 1 ) ) , Integer.parseInt ( kings.substring ( 2 , 3 ) ) };
	for (int q=kingcoors[1] + 1 ; q<buttons.length-1; q++) {
	    System.out.println ( "kingcoors: " + Arrays.toString ( kingcoors ) + "q:" + q );
	    if (buttons[ kingcoors[0] ] [ q ].getIcon() != null){
		System.out.println ( "success kind of"+Integer.parseInt(buttons [ kingcoors[0] ] [ q ].getText().substring(4,5)) );
		if (Integer.parseInt(buttons [ kingcoors[0] ] [ q ].getText().substring(4,5))==turn) {
		    System.out.println("SAME TEAM RIGHT");
		    break;
		}
		System.out.println("piece" + q + "units right ="+ buttons[ kingcoors[0] ] [ q ].getText().substring( 6 ));
		if (buttons[ kingcoors[0] ] [ q ].getText().substring( 6 ).equals( "rook") ) {
		    System.out.println ( "check" );
		    break;
		}
	    }
	}
	for (int q=kingcoors[1]- 1 ; q>0; q--) {
	    System.out.println ( "kingcoors: " + Arrays.toString ( kingcoors ) + "q:" + q );
	    if (buttons[ kingcoors[0] ] [ q ].getIcon() != null){
		System.out.println ( "success kind of"+Integer.parseInt(buttons [ kingcoors[0] ] [ q ].getText().substring(4,5)) );
		if (Integer.parseInt(buttons [ kingcoors[0] ] [ q ].getText().substring(4,5))==turn) {
		    System.out.println("SAME TEAM LEFT");
		    break;
		}
		System.out.println("piece" + q + "units right ="+ buttons[ kingcoors[0] ] [ q ].getText().substring( 6 ));
		if (buttons[ kingcoors[0] ] [ q ].getText().substring( 6 ).equals( "rook") ) {
		    System.out.println ( "check left" );
		    break;
		}
	    }
	}
	System.out.println ( "here is the king" + Arrays.toString ( kingcoors ) );

    }

    public String getKing ( int turn ) {
     	for ( JButton[] a : buttons ) {
	    // int j = 0;
	    for ( JButton i : a ) {
	    // 	j = j + 1;
	    // 	System.out.println ( "count: " + j );
		if ( i.getText().length() > 3 ) {
		    //System.out.println("more than 3");
		    if ( Integer.parseInt ( i.getText().substring ( 4 , 5 ) ) == turn ) {
			//System.out.println("correct player");
			System.out.println(i.getText().substring ( 6 ));
			if ( i.getText().substring ( 6 ).equals ( "king" ) ) {
			    System.out.println ( "comparison:" + i.getText().substring ( 0 , 3 ) );
			    return i.getText().substring ( 0 , 3 );
			}
		    }
		}
	    }
	}
	return "can't find king";
    }

    public void selectPiece ( ActionEvent e , int r , int c ) {
	System.out.println ( Arrays.toString ( currentMove ) );
	buttons [ currentMove [ 0 ] ] [ currentMove [ 1 ] ].setBackground ( null );
	currentMove [ 0 ] = r;
	currentMove [ 1 ] = c;
	System.out.println ( "currentMove: " +  Arrays.toString ( currentMove ) );
	for ( int[] coor : options ) {
	    buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( Color.blue );
	}
    }

    public void getOptions ( String name , int r , int c ) {
	if ( name == "p1 pawn" ) {
	    if ( buttons [ r - 1 ] [ c ].getIcon() == null ) {
		int[] a = { r - 1 , c };
		options.add ( a );
		if ( r == buttons.length - 2 && buttons [ r - 2 ] [ c ].getIcon() == null ) {
		    int[] b = { r - 2, c };
		    options.add ( b );
		}
	    }
	    if ( ( c < buttons.length - 1 &&  eatable ( buttons [ r ] [ c ] , buttons [ r - 1 ] [ c + 1 ] ) ) || 
		 ( c > 0 && eatable ( buttons [ r ] [ c ] , buttons [ r - 1 ] [ c - 1 ] ) ) ) {
		if ( c < buttons.length - 1 )
		    eatable ( buttons [ r ] [ c ] , buttons [ r - 1 ] [ c + 1 ] );
		if ( c > 0 )
		    eatable ( buttons [ r ] [ c ] , buttons [ r - 1 ] [ c - 1 ] );
	    }
	}
	if ( name == "knight" ) {
	    int[][] knightList = { { -2 , -1 } , { -2 , 1 } , { 2 , 1 } , { 2 , -1 } , { 1 , 2 } , { 1 , -2 } , { -1 , 2 } , { -1 , -2 } };
	    for ( int[] coor : knightList ) {
		int coor1 = coor [ 0 ];
		int coor2 = coor [ 1 ];
		try {
		    if ( buttons [ r + coor1 ] [ c + coor2 ].getIcon() == null ) {
			int[] a = { r + coor1 , c + coor2 };
			options.add ( a );
		    }
		    if ( eatable ( buttons [ r ] [ c ] , buttons [ r + coor1 ] [ c + coor2 ] ) )
			eatable ( buttons [ r ] [ c ] , buttons [ r + coor1 ] [ c + coor2 ] );
		} catch ( ArrayIndexOutOfBoundsException e ) {
		    System.out.println ( "out of bounds" );
		}
	    }

	}
	if ( name == "rook" ) {
	    if ( r > 0 ) {
		for ( int i = r - 1 ; i >= 0 ; i -- ) {
		    if ( buttons [ i ] [ c ].getIcon() == null ) {
			int[] a = { i , c };
			options.add ( a );	
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ c ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r < buttons.length - 1 ) {
		for ( int i = r + 1 ; i < buttons.length ; i++ ) {
		    if ( buttons [ i ] [ c ].getIcon() == null ) {
			int[] a = { i , c };
			options.add ( a );	
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ c ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( c > 0 ) {
		for ( int i = c - 1 ; i >= 0 ; i-- ) {
		    if ( buttons [ r ] [ i ].getIcon() == null ) {
			int[] a = { r , i };
			options.add ( a );	
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ r ] [ i ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    System.out.println ( buttons [ r ].length );
	    if ( c < buttons [ r ].length - 1 ) {
		for ( int i = c + 1 ; i < buttons.length ; i++ ) {
		    if ( buttons [ r ] [ i ].getIcon() == null ) {
			int[] a = { r , i };
			options.add ( a );
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ r ] [ i ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	}
	if ( name == "bishop" ) {
	    if ( r > 0 && c > 0 ) {
		System.out.println ( "bishop" );
		System.out.println ( r + ", " + c );
		int j = c;
		for ( int i = r - 1 ; i >= 0 ; i-- ) {
		    j = j - 1;
		    System.out.println ( "i j :" + i + ", " + j );
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j <= 0 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r > 0 && c < buttons [ r ].length - 1 ) {
		int j = c;
		for ( int i = r - 1 ; i >= 0 ; i-- ) {
		    j = j + 1;
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j >= buttons [ r ].length - 1 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r < buttons.length - 1 && c > 0 ) {
		int j = c;
		for ( int i = r + 1 ; i < buttons.length ; i++ ) {
		    j = j - 1;
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j <= 0 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r < buttons.length - 1 && c < buttons [ r ].length - 1 ) {
		int j = c;
		for ( int i = r + 1 ; i < buttons.length ; i++ ) {
		    j = j + 1;
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j >= buttons [ r ].length - 1 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	}
	if ( name == "king" ) {
	    int[][] kingList = { { -1 , -1 } , { -1 , 0 } , { -1 , 1 } , { 0 , -1 } , { 0 , 1 } , { 1 , -1 } , { 1 , 0 } , { 1 , 1 } };
	    for ( int[] coor : kingList ) {
		int coor1 = coor [ 0 ];
		int coor2 = coor [ 1 ];
		System.out.println ( "coors: " + coor1 + ", " + coor2 );
		try {
		    if ( buttons [ r + coor1 ] [ c + coor2 ].getIcon() == null ) {
			int[] a = { r + coor1 , c + coor2 };
			options.add ( a );
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ r + coor1 ] [ c + coor2 ] ) ) {
		    }
		} catch ( ArrayIndexOutOfBoundsException e ) {
		    System.out.println ( "out of bounds" );
		}
	    }
	}
	if ( name == "queen" ) {
	    System.out.println ( "queensryche" );
	    if ( r > 0 ) {
		for ( int i = r - 1 ; i >= 0 ; i -- ) {
		    if ( buttons [ i ] [ c ].getIcon() == null ) {
			int[] a = { i , c };
			options.add ( a );	
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ c ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r < buttons.length - 1 ) {
		for ( int i = r + 1 ; i < buttons.length ; i++ ) {
		    if ( buttons [ i ] [ c ].getIcon() == null ) {
			int[] a = { i , c };
			options.add ( a );	
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ c ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( c > 0 ) {
		for ( int i = c - 1 ; i >= 0 ; i-- ) {
		    if ( buttons [ r ] [ i ].getIcon() == null ) {
			int[] a = { r , i };
			options.add ( a );	
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ r ] [ i ] ) ) {
			break;
		    }
		    else {
			break;
		    }     
		}
	    }
	    System.out.println ( buttons [ r ].length );
	    if ( c < buttons [ r ].length ) {
		for ( int i = c + 1 ; i < buttons.length ; i++ ) {
		    if ( buttons [ r ] [ i ].getIcon() == null ) {
			int[] a = { r , i };
			options.add ( a );
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ r ] [ i ] ) ) {
			break;
		    }
		    else {
			break;
		    }
		}
	    }
	    if ( r > 0 && c > 0 ) {
		int j = c;
		for ( int i = r - 1 ; i >= 0 ; i-- ) {
		    j = j - 1;
		    System.out.println ( "i j :" + i + ", " + j );
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j <= 0 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r > 0 && c < buttons [ r ].length - 1 ) {
		int j = c;
		for ( int i = r - 1 ; i >= 0 ; i-- ) {
		    j = j + 1;
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j >= buttons [ r ].length - 1 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r < buttons.length - 1 && c > 0 ) {
		int j = c;
		for ( int i = r + 1 ; i < buttons.length ; i++ ) {
		    j = j - 1;
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j <= 0 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	    if ( r < buttons.length - 1 && c < buttons [ r ].length - 1 ) {
		int j = c;
		for ( int i = r + 1 ; i < buttons.length ; i++ ) {
		    j = j + 1;
		    if ( buttons [ i ] [ j ].getIcon() == null ) {
			int[] a = { i , j };
			options.add ( a );
			if ( j >= buttons [ r ].length - 1 )
			    break;
		    }
		    else if ( eatable ( buttons [ r ] [ c ] , buttons [ i ] [ j ] ) ) {
			break;
		    }
		    else break;
		}
	    }
	}
	if ( name == "p2 pawn" ) {
	    if ( buttons [ r + 1 ] [ c ].getIcon() == null ) {
		int[] a = { r + 1 , c };
		options.add ( a );
		if ( r == 1 && buttons [ r + 2 ] [ c ].getIcon() == null ) {
		    int[] b = { r + 2 , c };
		    options.add ( b );
		}
	    }   
	    if ( ( c < buttons.length - 1 &&  eatable ( buttons [ r ] [ c ] , buttons [ r + 1 ] [ c + 1 ] ) ) || 
		 ( c > 0 && eatable ( buttons [ r ] [ c ] , buttons [ r + 1 ] [ c - 1 ] ) ) ) {
		if ( c < buttons.length - 1 )
		    eatable ( buttons [ r ] [ c ] , buttons [ r + 1 ] [ c + 1 ] );
		if ( c > 0 )
		    eatable ( buttons [ r ] [ c ] , buttons [ r + 1 ] [ c - 1 ] );
	    }
	}
    }

    public boolean eatable ( JButton a , JButton b ) {
	if ( b.getText().length() > 6 ) {
	    System.out.println ( "player b: " + b.getText().substring ( 4 , 5 ) );
	    System.out.println ( b.getText().substring ( 0 , 1 )  + ", " + b.getText().substring ( 2 , 3 ) );
	    System.out.println ( a.getText().substring ( 4 , 5 ) + "==?" + b.getText().substring ( 4 , 5 ) );
	    if ( ! a.getText().substring ( 4 , 5 ).equals ( b.getText().substring ( 4 , 5 ) ) ) {
	    int row = Integer.parseInt ( b.getText().substring ( 0 , 1 ) );
	    int col = Integer.parseInt ( b.getText().substring ( 2 , 3 ) );
	    int[] addOption = { row , col };
	    options.add ( addOption );
	    System.out.println ( "eatable" );
	    return true;
	}
	}
	System.out.println ( "not eatable" );
	return false;
    }
}
















































class TetrisBoard extends JPanel implements KeyListener , Runnable {
    Image image;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    JButton[][] buttons = new JButton [ 15 ] [ 9 ];
    int buttonPressed = 0;
    Thread t;
    protected int x , y, z , oldX , oldY , moveOver;
    int[][] piece = new int [ 4 ] [ 2 ];
    int[][] piece1 = { { -1 , 0 } , { 0 , 0 } , { 1 , 0 } , { 2 , 0 } };
    int[][] piece2 = { { -1 , 0 } , { 0 , 0 } , { 0 , -1 } , { 1 , 0} };
    int[][] piece3 = { { 0 , 1 } , { 0 , 0 } , { 1 , 0 } , { 1 , 1 } };
    int[][] piece4 = { { 0 , -1 } , { 0 , 0 } , { 1, -1 } , { -1 , 0 } };
    int[][] piece5 = { { 2 , 0 } , { 0 , 0 } , { 0 , -1} , { 1 , 0 } };
    int[][] piece1Rotated = { { 0 , -2 } , { 0 , 0 } , { 0 , -1 } , { 0 , 1 } };
    int[][] piece2Rotated1 = { { 0 , -1 } , { 0 , 0 } , { 1 , 0 } , { 0 , 1 } };
    int[][] piece2Rotated2 = { { -1 , 0 } , { 0 , 0 } , { 1 , 0 } , { 0 , 1 } };
    int[][] piece2Rotated3 = { { 0 , -1 } , { 0 , 0 } , { -1 , 0 } , { 0 , 1 } };
    int[][] piece4Rotated = { { -1 , -1} , { 0 , 0 } , { -1 , 0 } , { 0 , 1 } };
    int[][] piece5Rotated1 = { { 1 , 0 } , { 0 , 0 } , { 0 , 1 } , { 0 , 2 } };
    int[][] piece5Rotated2 = { { -2 , 0 } , { 0 , 0 } , { -1 , 0 } , { 0 , 1 } };
    int[][] piece5Rotated3 = { { 0 , -2 } , { 0 , 0 } , { 0 , -1 } , { -1 , 0 } };
    protected int wait;

    public TetrisBoard() {
	this.addKeyListener(this);

	super.setLayout ( new GridLayout( 15 , 9 ) );
	wait = 500;
	int k = 0;
	for ( int i = 0 ; i < 15 ; i++ ) {
	    for ( int j = 0 ; j < 9 ; j++ ) {
		buttons [ i ] [ j ] = new JButton ( );
		this.add ( buttons [ i ] [ j ] );
		buttons [ i ] [ j ].addKeyListener ( this );
		k = k + 1;
		if ( i > 11 && j != 3 && j != 4 && j != 5 && j != 6 )
		    buttons [ i ] [ j ].setBackground ( Color.red );
		if ( i == 13 && ( j == 2 || j == 7 || j == 8 || j == 9 ) )
		    buttons [ i ] [ j ].setBackground ( null );
	    }
	}
	t = new Thread ( this );
	moveOver = 0;
    }

    public Dimension getPreferredSize() {
	return new Dimension ( 400, 400 );
    }

    public void keyReleased ( KeyEvent e ) {
 	if ( e.getKeyCode() == KeyEvent.VK_UP )
	    System.out.println ( "up" );
	if ( e.getKeyCode() == KeyEvent.VK_DOWN ) {
	    System.out.println ( "down" );
	    wait = 500;
	}
	if ( e.getKeyCode() == KeyEvent.VK_LEFT )
	    System.out.println ( "left" );
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT )
	    System.out.println ( "right" );
	System.out.println ( "released: " + e.getKeyCode() );
	z = 0;
	this.update ( this.getGraphics() );
    }

    public void keyPressed ( KeyEvent e ) {
	System.out.println ("pressed: " + e.getKeyCode() );
	buttonPressed = 1;
	if ( e.getKeyCode() == KeyEvent.VK_UP ) {
	    System.out.println ( "up" );
	    rotate();
	}
	if ( e.getKeyCode() == KeyEvent.VK_DOWN ) {
	    System.out.println ( "down" );
	    wait = 50;
	}
	if ( e.getKeyCode() == KeyEvent.VK_LEFT ) {
	    System.out.println ( "left" );
	    if ( x > 1 ) {
		System.out.println ( "going left" );
		z = -1;
		recolor();
	    }
	}
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	    System.out.println ( "right" );
	    if ( x < buttons.length - 3 ) {
		System.out.println ( "going right" );
		z = 1;
		recolor();
	    }
	}
    }

    public void recolor() {
	if ( notOutOfBounds ( z ) ) {
	    oldX = x;
	    x = x + z;
	    for ( int[] coor : piece ) {
		if ( x != oldX ) {
		    buttons [ y + coor [ 1 ] ] [ oldX + coor [ 0 ] ].setBackground ( null );
		}
	    }
	    for ( int[] coor : piece ) {
		buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( Color.red );
	    }
	    t.suspend();
	}
	update ( getGraphics() );
	this.reset();
	oldY = y;
    }

    public boolean notOutOfBounds ( int z ) {
	ArrayList<Integer> yList = new ArrayList<Integer>();
	yList.add ( 0 );
	if ( piece == piece1 ) {
	    int[][] right = { { 2 , 0 } };
	    int[][] left = { { -1 , 0 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece1Rotated ) {
	    int[][] right = piece;
	    int[][] left = piece;
	    return outHelp ( right , left );
	}
	if ( piece == piece2 ) {
	    int[][] right = { { 1 , 0 } , { 0 , -1 } };
	    int[][] left = { { -1 , 0 } , { 0 , -1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece2Rotated1 ) {
	    int[][] right = { { 0 , -1 } , { 1 , 0 } , { 0 , 1 } };
	    int[][] left = { { 0 , -1 } , { 0 , 0 } , { 0 , 1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece2Rotated2 ) {
	    int[][] right = { { 1 , 0 } , { 0 , 1 } };
	    int[][] left = { { -1 , 0 } , { 0 , 1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece2Rotated3 ) {
	    int[][] right = { { 0 , -1 } , { 0 , 0 } , { 0 , 1 } };
	    int[][] left = { { 0 , -1 } , { -1 , 0 } , { 0 , 1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece3 ) {
	    int[][] right = { { 1 , 0 } , { 1 , 1 } };
	    int[][] left = { { 0 , 0 } , { 0 , 1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece4 ) {
	    int[][] right = { { 0 , 0 } , { 1 , -1 } };
	    int[][] left = { { 0 , -1 } , { -1 , 0 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece4Rotated ) {
	    int[][] right = { { -1 , -1 } , { 0 , 0 } , { 0 , 1 } };
	    int[][] left = { { -1 , -1 } , { -1 , 0 } , { 0 , 1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece5 ) {
	    int[][] right = { { 2 , 0 } , { 0 , -1 } };
	    int[][] left = { { 0 , 0 } , { 0 , -1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece5Rotated1 ) {
	    int[][] right = { { 1 , 0 } , { 0 , 1 } , { 0 , 2 } };
	    int[][] left = { { 0 , 0 } , { 0 , 1 } , { 0 , 2 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece5Rotated2 ) {
	    int[][] right = { { 0 , 0 } , { 0 , 1 } };
	    int[][] left = { { -2 , 0 } , { 0 , 1 } };
	    return outHelp ( right , left );
	}
	if ( piece == piece5Rotated3 ) {
	    int[][] right = { { 0 , -2 } , { 0 , -1 } , { 0 , 0 } };
	    int[][] left = { { 0 , -2 } , { 0 , -1 } , { -1 , 0 } };
	    return outHelp ( right , left );
	}
	else {
	    int[][] right = { { 0 , 0 } };
	    int[][] left = { { 0 , 0 } };
	}
	return true;
    }

    public boolean outHelp ( int[][] right , int[][] left ) {
	if ( z == 1 ) {
	    for ( int[] coor : right ) {
		if ( !( x + coor [ 0 ] < buttons [ y + coor [ 1 ] ].length - 1 && buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] + z ].getBackground() != Color.red ) )
		    return false;
	    }
	    return true;
	}
	if ( z == -1 ) {
	    for ( int[] coor : left ) {
		if ( !( x + coor [ 0 ] > 0 && buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] + z ].getBackground() != Color.red ) )
		    return false;
		else System.out.println ( "outHelp: " + x + coor [ 0 ] + z + y);
	    }
	    return true;
	}
	return false;
    }

    public void keyTyped ( KeyEvent e ) {
	System.out.println ( "typed: " + e.getKeyCode() );
	if ( e.getKeyCode() == KeyEvent.VK_UP )
	    System.out.println ( "up" );
	if ( e.getKeyCode() == KeyEvent.VK_DOWN )
	    System.out.println ( "down" );
	if ( e.getKeyCode() == KeyEvent.VK_LEFT )
	    System.out.println ( "left" );
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT )
	    System.out.println ( "right" );
    }

    public void rotate() {
	int[][] list = new int [ 3 ] [ 2 ];
	list [ 0 ] = piece [ 0 ];
	list [ 1 ] = piece [ 2 ];
	list [ 2 ] = piece [ 3 ];
	System.out.println ( "rotate" );
	if ( piece == piece1 && y > 0 ) {
	    rotateRefactored ( list , piece1Rotated );
	}
	else if ( piece == piece1Rotated ) {
	    rotateRefactored ( list , piece1 );
	}
	if ( piece == piece2 && y > 0 ) {
	    rotateRefactored ( list , piece2Rotated1 );
	}
	else if ( piece == piece2Rotated1 ) {
	    rotateRefactored ( list , piece2Rotated2 );
	}
	else if ( piece == piece2Rotated2 ) {
	    rotateRefactored ( list , piece2Rotated3 );
	}
	else if ( piece == piece2Rotated3 ) {
	    rotateRefactored ( list , piece2 );
	}
	else if ( piece == piece4 ) {
	    rotateRefactored ( list , piece4Rotated );
	}
	else if ( piece == piece4Rotated ) {
	    rotateRefactored ( list , piece4 );
	}
	else if ( piece == piece5 ) {
	    rotateRefactored ( list , piece5Rotated1 );
	}
	else if ( piece == piece5Rotated1 ) {
	    rotateRefactored ( list , piece5Rotated2 );
	}
	else if ( piece == piece5Rotated2 ) {
	    rotateRefactored ( list , piece5Rotated3 );
	}
	else if ( piece == piece5Rotated3 ) {
	    rotateRefactored ( list , piece5 );
	}
    }

    public void rotateRefactored ( int[][] list , int[][] rotatedPiece ) {
	piece = rotatedPiece;
	for ( int[] coor : list ) {
	    buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( null );
	}
	for ( int[] coor : piece ) {
	    buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( Color.red );
	}
	update ( getGraphics() );
    }

    public void start() {
	Random rand = new Random();
	int r = rand.nextInt ( 5 );
	x = 4;
	y = 0;
	z = 0;
	if ( r == 0 )
	    piece = piece1;
	if ( r == 1 ) {
	    y = 1;
	    piece = piece2;
	}
	if ( r == 2 )
	    piece = piece3;
	if ( r == 3 ) {
	    y = 1;
	    piece = piece4;
	}
	if ( r == 4 ) {
	    y = 1;
	    piece = piece5;
	}
	//	y = 1;
	//	piece = piece2;
    }

    public void go() {
	oldY = y;
	y = y + 1;
	if ( y == 0 && piece == piece1 && piece == piece3 ) {
	    for ( int[] coor : piece ) {
		buttons [ oldY + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( null );
	    }
	}
	else if ( y >= 1 )
	    for ( int[] coor : piece ) {
		buttons [ oldY + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( null );
	    }
	for ( int[] coor : piece ) {
	    buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( Color.red );
	}
	update ( getGraphics() );
    }

    public void reset() {
	if ( resetHelp() ) {
	    this.update ( this.getGraphics() );
	    try {
		t.sleep ( 500 );
	    } catch ( InterruptedException e ) {
		System.out.println ( "interrupted" );
	    }

	    int shiftHere = y + piece [ 3 ] [ 1 ];
	    int k = 3;
	    while ( k > 0 ) {
		while ( lineClear ( shiftHere ) ) {
		    for ( int i = 0 ; i < buttons [ shiftHere ].length ; i++ )
			buttons [ shiftHere ] [ i ].setBackground ( null );
		    System.out.println ( "lineClear is true" );
		    shift ( shiftHere );
		}
		k = k - 1;
		shiftHere = shiftHere - 1;
	    }
	    moveOver = 1;
	    t.suspend();
	}
    }

    public boolean lineClear ( int row ) {
	System.out.println ( "lineClear: " + row );
	for ( int c = 0 ; c < buttons [ row ].length - 1 ; c++ ) {
	    if ( buttons [ row ] [ c ].getBackground() != Color.red ) {
		System.out.println ( "rowcol: " + row + c );
		return false;
	    }
	}
	return true;
    }

    public boolean resetHelp() {
	if ( piece == piece1 ) {
	    if ( y == buttons.length )
		return true;
	    for ( int[] coor : piece ) {
		if ( y + 1 == buttons.length || buttons [ y + coor [ 1 ] + 1 ] [ x + coor [ 0 ] ].getBackground().equals ( Color.red ) ) {
		    System.out.println ( "resetHelp coors: " + x + ", " + y + "\n" + coor [ 0 ] + ", " + coor [ 1 ] );
		    return true;
		}
	    }
	}
	if ( piece == piece1Rotated ) {
	    if ( y + 2 == buttons.length || buttons [ y + 2 ] [ x ].getBackground().equals ( Color.red ) ) {
		System.out.println ( "rotated 1: " + ( y + 3 ) + "-     " + y );
		return true;
	    }
	}
	if ( piece == piece2 ) {
	    int[][] coors = { piece [ 0 ] , piece [ 1 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece2Rotated2 ) {
	    int[][] coors = { piece [ 0 ] , piece [ 2 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	    return resetOtherHelp ( coors );
	}
	if ( piece == piece2Rotated1 || piece == piece2Rotated3 ) {
	    int[][] coors = { piece [ 2 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece3 ) {
	    int[][] coors = { { 0 , 1 } , { 1 , 1 } };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece4 ) {
	    int[][] coors = { piece [ 1 ] , piece [ 2 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece4Rotated ) {
	    int[][] coors = { { -1 , 0 } , { 0 , 1 } };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece5 ) {
	    int[][] coors = { piece [ 0 ] , piece [ 1 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece5Rotated1 ) {
	    int[][] coors = { piece [ 0 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece5Rotated2 ) {
	    int[][] coors = { piece [ 0 ] , piece [ 2 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	if ( piece == piece5Rotated3 ) {
	    int[][] coors = { piece [ 1 ] , piece [ 3 ] };
	    if ( resetOtherHelp ( coors ) )
		return true;
	}
	return false;
    }

    public boolean resetOtherHelp ( int[][] coors ) {
	for ( int[] coor : coors ) {
	    if ( y + coor [ 1 ] + 1 == buttons.length || buttons [ y + coor [ 1 ] + 1 ] [ x + coor [ 0 ] ].getBackground().equals ( Color.red ) ) {
		System.out.println ( "reset x , y: " + x + coor [ 0 ] + ", " + y + coor [ 1 ] );
		return true;
	    }
	}
	return false;
    }

    public void shift ( int i ) {
	for ( int m = i ; m > 0 ; m-- ) {
	    for ( int n = 0 ; n < buttons [ m ].length ; n++ ) {
		if ( buttons [ m ] [ n ].getBackground() == Color.red ) {
		    buttons [ m + 1 ] [ n ].setBackground ( Color.red );
		    buttons [ m ] [ n ].setBackground ( null );
		}
	    }
	}
    }

    public void run() {
	start();
	System.out.println ( "new round" );

	while ( true ) {
		try {
		    t.sleep ( wait );
		} catch ( InterruptedException e ) {
		}
		this.reset();
		this.go();
		this.update ( this.getGraphics() );
		System.out.println ( "x:" + x + "\n" + "y:" + y );
	}
    }
}
