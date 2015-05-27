package Pinnwand;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

public class Frame extends JFrame{
	
	private JPanel textLabel;
	private InputFrame inputFrame;
	private JButton newButton;
	static Frame instance;
	
	/*Diese funktion ist eine singelten, welche eine instanz von frame zurück gibt und zwar immer dieselbe*/
	public static Frame getInstance(InputFrame inputFrame){//rückgabewert ist Frame
		if(instance == null)
			instance = new Frame();
		instance.inputFrame = inputFrame;
		return instance;
	}
	
	private Frame() {//final=nach ausführen unveränderbar
				
		textLabel = new JPanel();
		textLabel.setPreferredSize(new Dimension(500,500));
		
		newButton = new JButton("New Notiz");
		newButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				inputFrame.setNewMode(true);
				inputFrame.setVisible(true);
			}
		});
		
		JPopupMenu p = new JPopupMenu();
		JMenuItem newNote = new JMenuItem("Neue Notiz");
		JMenuItem newDokument = new JMenuItem("Neues Dokument");
		JMenuItem newImage= new JMenuItem("Neues Bild");
		newNote.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				inputFrame.setVisible(true);
			}
		});
		p.add(newNote);
		addMouseListener(new RightClick(p));
		newDokument.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		p.add(newDokument);
		addMouseListener(new RightClick(p));
		
		newImage.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		p.add(newImage);
		addMouseListener(new RightClick(p));
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(textLabel, BorderLayout.CENTER);
		this.getContentPane().add(newButton, BorderLayout.NORTH);
		
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
		
		textLabel.setLayout(new FlowLayout());
		createButtonsofFiles();
	}
		
	public void createButtonsofFiles(){
        /*Anzahl Notizen im ordner werden abgefragt und ausgegeben*/
		textLabel.removeAll();//damit bei der aktualisierung nicht alles verdoppelt wird müssen zuerst alle buttons entfernt werden 
        File folder = new File("./files/notes/");
        File[] listOfFiles= folder.listFiles();
        for(int i=0; i < listOfFiles.length; i++){
            if(listOfFiles[i].isFile()){
            final String files= listOfFiles[i].getName();
                System.out.println(files);
                JButton button = new JButton();
                button.setText("Notiz");
                button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Notiz.openNotiz(files);
						Frame.this.inputFrame.setNewMode(false);
						Frame.this.inputFrame.setVisible(true);
					}
				});

                textLabel.add(button);
            }
        }
        textLabel.repaint();
        textLabel.revalidate();
			}
			
		
	}
		
	

