package Pinnwand;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Save {
	private String path;
	private boolean appendToFile=false;
	
	public Save(String file_path){
		path= file_path;
	}
	public Save(String file_path, boolean append_value){
		path=file_path;
		addNummerationFilename();
		appendToFile = append_value;
	}
	public void writeToFile(String text) throws IOException{
		FileWriter write = new FileWriter(path,appendToFile);
		PrintWriter print_line= new PrintWriter(write);
		
		print_line.printf("%s"+"%n", text);
		print_line.close();
	}
	
	public boolean fileExiste(){
	  return new File(path).exists();
	}
	
	public String addNummerationFilename(){
		String p = path;
		int number=0;
		while(fileExiste()){
			path = path+number++;
		}
		return p;
		
	}
}
