import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
    private JButton quitButton;
    private JButton upperCase;
    private JButton clear;
    private JButton lowerCase;
    private JTextField textbox;

    private JPanel panel;
    private Container pane;
    
    public Gui(){
	clear=new JButton("Clear");
	upperCase=new JButton("Upper Case");
	lowerCase=new JButton("Lower Case");
	quitButton=new JButton("Quit");

	clear.addActionListener(this);
	lowerCase.addActionListener(this);
	upperCase.addActionListener(this);
       	quitButton.addActionListener(this);

	textbox=new JTextField(15);
	this.add(textbox);

	panel=new JPanel (new BorderLayout());

	pane=this.getContentPane();
	pane.setLayout(new FlowLayout());
	pane.add(textbox);
	pane.add(quitButton);
	pane.add(upperCase);
	pane.add(lowerCase);
	pane.add(clear);

    }
     public void actionPerformed(ActionEvent e){
	if (e.getSource()==quitButton){
	    System.exit(0);
	}
	if (e.getSource()==upperCase){
	    String s=textbox.getText();
	    textbox.setText(s.toUpperCase());
	}
	if (e.getSource()==lowerCase){
	    String s=textbox.getText();
	    textbox.setText(s.toLowerCase());
	}
	if (e.getSource()==clear){
	    String s="";
	    textbox.setText(s);
	}
	}

    public static void main(String[] args){
	Gui g=new Gui();
	g.setTitle("TEXT TWIST");
	g.setSize(500,500);
	g.setVisible(true);
	g.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
