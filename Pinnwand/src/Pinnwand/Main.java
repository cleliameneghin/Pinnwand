package Pinnwand;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Save save = new Save("./files/notes/", "pinnwand.txt");
		
		InputFrame inputFrame = new InputFrame(save, true);
		Frame frame = Frame.getInstance(inputFrame);
		frame.setTitle("Pinnwand");
		
	}

	
}