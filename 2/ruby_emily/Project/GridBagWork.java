import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class GridBagWork extends JFrame implements ActionListener{
    private JTextField textbox;
    private JButton button;
    private JButton button2;
    private Container pane;

    public GridBagWork(){
	pane=this.getContentPane();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c= new GridBagConstraints();

	button=new JButton("Scramble");
	c.fill=GridBagConstraints.HORIZONTAL;
	c.gridx=0;
	c.gridy=0;
	pane.add(button, c);

	button2=new JButton("Quit");
	c.fill=GridBagConstraints.HORIZONTAL;
	c.gridx=1;
	c.gridy=1;
	pane.add(button2, c);

	textbox=new JTextField(15);
	c.gridx=1;
	c.gridy=2;
	pane.add(textbox,c);

	button2.addActionListener(this);
    }

     public void actionPerformed(ActionEvent e){
	 if (e.getSource()==button2){
	     System.exit(0);
	 }
     }


    public static void main(String[] args){
	GridBagWork g = new GridBagWork();
	g.setTitle("working");
	g.setSize(500,500);
	g.setVisible(true);
	g.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
    }

}
