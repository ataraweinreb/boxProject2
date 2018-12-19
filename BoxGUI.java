/**
 * 
 * @author Tara Weinreb
 * 
 * GUI - creates the pop up window which displays our sorted and unsorted lists in two columns
 */
 
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BoxGUI extends JFrame{  //Box gui inherits jframes properties
	private TextArea unsorted, sorted;//TextArea class is in javax.swing
    Container container;
	public BoxGUI(UnsortedBoxList ubl, SortedBoxList sbl) {
		setTitle("Project 2");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when you press the x on the gui it automatically terminates the program, without this the program will keep running
		setLocationRelativeTo(null);//this jframe doesnt have a parent, this is setting its location to the whole window
		setLayout(new GridLayout(1, 2));
		container = this.getContentPane();
		unsorted = new TextArea();
		sorted = new TextArea();
		container.add(unsorted);
		container.add(sorted);
		unsorted.setText(ubl.toString());
		sorted.setText(sbl.toString());
		setVisible(true);
		
	}
	
}


