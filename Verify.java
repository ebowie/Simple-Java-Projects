import java.io.*;
import java.util.Scanner;
public class Verify {
	File myfile;
	Scanner input;
	String [] passwords = new String[30];
	
	public Verify(String fileName)throws IOException
	{
		myfile = new File(fileName); // morse code is put in file name 
		input = new Scanner(myfile); // then file goes in the readinput 
		loadFile();
	}
	public void loadFile()// this method is to put all file characters in the array and all the codes in the array
	{ int i =0;
		while(input.hasNext())
		{
			passwords[i] = input.next();
			i++;
		}
	}
	public String getPassword(String getPass)
	{   
		String currentPassword = "This password is not right!!";
		for(int k =0;k<30;k++)
		{
		
		if(getPass.equals(passwords[k]))
		{
			currentPassword = "This password is right!!";
		}
		
		}

	
	return currentPassword;
	}	
}
