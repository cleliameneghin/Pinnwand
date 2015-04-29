package Pinnwand;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame {

	public static void createWindow(){
		JFrame frame = new JFrame("Pinnwand");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("I' m a Label in the window", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300,300));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		frame.addMouseListener(new RightClick());
		
		//Display the window.
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
}
