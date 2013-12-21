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
	b.update ( b.getGraphics() );
	b.requestFocus();
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
	    b.start();
	}
    }
}

class board extends JPanel implements KeyListener {
    Image image;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    JButton[] buttons = new JButton [ 135 ];
    //JTable table = new JTable ( 10 , 15 );

    public board() {
	//super ( 15 , 10 );
	this.addKeyListener(this);
	super.setLayout ( new GridLayout( 15 , 9 ) );
	int k = 0;
	for ( int i = 0 ; i < 15 ; i++ ) {
	    for ( int j = 0 ; j < 9 ; j++ ) {
		buttons [ k ] = new JButton ( );
		this.add ( buttons [ k ] );
		k = k + 1;
	    }
	}
	setSize ( 500 , 500 );
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
	this.update ( this.getGraphics() );
    }

    public void keyPressed ( KeyEvent e ) {
	System.out.println ("pressed: " + e.getKeyCode() );
    }

    public void keyTyped ( KeyEvent e ) {
	System.out.println ( "typed: " + e.getKeyCode() );
    }

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
	    y = y - 1;
	    buttons [ x + 9 ].setBackground ( Color.red );
	    buttons [ x ].setBackground ( null );
	    x = x + 9;
	    this.update ( this.getGraphics() );
	}
    }

    /* public void paintComponent ( Graphics g ) {
	image = toolkit.getImage ( "grid.png" );
	super.paintComponent ( g );
	g.drawImage ( image , 0 , 0 , null );
	}*/
}
