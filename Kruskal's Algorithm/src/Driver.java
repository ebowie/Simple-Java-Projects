import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Driver {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Edge edges = new Edge();
		String node1;
		String node2;
		int weight = 0;
		

		
		File myfile = new File("krushals.txt");
		Scanner krushalFile = new Scanner(myfile);
		while(krushalFile.hasNextLine()){
			String line;
			
			line = krushalFile.nextLine();
			//theses if statements and for loop separates the nodes and weight from the text file.
			if(!line.equals("")){
			line = line.replace(',', ' ');
				
			node1 = Character.toString(line.charAt(0));
			for(int i = 2; i<line.length(); i++){
				char temp = line.charAt(i);
				
				if(Character.isDigit(temp)){
					weight = Integer.parseInt(Character.toString(temp));
					
				}
			
				if(Character.isLetter(temp)){
					node2 = Character.toString(temp);
				
					edges.setEdge(node1, node2, weight);
				}
			}
				
			}
			
			
			
		}
		krushalFile.close();
		
		edges.Sort();
		System.out.println(edges.findRoot());
	}

}
