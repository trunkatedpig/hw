import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guitest extends Jframe {
    
    private Container pane;
    private JButton exitButton,b;
    private JLabel l;
    private JTextField text;
    private JPanel canvas;
    private Container buttons;
    private JCheckBox box;

    public void Guitest(){
	setTitle("Caspar Lant");
	setSize(600,800);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	b = new Button("button?");
    }

    
    
    public static void main (String[] args){
	Guitest G = new Guitest();
	//G.blahblah
	G.setVisible(true);
    }
}