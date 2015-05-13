package Pinnwand;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Save save = new Save("/home/clelia/Schreibtisch/", "pinnwand.txt");
		
		JFrame inputFrame = new InputFrame(save);
		new Frame("Pinnwand", new Dimension(300,300), inputFrame);
		
	}

	
}