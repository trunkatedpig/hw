
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridBagWork{

    private JButton button;
    private Container pane;

    public GridBagWork(){
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c= new GridBagConstraints();
	button=new JButton("Button");
	c.fill=GridBagConstraints.HORIZANTAL;
	pane.add(button, c);
    }

    public static void main(String[] args){
	GridBagWork g = new GridBagWork();
	g.setTitle("working");
	g.setSize(500,500);
	g.setVisible(true);
	g.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
    }

}
