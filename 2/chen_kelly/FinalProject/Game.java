import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.Canvas;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable{
    private static final long serialVersionVID = 1L;

    public static int width = 300;
    public static int height = width/16 * 9;
    public static int scale = 3;

    private Thread thread;
    private JFrame frame;
    private boolean running = false;

    public Game(){
	Dimension size = new Dimension(width*scale, height*scale);
	setPreferredSize(size);
	frame = new JFrame();
    }

    public synchronized void start(){
	running = true;
	thread = new Thread(this, "Display");
	thread.start();
    }

    public synchronized void stop(){
	running = false;
	try{
	thread.join();
	} catch(InterruptedException e){
	    e.printStackTrace();
	}
    }

    public void run(){
	while(running){
	    //consistent speed for update  no matter what fps
	    update();
	    //as many times as your computer can
	    render();
	}
    }

    public void update(){

    }

    public void render(){
	//Buffers are for temp storage
	//getting BufferStrategy of Canvas object--> Game
	BufferStrategy bs =  getBufferStrategy();
	if(bs == null){
	    createBufferStrategy(3);
	    return;
	}
	//link between graphics and bufferstrategy (creating graphics context)
	Graphics g = bs.getDrawGraphics();
	//ALL GRAPHICS GO HERE
	g.setColor(Color.BLACK);
	g.fillRect(0,0,getWidth(), getHeight());
	g.dispose(); //disposes of current graphics
	bs.show(); //makes next available buffer visible
    }

    public static void main(String[] args){
	Game game = new Game();
	game.frame.setResizable(false);
	game.frame.setTitle("Bomberman");
	game.frame.add(game);
	game.frame.pack();
	game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//centers frame	
	game.frame.setLocationRelativeTo(null);
	game.frame.setVisible(true);

	game.start();
    }

}
