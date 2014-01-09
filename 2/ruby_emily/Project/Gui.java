import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
    private JButton stopButton;
    private JTextField textbox;
    private Container pane;
    
    public Gui(){
	stopButton=new JButton("Stop");
	this.add(stopButton);
       	stopButton.addActionListener(this);
	textbox=new JTextField(5);
	this.add(textbox);
	pane=this.getContentPane();
	pane.setLayout(new FlowLayout());
	pane.add(textbox);
	pane.add(stopButton);

    }
     public void actionPerformed(ActionEvent e){
	if (e.getSource()==stopButton){
	    System.exit(0);
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
