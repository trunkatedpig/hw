import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui implements ActionListener {
    private JFrame frame;
    private JButton start = new JButton ( "Start" );
    private JButton stop = new JButton ( "Stop" );
    private board b;

    public Gui() {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout ( new FlowLayout() );
	frame.setVisible ( true );

	b = new board();

	frame.getContentPane().add ( b );
	start.addActionListener ( this );
	stop.addActionListener ( this );
	frame.getContentPane().add ( start );
	frame.getContentPane().add ( stop );
	//mySetSize();
	b.update ( b.getGraphics() );;
	b.requestFocus();
	b.setFocusable ( true );
	frame.pack();
	frame.show();
    }

   /*   public void mySetSize() {
	TableColumn a = b.getColumnModel().getColumn(0);
	a.setPreferredWidth ( 1 );
	}*/


    public void actionPerformed ( ActionEvent e ) {
	System.out.println ( e );
	if ( e.getSource() == stop )
	    System.exit(0);
	if ( e.getSource() == start ) {
	    b.update ( b.getGraphics() );
	    //b.t.start();
	    b.start();
	}
    }
    /*
    public void keyPressed ( KeyEvent e ) {
	System.out.println ("pressed: " + e.getKeyCode() );
	//buttonPressed = 1;
	if ( e.getKeyCode() == KeyEvent.VK_UP )
	    System.out.println ( "up" );
	if ( e.getKeyCode() == KeyEvent.VK_DOWN )
	    System.out.println ( "down" );
	if ( e.getKeyCode() == KeyEvent.VK_LEFT )
	    System.out.println ( "left" );
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT )
	    System.out.println ( "right" );
    }

    public void keyTyped ( KeyEvent e ) {
    }

    public void keyReleased ( KeyEvent e ) {
    }*/
}

class board extends JPanel implements KeyListener , Runnable {
    Image image;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    JButton[][] buttons = new JButton [ 15 ] [ 9 ];
    int buttonPressed = 0;
    Thread t;
    private int x , y, z , oldX , oldY;
    int[][] piece = new int [ 4 ] [ 2 ];
    int[][] piece1 = { { -1 , 0 } , { 0 , 0 } , { 1 , 0 } , { 2 , 0 } };
    int[][] piece2 = { { -1 , 1 } , { 0 , 0 } , { 1 , 1 } , { 0 , 1 } };
    int[][] piece3 = { { 0 , 1 } , { 0 , 0 } , { 1 , 0 } , { 1 , 1 } };
    int[][] piece4 = { { -1 , 1 } , { 0 , 0 } , { 0 , 1 } , { 1 , 0 } };
    int[][] piece1Rotated = { { 0 , -2 } , { 0 , 0 } , { 0 , -1 } , { 0 , 1 } };
    int[][] piece2Rotated1 = { { 0 , -1 } , { 0 , 0 } , { 1 , 0 } , { 0 , 1 } };
    int[][] piece2Rotated2 = { { -1 , 0 } , { 0 , 0 } , { 1 , 0 } , { 0 , 1 } };
    int[][] piece2Rotated3 = { { 0 , -1 } , { 0 , 0 } , { -1 , 0 } , { 0 , 1 } };
    private int wait;
    //JTable table = new JTable ( 10 , 15 );

    public board() {
	//super ( 15 , 10 );
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
		if ( i > 9 && j != 4 )
		    buttons [ i ] [ j ].setBackground ( Color.red );
		if ( i == 13 && j == 2 )
		    buttons [ i ] [ j ].setBackground ( null );
	    }
	}
	setSize ( 500 , 500 );
	t = new Thread ( this );
	t.start();
	//this.add (button);
    }

    public Dimension getPreferredSize() {
	return new Dimension ( 500, 500 );
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
	    if ( x + piece [ 0 ] [ 0 ] >= 0 )
		z = -1;
	}
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	    System.out.println ( "right" );
	    if ( x + piece [ 3 ] [ 0 ]<= buttons [ 0 ].length )
		z = 1;
	}
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
    /*
    public void start() {
	buttons [ 4 ].setBackground ( Color.red );
	int x = 4;
	int y = 14;
	while ( y >= 0 ) {
	    try {
		Thread.sleep ( 1000 );
		System.out.println ( "now" );
	    } catch ( InterruptedException e ) {
		System.out.println ( "It failed" );
	    }
	    if ( buttonPressed != 0 ) {
		System.out.println ( "button pressed" );
	    }
	    y = y - 1;
	    buttons [ x + 9 ].setBackground ( Color.red );
	    buttons [ x ].setBackground ( null );
	    x = x + 9;
	    this.update ( this.getGraphics() );
	}
	}*/

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
    }

    public void rotateRefactored ( int[][] list , int[][] rotatedPiece ) {
	piece = rotatedPiece;
	for ( int[] coor : list ) {
	    buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( null );
	}
    }

    public void start() {
	Random rand = new Random();
	int r = rand.nextInt ( 4 );
	//buttons [ 0 ] [ 4 ].setBackground ( Color.red );
	x = 4;
	y = 0;
	z = 0;
	if ( r == 0 )
	    piece = piece1;
	if ( r == 1 )
	    piece = piece2;
	if ( r == 2 )
	    piece = piece3;
	if ( r == 3 )
	    piece = piece4;
	piece = piece1;
	//        for ( int[] coor : piece ) {
	//  buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( Color.red );
	//}
    }

    public void go() {
	System.out.println ( "go" );
	oldY = y;
	oldX = x;
	y = y + 1;
	//if ( x + piece [ 0 ] [ 0 ] != 0 || x + piece [ 3 ] [ 0 ] != border.length )
	    x = x + z;
	    //else System.out.println ( "Out of Bounds" );
    }

    public void reset() {
	if ( ( piece != piece1 && y + 1 == buttons.length ) || 
	     ( y == buttons.length && piece == piece1 ) || 
	     ( piece != piece1 && buttons [ y + 1 ] [ x ].getBackground() == Color.red ) ) {//||
	     //	     resetHelp() ) {
	    try {
		t.sleep ( 500 );
	    } catch ( InterruptedException e ) {
		System.out.println ( "interrupted" );
	    }
	    //	    clearLine ( x , y );
	    /*	    for ( int i = buttons.length - 1 ; i > 0 ; i-- ) {
		int count = 0;
		for ( int j = 0 ; j < buttons [ i ].length ; j++ ) {
		    if ( buttons [ i ] [ j ].getBackground() == Color.red ) {
			count = count + 1;
			//System.out.println ( "add one count" );
		    }
		    if ( count == buttons [ i ].length ) {
			System.out.println ( "clearline" );
			for ( int k = 0 ; k < buttons [ i ].length ; k++ ) {
			    buttons [ i ] [ k ].setBackground ( null );
			}
			System.out.println ( "shift: " + i );
			shift ( i );
		    }
		}
	    }*/
	
	
	    int shiftHere = y + piece [ 3 ] [ 1 ] - 1;
	    int k = 0;
	    while ( k < 4 ) {
		while ( lineClear ( shiftHere ) ) {
		    for ( int i = 0 ; i < buttons [ shiftHere ].length ; i++ )
			buttons [ shiftHere ] [ i ].setBackground ( null );
		    System.out.println ( "lineClear is true" );
		    shift ( shiftHere );
		}
		k = k + 1;
		shiftHere = shiftHere - 1;
	    }

	    start();
	}
    }

    public boolean lineClear ( int row ) {
	System.out.println ( "lineClear: " + row );
	for ( int c = 0 ; c < buttons [ row ].length - 1 ; c++ ) {
	    if ( buttons [ row ] [ c ].getBackground() != Color.red ) {
		System.out.println ( "rowcol: " + row + c );
		return false;
	    }
	    //	    else System.out.println ( buttons [ row ] [ c ].getBackground() );
	}
	return true;
    }

    public boolean resetHelp() {
	// for ( int[] coor : piece ) {
	//     if ( buttons [ x + coor [ 0 ] ] [ y + coor [ 1 ] + 1 ].getBackground().equals ( Color.red ) )
	//  	return true;
	//     else System.out.println ( "not red" );
	// }
	// return false;
	if ( piece == piece1 ) {
	    for ( int[] coor : piece ) {
		if ( buttons [ x + coor [ 0 ] ] [ y + coor [ 1 ] + 1 ].getBackground().equals ( Color.red ) )
		    return true;
	    }
	}
	// if ( piece == piece2 ) {
	//     int[][] coors = { piece [ 0 ] , piece [ 2 ] , piece [ 3 ] };
	//     for ( int[] coor : coors ) {
	// 	if ( buttons [ x + coor [ 0 ] ] [ y + coor [ 1 ] ].getBackground().equals ( Color.red ) ) {
	// 	    System.out.println ( "restart: " + (x + coor [ 0 ]) + ", " + (y + coor [ 1 ] + 1) + "\n" + x + ", " + y + "\n" + coor [ 0 ] + ", " + coor [ 1 ]);
	// 	    return true;
	// 	}
	//     }
	// }
	return false;
    }
    
    /*   public void clearLine ( int x , int y ) {
	int clear = 0;
	int clear2 = 0;
	int rowCleared = 52;
	for ( int i = 0 ; i < buttons.length ; i++ ) {
	    for ( int j = 0 ; j < buttons [ i ].length ; j++ ) {
		if ( buttons [ i ] [ j ].getBackground() != Color.red ) {
		    clear = 1;
		    System.out.println ( "HERE " + rowCleared );
		}
		else {
		    rowCleared = i;
		}
	    }
	}
	if ( clear == 0 ) {
	    System.out.println ( "HI" );
	    for ( int i = 0 ; i < buttons [ rowCleared ].length ; i++ )
		buttons [ rowCleared ] [ i ].setBackground ( null );
	}
	}

    public boolean clearLine() {
	int fullRow = 0;
	for ( int i = 0 ; i < buttons.length ; i++ ) {
	    int full = 0;
	    for ( int j = 0 ; j < buttons [ i ].length ; j++ ) {
		if ( buttons [ i ] [ j ].getBackground() == Color.red ) {
		    full = full + 1;
		    if ( full == buttons [ i ].length )
			return true;
		}
	    }
	}
	}*/

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

    public void paintComponent ( Graphics g ) {
	super.paintComponent ( g );
	System.out.println ( "hi" + buttons.length );
	System.out.println ( "x:" + x + "  " + buttons [ 4 ].length + "\n" + "y:" + y + "   " + buttons.length);
	//buttons [ y ] [ x ].setBackground ( Color.red );
	if ( y > 0 ) {
	    for ( int[] coor : piece ) {
		buttons [ oldY + coor [ 1 ] ] [ oldX + coor [ 0 ] ].setBackground ( null );
	    }
	}
	for ( int[] coor : piece ) {
	    buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( Color.red );
	}
	//	if ( y > 0 )
	//  buttons [ y - 1 ] [ x ].setBackground ( null );
	// for ( int i = buttons.length - 1 ; i > 0 ; i-- ) {
	//     int count = 0;
	//     for ( int j = 0 ; j < buttons [ i ].length ; j++ ) {
	// 	if ( buttons [ i ] [ j ].getBackground() == Color.red ) {
	// 	    count = count + 1;
	// 	    //System.out.println ( "add one count" );
	// 	}
	// 	if ( count == buttons [ i ].length ) {
	// 	    System.out.println ( "clearline" );
	// 	    for ( int k = 0 ; k < buttons [ i ].length ; k++ ) {
	// 		buttons [ i ] [ k ].setBackground ( null );
	// 	    }
	// 	    shift ( i );
	// 	}
	//     }
	// }
    }

    public void run() {
	start();
	//if ( buttonPressed != 0 ) {
	while ( true ) {//y < buttons.length - 1 ) {
		try {
		    t.sleep ( wait );
		} catch ( InterruptedException e ) {
		}
		this.go();
		this.reset();
		this.update ( this.getGraphics() );
		System.out.println ( "x:" + x + "\n" + "y:" + y );
		//}
	}
    }

    /* public void paintComponent ( Graphics g ) {
	image = toolkit.getImage ( "grid.png" );
	super.paintComponent ( g );
	g.drawImage ( image , 0 , 0 , null );
	}*/
}
