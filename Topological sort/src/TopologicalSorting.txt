/*
 * Author: Darius Pinnix
 * Date: March 22, 2015
 * Class: ITCS 2215
 * File Name: Topological Ordering.java
 */
import java.io.File; //Reads files
import java.io.FileNotFoundException; //Catches incorrect file names
import java.util.Arrays; //Creates array
import java.util.Scanner; //Reads user input

public class Driver {

	@SuppressWarnings("resource") //Warning suppress
	public static void main(String[] args) throws FileNotFoundException //Throws exception if file is inputed incorrectly
	{
		try //Call a try to test program if file name is correct
	    {
			String [] Array1, Array2, groupLetters; //Creating strings for ordering the topological graph
			String StoreLetters = ""; //String to store each letter
			String tempLetters = " "; //String to temporarily place letters
			int y = 0, index = 0; //Setting increments for characters
			int check = 0; //Checks the positioning of letters in the order
			
			System.out.println("Enter in name of file (.txt): "); //Prompt user to enter file name
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.nextLine();
			File myfile = new File(input); //Checks if filename is correct
			Scanner collectLetters = new Scanner(myfile);
			String Letters = "";
			
			while(collectLetters.hasNext())
			{
				Letters += collectLetters.next();
				Letters += " ";
			}
			Letters = Letters.replaceAll(",",""); //Removes all commas from text file
			groupLetters = Letters.split(" "); //Splits space characters from text file
			Letters = Letters.replaceAll(" ",""); //Removes all space characters from text file
		    Array1 = new String[Letters.length()]; //Sets all remaining characters in text file in array
	
		    for(int i = 0; i < Letters.length(); i++)
		    {    	
		    	Array1[i] = Character.toString(Letters.charAt(i));	//Converts integer positions of letters into strings
		    }
		    Arrays.sort(Array1); //Sorts the array according to number value
			
		    for(int i = 0; i < Letters.length(); i++)
		    {
		    	int j = 0; //Create a variable for array position
		    	
		    	while(j < tempLetters.length())
		    	{
		    		if(Character.toString(tempLetters.charAt(j)).equals(Array1[i]))
		    		{
		    			check++; //Increment check counter
		    		}
		    		j++; //Increment j to next array position
		    	}
		    	if(check == 0)
		    	{
		    		tempLetters += Array1[i]; //Set temporary letter to 0 position of array		
		    	}
		    	check = 0; //Set check to 0
		    }
		    tempLetters = tempLetters.replace(" ",""); //Removes extra space characters
		    Array2 = new String [tempLetters.length()]; //Sets array2 as length of first array of characters
	   
		    for(int i = 0; i < tempLetters.length(); i++)
		    {
		    	Array2[i] = Character.toString(tempLetters.charAt(i)); //Converts array2 positions of letters into strings
		    }		    
		    int [] Array3 = new int [Array2.length]; //Creates entire array from all arrays in file
	   
		    for(int i = 0; i < groupLetters.length; i++) //Designates the character in position
		    { 
		    	for(int j = 0; j < groupLetters[i].length(); j++) //Designates the array in position
		    	{
		    		if(Character.toString(groupLetters[i].charAt(j)).equals("A")) //If character in array queue is A
		    		{
		    			if(j == 0)
		    			{
		    				Array3[0] = Array3[0] + 0; //Counter is set as 0
		    			}
		    			else
		    			{
		    				Array3[0] = Array3[0] + 1; //Counter is set as 1 in next queue position
		    			}
		    		}
		    		else if(Character.toString(groupLetters[i].charAt(j)).equals("B")) //If character in array queue is B
		    		{
		    			if(j == 0)
		    			{
		    				Array3[1] = Array3[1] + 0; //Counter is set as 0
		    			}
		    			else
		    			{
		    				Array3[1] = Array3[1] + 1; //Counter is set as 1 in next queue position
		    			}
		    		}
		    		else if(Character.toString(groupLetters[i].charAt(j)).equals("C")) //If character in array queue is C
		    		{
		    			if(j == 0)
		    			{
		    				Array3[2] = Array3[2] + 0; //Counter is set as 0
		    			}
		    			else
		    			{
		    				Array3[2] = Array3[2] + 1; //Counter is set as 1 in next queue position
		    			}
		    		}
		    		else if(Character.toString(groupLetters[i].charAt(j)).equals("D")) //If character in array queue is D
		    		{
		    			if(j == 0)
		    			{
		    				Array3[3] = Array3[3] + 0; //Counter is set as 0
		    			}
		    			else
		    			{
		    				Array3[3] = Array3[3] + 1; //Counter is set as 1 in next queue position
		    			}
		    		}
		    		else if(Character.toString(groupLetters[i].charAt(j)).equals("E")) //If character in array queue is E
		    		{
		    			if(j == 0)
		    			{
		    				Array3[4] = Array3[4] + 0; //Counter is set as 0
		    			}
		    			else
		    			{
		    				Array3[4] = Array3[4] + 1; //Counter is set as 1 in next queue position
		    			}
		    		}
		    		else if(Character.toString(groupLetters[i].charAt(j)).equals("F")) //If character in array queue is F
		    		{
		    			if(j == 0)
		    			{
		    				Array3[5] = Array3[5] + 0; //Counter is set as 0
		    			}
		    			else
		    			{
		    				Array3[5] = Array3[5] + 1; //Counter is set as 1 in next queue position
		    			}
		    		}
		    	}
		   
		    }
		    while(y <= groupLetters.length) //Counter for length of grouped letters
		    {   
		    	for(int i = 0; i < Array3.length; i++)
		    	{
		    		if(Array3[i] == 0)
		    		{
		    			StoreLetters += Array2[i]; //Stores characters in appropriate position
		    			Array3[i] = 100; //Limiter for array size
		    			index = i; //Sets the character
		    			break; //Ends array if beyond array index
		    		}
		    	} 
		    	for(int i = 0; i < groupLetters.length;i++) //Loops through each character until it is 0
		    	{
		    		if(Character.toString(groupLetters[i].charAt(0)).equals(Array2[index]))
		    		{
		    			for(int j = 1; j < groupLetters[i].length(); j++)
		    			{
		    				if(Character.toString(groupLetters[i].charAt(j)).equals("A"))
		    				{
		    					Array3[0] = Array3[0] - 1; //Decrements A count until it is 0
		    				}
		    				else if(Character.toString(groupLetters[i].charAt(j)).equals("B"))
		    				{
		    					Array3[1] = Array3[1] - 1; //Decrements B count until it is 0
		    				}
		    				else if(Character.toString(groupLetters[i].charAt(j)).equals("C"))
		    				{
		    					Array3[2] = Array3[2] - 1; //Decrements C count until it is 0
		    				}
		    				else if(Character.toString(groupLetters[i].charAt(j)).equals("D"))
		    				{
		    					Array3[3] = Array3[3] - 1; //Decrements D count until it is 0
		    				}
		    				else if(Character.toString(groupLetters[i].charAt(j)).equals("E"))
		    				{
		    					Array3[4] = Array3[4] - 1; //Decrements E count until it is 0
		    				}
		    				else if(Character.toString(groupLetters[i].charAt(j)).equals("F"))
		    				{
		    					Array3[5] = Array3[5] - 1; //Decrements F count until it is 0
		    				}
		    			}
		    		}
		    	}
		    	y++; //Increments y to next non-0 characters in array
		    }
		    System.out.println(StoreLetters); //Prints the topological order of characters in text file
		}
		catch (FileNotFoundException e) //Throws exception if filename is incorrect
	    {
	        System.out.println("Incorrect filename! Restart the program and enter in a correct filename.");
	    }
	}
}
