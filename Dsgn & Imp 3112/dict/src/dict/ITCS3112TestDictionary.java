package dict;

public class ITCS3112TestDictionary {
	
	public static void main(String [] args){
		
		LinkedListDictionary[] linkedList = new LinkedListDictionary[5];
		HashDictionary hashDict[] = new HashDictionary[5];
		
		
		String testString = "Test";
		int testInt = 8;
		double testDouble = 1000;
		boolean testBool = true;
		
		
		for(int i = 0; i < 5; i++)
		{
			hashDict[i] = new HashDictionary();
		}
		for(int i = 0; i < 5; i++)
		{
			linkedList[i] = new LinkedListDictionary();
		}
		
		
		
		linkedList[0].put("a", "object1");
		System.out.println("Linked List put-get: " + linkedList[0].get("a"));
		
		linkedList[1].put("b", "object 2");
		linkedList[1].remove("b");
		System.out.println("Linked List put-remove-get: " + linkedList[1].get("b"));
		
		
		linkedList[2].put("c", "object 3");
		linkedList[2].put("c", "object 4");
		linkedList[2].put("c", "object 5");
		linkedList[2].remove("c");
		System.out.println("Linked List put multiple-remove-get: " + linkedList[2].get("c"));
		
		linkedList[3].put(null,  "object 6");
		System.out.println("Linked List null toString: " + linkedList[3].toString());
		
		linkedList[4].put("d", testString);
		linkedList[4].put("d", testInt);
		linkedList[4].put("d", testDouble);
		linkedList[4].put("d", testBool);
		System.out.println(linkedList[4].toString());
		System.out.println("\n_______TESTING HASH BELOW ________\n");
		
		hashDict[0].put("a", "object1");
		System.out.println("Hash Dictionary put-get: " + hashDict[0].get("a"));
		
		hashDict[1].put("b", "object 2");
		hashDict[1].remove("b");
		System.out.println("Hash Dictionary put-remove-get: " + hashDict[1].get("b"));
		
		hashDict[2].put("c", "object 3");
		hashDict[2].put("c", "object 4");
		hashDict[2].put("c", "object 5");
		hashDict[2].remove("c");
		System.out.println("Hash Dictionary put multiple-remove-get: " + hashDict[2].get("c"));
		
		hashDict[3].put(null,  "object 6");
		System.out.println("Hash Dictionary null toString: " + hashDict[3].toString());
		
		hashDict[4].put("d", testString);
		hashDict[4].put("d", testInt);
		hashDict[4].put("d", testDouble);
		hashDict[4].put("d", testBool);
		System.out.println(hashDict[4].toString());
			
	
	
	}
}	

	

	
