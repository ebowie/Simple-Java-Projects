import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Driver2 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner readInFile = new Scanner(new File("wordfile.txt"));
		ArrayList<String> words = new ArrayList<String>();
		LinkedList<String> [] word = new LinkedList[26];
		
		
		char [] Letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		while(readInFile.hasNext()){
			  words.add(readInFile.next());
		}
		
		
		readInFile.close();
		
		for(int x = 0; x<Letters.length;x++){
				word[x] = new LinkedList();
			for(int y =0;y<words.size();y++){
				if(Letters[x] == words.get(y).charAt(0)){
					word[x].add(words.get(y));
				}
			}
			Collections.sort(word[x]);
		}
		for(int i = 0; i<word[0].size();i++){
			System.out.println(word[0].get(i));
		}
		
	}

}
