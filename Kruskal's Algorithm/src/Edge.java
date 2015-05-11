import java.util.ArrayList;


public class Edge {
	
	String node1;
	String node2;
	int weight;
	ArrayList<Object> listOfEdges = new ArrayList<Object>();
	Object[] edges;
	public Edge(){
		
	}
	
	
	
	public void setEdge(String node1, String node2, int weight){
		
	this.node1 = node1;
	this.node2 = node2;
	this.weight = weight;
	
	listOfEdges.add(this.node1+","+this.weight+","+this.node2);//adding the nodes and weight together
	}

	public void Sort(){
		edges  = new Object[listOfEdges.size()];
		int k=0;
		for(int i = 1; i<=3; i++){//sort its from weight of 1 to 3 using nested for loop and putting it in a temp object array.
			for(int j=0; j<listOfEdges.size();j++){// while clearing the arraylist and upload the sorted list.
				if(i == Character.getNumericValue(listOfEdges.get(j).toString().charAt(2))){
					edges[k] = listOfEdges.get(j);
					k++;
				}
			}
		}
			listOfEdges.clear();
			
		for(int i=0; i<edges.length;i++){
			listOfEdges.add(edges[i]);
		}
		
		
	}
	
	public String findRoot(){
	   ArrayList<Character> letterCheck = new ArrayList<Character>();
	   letterCheck.add(' ');
	   ArrayList<Object> duplicateCheck = new ArrayList<Object>();
	   duplicateCheck.add(" ");
	   ArrayList<Object> minTree = new ArrayList<Object>();
	   char letter = 'A';
	   int check1=0;
 	   int check2=0;
 	   int check3=0;
	 int i = 0;
	  
	   	while(i != listOfEdges.size()){
	   		
	   		 i = 0;
	   		check3 =0;
	   		while(i<listOfEdges.size()){// loop through listOfEdges Array
	   		if(listOfEdges.get(i).toString().charAt(0) == letter){ //Check for the first letter of next edge
	   			
	   			if(Character.getNumericValue(listOfEdges.get(i).toString().charAt(2))== 1){//Check for the min weight
	   				
	   				for(int x =0; x<duplicateCheck.size(); x++){ //Checks for duplicates 
	   					if(listOfEdges.get(i).equals(duplicateCheck.get(x))){// if there is duplicate it break out of the loop
	   						check1 = 1;
	   						break;
	   					}
	   					
	   					
	   				}
	   						for(int y = 0; y<letterCheck.size(); y++){//Checks for loop arounds
	   							if(listOfEdges.get(i).toString().charAt(4) == letterCheck.get(y)){// if there is loop it will break out for loop
	   								check2 = 1;
	   								break;
	   							}	
	   						}
	   						
	   						if(check1 != 1 && check2 != 1){
	   							duplicateCheck.add(listOfEdges.get(i));// updates duplicate array
   		   						duplicateCheck.add(listOfEdges.get(i).toString().charAt(4)+"," //update duplicate array
   		   						+listOfEdges.get(i).toString().charAt(2)+","
   		   						+listOfEdges.get(i).toString().charAt(0));
   		   						
   		   						letterCheck.add( letter); //update letterCheck
   		   						minTree.add(listOfEdges.get(i)); // update spanning tree
   		   						check3 =1;
   		   						letter = listOfEdges.get(i).toString().charAt(4);
	   						}
	   						
	   						
	   					}
	   				
	   				
	   				
	   				
	   				
	   			
	   			else if(Character.getNumericValue(listOfEdges.get(i).toString().charAt(2))== 2){//Check for the min weight
	   				for(int x =0; x<duplicateCheck.size(); x++){ //Checks for duplicates 
	   					if(listOfEdges.get(i).equals(duplicateCheck.get(x))){// if there is duplicate it break out of the loop
	   						check1 = 1;
	   						break;
	   					}
	   					
	   					
	   				}
	   						for(int y = 0; y<letterCheck.size(); y++){//Checks for loop arounds
	   							if(listOfEdges.get(i).toString().charAt(4) == letterCheck.get(y)){// if there is loop it will break out for loop
	   								check2 = 1;
	   								break;
	   							}	
	   						}
	   						
	   						if(check1 != 1 && check2 != 1){
	   							duplicateCheck.add(listOfEdges.get(i));// updates duplicate array
   		   						duplicateCheck.add(listOfEdges.get(i).toString().charAt(4)+"," //update duplicate array
   		   						+listOfEdges.get(i).toString().charAt(2)+","
   		   						+listOfEdges.get(i).toString().charAt(0));
   		   						
   		   						letterCheck.add(letter); //update letterCheck
   		   						minTree.add(listOfEdges.get(i)); // update spanning tree
   		   						check3 =1;
   		   					letter = listOfEdges.get(i).toString().charAt(4);
	   						}
	   						
	   			}
	   			else if(Character.getNumericValue(listOfEdges.get(i).toString().charAt(2))== 3){//Check for the min weight
	   				for(int x =0; x<duplicateCheck.size(); x++){ //Checks for duplicates 
	   					if(listOfEdges.get(i).equals(duplicateCheck.get(x))){// if there is duplicate it break out of the loop
	   						check1 = 1;
	   						break;
	   					}
	   					
	   					
	   				}
	   						for(int y = 0; y<letterCheck.size(); y++){//Checks for loop arounds
	   							if(listOfEdges.get(i).toString().charAt(4) == letterCheck.get(y)){// if there is loop it will break out for loop
	   								check2 = 1;
	   								break;
	   							}	
	   						}
	   						
	   						if(check1 != 1 && check2 != 1){
	   							duplicateCheck.add(listOfEdges.get(i));// updates duplicate array
   		   						duplicateCheck.add(listOfEdges.get(i).toString().charAt(4)+"," //update duplicate array
   		   						+listOfEdges.get(i).toString().charAt(2)+","
   		   						+listOfEdges.get(i).toString().charAt(0));
   		   						
   		   						letterCheck.add( letter); //update letterCheck
   		   						minTree.add(listOfEdges.get(i)); // update spanning tree
   		   						check3 =1;
   		   						letter =listOfEdges.get(i).toString().charAt(4);
	   						}
	   						
	   			}
	   		}
	   		
	   		
	   		 if(check3 == 1){
	   			 break;
	   		 }
	   		i++;
	   		check1=0;
	   		check2=0;
	   		}
	   		
	   	}
	   	
		return minTree.toString();
	}

}
