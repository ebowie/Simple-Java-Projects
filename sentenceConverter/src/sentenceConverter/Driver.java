package sentenceConverter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		PrintWriter out = new PrintWriter("outSentence.txt");
		File myfile = new File("sentence.txt");
		
		Scanner file = new Scanner(myfile);
		
		while(file.hasNext()){
			
			Converter myConverter = new Converter(file.nextLine());
			
			System.out.println(myConverter.getConverted());
			
			out.println(myConverter.getConverted());
		}
		
		file.close();
		out.close();
	}

}
