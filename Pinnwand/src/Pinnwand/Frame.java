package Pinnwand;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

public class Frame extends JFrame{
	
	private JPanel textLabel;
	private JFrame inputFrame;
	private JButton newButton;
	
	public Frame(String title, Dimension dimension, final JFrame inputFrame) {
		
		this.inputFrame = inputFrame;
		
		textLabel = new JPanel();
		textLabel.setPreferredSize(new Dimension(500,500));
		
		newButton = new JButton("New Notiz");
		newButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				inputFrame.setVisible(true);
			}
		});
		
		JPopupMenu p = new JPopupMenu();
		JMenuItem editItem = new JMenuItem("Neue Notiz");
		editItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				inputFrame.setVisible(true);
			}
		});
		p.add(editItem);
		addMouseListener(new RightClick(p));
		
		
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(textLabel, BorderLayout.CENTER);
		this.getContentPane().add(newButton, BorderLayout.NORTH);
		
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
		
		/*Anzahl Notizen im ordner werden abgefragt und ausgegeben*/
		final File folder = new File("./files/notes/");
		listFilesForFolder(folder);
			
		
	}
	/*Anzahl Notizen werden abgefragt in einer bestimmten directory*/
	public void listFilesForFolder(final File folder){
		for(final File fileEntry: folder.listFiles()){
			if(fileEntry.isDirectory()){
				listFilesForFolder(fileEntry);
	
			}
			else{
				System.out.println(fileEntry.getName());
			}
		}
		
	}

}