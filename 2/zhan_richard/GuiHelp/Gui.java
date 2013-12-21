import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
    
    private JButton exitButton,b;
    private Container pane;
    private JLabel l;
    private JTextField text;
    private JPanel canvas;
    private Container buttons;
    
    public void actionPerformed(ActionEvent e) {
	System.out.println(e);
    }

    public Gui() {
	this.setTitle("Can I?\nGuess not");
	this.setSize(800,600);
	this.setLocation(200,50);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	//pane.setLayout(new FlowLayout());
	pane.setLayout(new GridLayout(6,2));

	exitButton = new JButton("Exit");
	b = new JButton("Button 1");
	l = new JLabel("This is a label",null,JLabel.CENTER);
	text = new JTextField(40);
	canvas = new JPanel();
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));

	buttons = new Container();
	//buttons.setLayout(new FlowLayout());
	buttons.setLayout(new GridLayout(0,2));
	buttons.add(b);
	buttons.add(exitButton);
	pane.add(buttons);
	pane.add(l);
	pane.add(text);
	pane.add(canvas);

	exitButton.addActionListener(this);
	b.addActionListener(this);
    }

    

    public void hello() {
	System.out.println("Hello");
    }
    public static void main(String[] args) {
	Gui g = new Gui();
	g.setVisible(true);
    }
}
