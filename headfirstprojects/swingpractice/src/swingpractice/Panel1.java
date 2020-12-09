package swingpractice;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
	
	public static void main (String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JTextField field = new JTextField(20);
		
		
		
		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		JButton buttonThree = new JButton ("huh?");
		
		panel.add(button);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		panel.add(field);
		
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(250, 200);
		frame.setVisible(true);
		
	}
}
