package Pinnwand;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * The Class IputFrame is a Frame for add new Notes in the Pinnwand program.
 * @author musdasch
 *
 */
public class InputFrame extends JFrame implements ActionListener {
	
	/**
	 * the textArea holds the text area for typing the notes.
	 */
	private JTextArea textArea;
	
	/**
	 * The saveButton holds the button for saving the notes.
	 */
	private JButton saveButton;
	
	/**
	 * The save holds the Save object for writing. 
	 */
	private Save save;
	
	/**
	 * The Constructor includes the save object from the Main class and add the textArea and the saveButton
	 * on the frame. the visibility form the frame is default false.
	 * @param save - includes the object for saving.
	 */
	public InputFrame(Save save) {
		
		this.save = save;
		
		textArea = new JTextArea();
		textArea.setPreferredSize( new Dimension(300,300) );
		
		saveButton = new JButton( "Save" );
		saveButton.addActionListener( this );
		
		this.setTitle( "Neues Fenster" );
		this.setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE );
		
		this.getContentPane().add( textArea, BorderLayout.CENTER );
		this.getContentPane().add( saveButton, BorderLayout.NORTH );
		
		this.setLocationRelativeTo( null );
		this.pack();
		this.setVisible( false );
	}
	
	/**
	 * This method waits for a action on the saveButton. If a action on the saveButton,
	 * give the method the text form the textArea on the Save object, clear the textArea
	 * and set the visibility of false.
	 */
	public void actionPerformed ( ActionEvent ae ){
		if( ae.getSource() == this.saveButton ){
			this.setVisible( false );
			save.writeToFile( textArea.getText() );
			textArea.setText( "" );
		}
	}
}