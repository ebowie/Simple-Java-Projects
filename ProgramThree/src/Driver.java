import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		ArrayList<String> words = new ArrayList<String>(); 
		Scanner readInFile = new Scanner(new File("wordfile.txt"));
		PrintWriter writer = new PrintWriter("orderWordFile.txt");
		String line = null;
		while(readInFile.hasNext()){
			
			words.add(readInFile.nextLine());
		
		}
		
	
		readInFile.close();
		Collections.sort(words);
		for(int x =0; x<words.size();x++){
			writer.println(words.get(x));
		}
		writer.close();
	}

}
