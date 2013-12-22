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
    int[][] piece2 = { { -1 , 1 } , { 0 , 1 } , { 0 , 0 } , { 1 , 1 } };
    int[][] piece3 = { { 0 , 0 } , { 1 , 0 } , { 0 , 1 } , { 1 , 1 } };
    int[][] piece4 = { { -1 , 1 } , { 0 , 1 } , { 0 , 0 } , { 1 , 0 } };
    //JTable table = new JTable ( 10 , 15 );

    public board() {
	//super ( 15 , 10 );
	this.addKeyListener(this);
	super.setLayout ( new GridLayout( 15 , 9 ) );
	int k = 0;
	for ( int i = 0 ; i < 15 ; i++ ) {
	    for ( int j = 0 ; j < 9 ; j++ ) {
		buttons [ i ] [ j ] = new JButton ( );
		this.add ( buttons [ i ] [ j ] );
		buttons [ i ] [ j ].addKeyListener ( this );
		k = k + 1;
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
	if ( e.getKeyCode() == KeyEvent.VK_DOWN )
	    System.out.println ( "down" );
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
	if ( e.getKeyCode() == KeyEvent.VK_UP )
	    System.out.println ( "up" );
	if ( e.getKeyCode() == KeyEvent.VK_DOWN )
	    System.out.println ( "down" );
	if ( e.getKeyCode() == KeyEvent.VK_LEFT ) {
	    System.out.println ( "left" );
	    if ( x >= 0 )
		z = -1;
	}
	if ( e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	    System.out.println ( "right" );
	    if ( x <= buttons [ 0 ].length )
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
    public void start() {
	//buttons [ 0 ] [ 4 ].setBackground ( Color.red );
	x = 4;
	y = 0;
	z = 0;
	piece = piece3;
        for ( int[] coor : piece ) {
	    buttons [ y + coor [ 1 ] ] [ x + coor [ 0 ] ].setBackground ( Color.red );
	}
    }

    public void go() {
	oldY = y;
	oldX = x;
	y = y + 1;
	x = x + z;
    }

    public void reset() {
	if ( ( y == buttons.length && piece == piece1 ) || y + 1 == buttons.length || buttons [ y + 1 ] [ x ].getBackground() == Color.red ) {
	    try {
		t.sleep ( 500 );
	    } catch ( InterruptedException e ) {
		System.out.println ( "interrupted" );
	    }
	    clearLine ( x , y );
	    start();
	}
    }

    public void clearLine ( int x , int y ) {
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

    public void paintComponent ( Graphics g ) {
	super.paintComponent ( g );
	System.out.println ( "hi" + buttons.length );
	System.out.println ( "x:" + x + "  " + buttons [ 4 ].length + "\n" + "y:" + y + "   " + buttons.length);
	buttons [ y ] [ x ].setBackground ( Color.red );
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
    }

    public void run() {
	start();
	//if ( buttonPressed != 0 ) {
	while ( true ) {//y < buttons.length - 1 ) {
		try {
		    t.sleep ( 500 );
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
