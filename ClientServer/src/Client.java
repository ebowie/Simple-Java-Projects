/**
 * Class: Client.java
 * Author Darius Pinnix 
 * Date: April 20, 2015
 */
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args) throws IOException 
	 {
		 Scanner scanner = new Scanner(System.in); //Allows user to create input
		 Socket socketClient = new Socket("localhost",5555); //Initializing the socket server on port 5555
         
		 try
		 {
			//Prints if client is successfully responding to server
			System.out.println("Client One: " + "Connection has been established!");
			
			//Writes the inputs into a message to send to server 
		 	DataOutputStream os = new DataOutputStream (socketClient.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String clientOne = " "; //User input of first number as a string
            
            System.out.println("Client One, enter a number to establish a connection to the server: "); //Prompt user to input first number
			clientOne = scanner.nextLine(); //User input of first number	
			
            String firstNumber = clientOne + "\n"; //Writes the first number as string to send to server
            bw.write(firstNumber);
            bw.flush();          

            String clientTwo = " "; //User input of first number as a string
            
            System.out.println("Client Two, enter a number to establish a connection to the server: "); //Prompt user to input first number
			clientTwo = scanner.nextLine(); //User input of first number	
			
            String secondNumber = clientTwo + "\n"; //Writes the first number as string to send to server
            bw.write(secondNumber);
            bw.flush();
		 }
		 finally
		 {
			 if(scanner != null) //Pointer to close scanner
			 {
				 scanner.close(); //Closes the user input
			 }
			 try
	         {
	             socketClient.close(); //Close the client program
	         }
			 catch(NumberFormatException e)
			 {
				 e.printStackTrace(); //Handles exceptions
			 }
	     }
	 }
}