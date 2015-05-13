package Pinnwand;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * The Save class handles the writing in files.
 * @author musdasch
 */
public class Save {
	/**
	 * The strings path and file holds the name of the save file and the path who it's save.
	 */
	private String path, file;
	
	/**
	 * The number holds a number. it will be increase ins a note saved.
	 */
	private int number = 0;
	
	/**
	 * holds the method for writing in a file.
	 */
	private PrintWriter writer;
	
	/**
	 * the Constructor includes the name and the path of the file form the Main class.
	 * @param path - path to the save folder.
	 * @param file - the file name.
	 */
	public Save( String path, String file ){
		this.path = path;
		this.file = file;
	}
	
	/**
	 * The writeToFile method checks it's the file exist, if the file exist it increase the number, If
	 * it not exist creates the method a new file and writing the text in the file.
	 * @param text - the text will be saved in a file.
	 */
	public void writeToFile( String text ){
		while( fileExiste( path + number + "-" + file ) ){
			numberUp();
		}
		
		try {
			writer = new PrintWriter( path + number + "-" + file , "UTF-8" );
			writer.println( text );
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println( "Notiz Konnte nicht geschriben werden." );
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println( "Notiz Konnte nicht geschriben werden." );
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Checks if the file exist.
	 * @param file
	 * @return true - if the file exist.
	 */
	public boolean fileExiste( String file ){
	  return new File( file ).exists();
	}
	
	/**
	 * increase the number.
	 */
	public void numberUp(){
		number++;
	}

}