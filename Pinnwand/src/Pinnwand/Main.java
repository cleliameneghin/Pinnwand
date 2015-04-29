package Pinnwand;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		String text;

		Scanner sc = new Scanner(System.in);
		System.out.println("Gib einen Text ein");
		text = sc.next();
		Save s = new Save(text);
		
		String adress ="/home/clelia/Dokumente/Schule/Pratteln/4.Semester/226Java/";
		String file_name = adress+"test.txt";
		
				
				Save data = new Save(file_name, true);
		data.writeToFile(text);
		
		
	}
}