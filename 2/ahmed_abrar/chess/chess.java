import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class chess {
    public static void main ( String[] args ) {
	Gui g = new Gui();
    }
}

class Gui implements ActionListener {
    private JFrame frame;
    private board b;

    public Gui() {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout ( new FlowLayout() );
	frame.setVisible ( true );
	b = new board();
	frame.getContentPane().add ( b );
	b.update ( b.getGraphics() );
	b.requestFocus();
	b.setFocusable ( true );
	frame.pack();
	frame.show();
    }
    public void actionPerformed ( ActionEvent e ) {
    }
}

class board extends JPanel implements ActionListener {
    private JButton[][] buttons = new JButton [ 8 ] [ 8 ];
    private int[] currentMove = new int [ 2 ];
    private ArrayList<int[]> options = new ArrayList<int[]>();
    private String piece;
    private int turn;

    public board() {
	//	this.addActionListener ( this );
	piece = new String();
	turn = 1;
	super.setLayout ( new GridLayout ( 8 , 8 ) );
	for ( int row = 0 ; row < buttons.length ; row++ ) {
	    for ( int col = 0 ; col < buttons [ row ].length ; col++ ) {
		if ( row == 1 || row == buttons.length - 2 ) {
		    if ( row == 1 )
			setPiece ( "p2 pawn" , row , col );
		    if ( row == buttons.length - 2 )
			setPiece ( "p1 pawn" , row , col );
		}
		else if ( row == buttons.length - 1 || row == 0 ) {
		    if ( col == 0 || col == buttons [ row ].length - 1 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1 rook" , row , col );
			if ( row == 0 )
			    setPiece ( "p2 rook" , row , col );
		    }
		    else if ( col == 1 || col == buttons [ row ].length - 2 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1 knight" , row , col );
			if ( row == 0 )
			    setPiece ( "p2 knight" , row , col );
		    }
		    else if ( col == 2 || col == buttons [ row ].length - 3 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1 bishop" , row , col );
			if ( row == 0 )
			    setPiece ( "p2 bishop" , row , col );
		    }
		    else if ( col == 3 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1 queen" , row , col );
			if ( row == 0 )
			    setPiece ( "p2 queen" , row , col );
		    }
		    else if ( col == 4 ) {
			if ( row == buttons.length - 1 )
			    setPiece ( "p1 king" , row , col );
			if ( row == 0 )
			    setPiece ( "p2 king" , row , col );
		    }
		}
		//		    else buttons [ row ] [ col ] = new JButton ( row + " " + col );
		else buttons [ row ] [ col ] = new JButton ( row + " " + col );
		System.out.println ( "rowcol: " + row + ", " + col );
		buttons [ row ] [ col ].addActionListener ( this );
		this.add ( buttons [ row ] [ col ] );
	    }
	}
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
	return new Dimension ( 500 , 500 );
    }
    /*
    public void keyReleased ( KeyEvent e ) {
    }
    public void keyPressed ( KeyEvent e ) {
    }
    public void keyTyped ( KeyEvent e ) {
    }*/
    public void actionPerformed ( ActionEvent e ) {
	System.out.println ( e );
	System.out.println ( "getText" + ( ( JButton ) e.getSource() ).getText() );
	piece =  ( ( JButton ) e.getSource() ).getText().substring ( 3 );
	System.out.println ( piece );
	System.out.println ( piece.equals ( "p1 pawn" ) );
	String row = ( ( JButton ) e.getSource() ).getText().substring ( 0 , 1 );
	String col = ( ( JButton ) e.getSource() ).getText().substring ( 2 , 3 );
	int r = Integer.parseInt ( row );
	int c = Integer.parseInt ( col );
	//	for ( int[] coor : options ) {
	//  buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( null );
	//  System.out.println ( Arrays.toString ( coor ) + "    opt" );
	//	}
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
	/*	System.out.println ( "options: " );
	for ( int[] coor : options ) {
	    buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( null );
	    System.out.println ( Arrays.toString ( coor ) + "   opt" );
	    }*/
	if ( turn == 1 ) {
	if ( piece.equals ( "p1 pawn" ) ) {
	    getOptions ( "p1 pawn" , r , c );
	    //	    options.clear();
	    //	    int[] a = { r - 1 , c };
	    //	    options.add ( a );
	    //	    if ( r == buttons.length - 2 ) {
	    //	int[] b = { r - 2 , c };
	    //	options.add ( b );
	    //	    }
	    System.out.println ( "pawn selected" );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1 knight" ) ) {
	    getOptions ( "knight" , r , c );
	    //	    options.clear();
	    //	    int[] a = { r - 2 , c + 1 };
	    //	    int[] b = { r - 2 , c - 1 };
	    //	    options.add ( a );
	    //	    options.add ( b );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1 rook" ) ) {
	    getOptions ( "rook" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1 bishop" ) ) {
	    getOptions ( "bishop" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1 king" ) ) {
	    getOptions ( "king" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p1 queen" ) ) {
	    getOptions ( "queen" , r , c );
	    selectPiece ( e , r , c );
	}
	}
	if ( turn == 2 ) {
	if ( piece.equals ( "p2 pawn" ) ) {
	    getOptions ( "p2 pawn" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2 rook" ) ) {
	    getOptions ( "rook" , r , c );
	    selectPiece ( e , r , c );
	}
	if (  piece.equals ( "p2 bishop" ) ) {
	    getOptions ( "bishop" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2 knight" ) ) {
	    getOptions ( "knight" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2 king" ) ) {
	    getOptions ( "king" , r , c );
	    selectPiece ( e , r , c );
	}
	if ( piece.equals ( "p2 queen" ) ) {
	    getOptions ( "queen" , r , c );
	    selectPiece ( e , r , c );
	}
	}
	System.out.println ( "color matches?" );
	System.out.println ( r + ", " + c );
	System.out.println ( buttons [ r ] [ c ].getBackground().equals ( Color.blue ) );
	//	System.out.println  ( ( ( JButton ) e.getSource() ).getBackground() == Color.blue );
	if ( ( ( JButton ) e.getSource() ).getBackground() == Color.blue ) {
	    piece = buttons [ currentMove [ 0 ] ] [ currentMove [ 1 ] ].getText().substring ( 3 );
	    System.out.println ( piece );
	    //	    System.out.println ( (  ( JButton ) e.getSource() ).getText() );
	    System.out.println ( "move pawn" );
	    System.out.println ( Arrays.toString ( currentMove ) );
	    try {
		System.out.println ("piece" + piece);//.substring ( 3 ) );
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
	    //	    for ( int[] coor : options ) {
	    //	buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( null );
	    //	    }
	    options.clear();
	    System.out.println ( "turn: " + turn );
	    if ( turn == 1 )
		turn = 2;
	    else turn = 1;
	}
    }

    public void selectPiece ( ActionEvent e , int r , int c ) {
	System.out.println ( Arrays.toString ( currentMove ) );
	buttons [ currentMove [ 0 ] ] [ currentMove [ 1 ] ].setBackground ( null );
	currentMove [ 0 ] = r;
	currentMove [ 1 ] = c;
	System.out.println ( "currentMove: " +  Arrays.toString ( currentMove ) );
	//options.add ( a );
	//options.add ( b );
	for ( int[] coor : options ) {
	    buttons [ coor [ 0 ] ] [ coor [ 1 ] ].setBackground ( Color.blue );
	}
	//	options.clear();
	//	buttons [ r ] [ c ].setText ( row + " " + col );
    }

    public void getOptions ( String name , int r , int c ) {
	if ( name == "p1 pawn" ) {
	    if ( buttons [ r - 1 ] [ c ].getIcon() == null ) {
		//		System.out.println (  eatable ( buttons [ r ] [ c ] , buttons [ r - 1 ] [ c + 1 ] ) );
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
	    /*	    if ( buttons [ r - 2 ] [ c + 1 ].getIcon() == null ) {
		int[] a = { r - 2 , c + 1 };
		options.add ( a );
	    }
	    if ( buttons [ r - 2 ] [ c - 1 ].getIcon() == null ) {
		int[] a = { r - 2 , c - 1 };
		options.add ( a );
	    }*/
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
		for ( int i = r - 1 ; i > 0 ; i-- ) {
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
		for ( int i = r - 1 ; i > 0 ; i-- ) {
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
		for ( int i = r - 1 ; i > 0 ; i -- ) {
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
		for ( int i = c - 1 ; i > 0 ; i-- ) {
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
	    if ( c < buttons [ r ].length - 1 ) {
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
		for ( int i = r - 1 ; i > 0 ; i-- ) {
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
		for ( int i = r - 1 ; i > 0 ; i-- ) {
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

    /*
    public boolean optionLooop ( int i , int c ) {
	if ( buttons [ i ] [ c ].getIcon() == null ) {
	    int[] a = { i , c };
	    options.add ( a );
	    return true;
	}
	else return false;
    }

    public void mouseExited ( MouseEvent e ) {
    }
    public void mouseEntered ( MouseEvent e ) {
    }
    public void mouseReleased ( MouseEvent e ) {
    }
    public void mouseClicked ( MouseEvent e ) {
    }*/
}
