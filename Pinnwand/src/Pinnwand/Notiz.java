package Pinnwand;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Notiz {

	public  void openTextFile(){
	}

	public static void openNotiz (String files) {
		//ganze datei in string einlase
		//neues jframe
		//dort das element indem ich den text einscheiben kann jtextfield (mehrere zeilen)
		//im construktor den text den man ausliest dem frame mitgeben
		//im frame text darstellen
		//entsprechendes frame öffnen und dort den text setzen
		try{
			String notiz = "";
			BufferedReader in = new BufferedReader (
					new FileReader("./files/notes/"+files));
				try{
					for(String line;(line=in.readLine())!=null;)
					  notiz += line+"\n";
					in.close();
				} catch(IOException e){
					System.out.println("Read error "+ e);
				}
				System.out.println(notiz);
								
				

		}catch(IOException e){
			System.out.println("Open error "+e);;
		}
		
		
		
		
	}
	
		
		
	
	
	}

