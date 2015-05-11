/**
 * Class: Server.java
 * Author Darius Pinnix 
 * Date: April 20, 2015
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.Scanner;

public class Server
{
	 private static Socket socket;
	
	 //Executes program and throws exception if error occurs
	 public static void main(String[] args) throws IOException
	 {		 
		 System.out.println("Server is currently active!"); //Message to show server is initialized
         ServerSocket socketServer = new ServerSocket(5555); //Initializing the socket server on port 5555
         
         try
         {
             Random rand = new Random();
             int number = rand.nextInt(99) + 1;
             Scanner input = new Scanner(System.in);
             boolean win = false;
             boolean win2 = false;
        	 
	         while(true) //While the connection is successfully connected
	         {
	        	 socket = socketServer.accept(); //Accepting the server connection
	        	 String results; //Creating a string for the end result
	        	 
	        	 //Receives the client response to the server
	             DataInputStream is = new DataInputStream (socket.getInputStream());
	             InputStreamReader isr = new InputStreamReader(is);
	             
	             //Captures the client inputs to be read by the server
	             BufferedReader br = new BufferedReader(isr);
	             String firstInt = br.readLine(); //Reads the first user input string from server as a number string
	
	             int firstNumber = Integer.parseInt(firstInt); //Parsing the first number string into an integer
                 int guess = (firstNumber); //Adding the numbers as a summation
                               
	             String secondInt = br.readLine(); //Reads the first user input string from server as a number string
	         	
	             int secondNumber = Integer.parseInt(secondInt); //Parsing the first number string into an integer
                 int guess2 = (secondNumber); //Adding the numbers as a summation
                 
	             try //Adding the first number with the second number to create the sum
	             { 	            	 
	            	 while (win == false && win2 == false)
	                 {
	                     try
	                     {
	                    	 if(guess2 != number)
	                         {
	                    		 System.out.println("Client One, Guess a number between 1 and 99: ");
	                    		 guess = input.nextInt();
	                    	                      
		                         if (guess == number)
		                         {
		                             win = true;
		                         }
		                         if (guess >= 100 || guess <= 0)
		                         {
		                        	 System.out.println("The number must be between 1 and 99!" + "\n");
		                         }
		                         else if (Math.abs(guess - number) >= 25)
		                         {
		                             System.out.println("Cold..." + "\n");
		                         }
		                         else if (Math.abs(guess - number) >= 25 || Math.abs(guess - number) >= 10)
		                         {
		                             System.out.println("Warm." + "\n");
		                         }
		                         else if (Math.abs(guess - number) <= 10)
		                         {
		                             System.out.println("Hot!" + "\n");
		                         }
	                         }    
	                    	 if(guess != number)
		                     {
	                    		 System.out.println("Client Two, Guess a number between 1 and 99: ");
		                         guess2 = input.nextInt();

		                         if (guess2 == number)
		                         {
		                             win2 = true;
		                         }
		                         if (guess2 >= 100 || guess2 <= 0)
		                         {
		                        	 System.out.println("The number must be between 1 and 99!" + "\n");
		                         }
		                         else if (Math.abs(guess2 - number) >= 25)
		                         {
		                             System.out.println("Cold..." + "\n");
		                         }
		                         else if (Math.abs(guess2 - number) >= 25 || Math.abs(guess2 - number) >= 10)
		                         {
		                             System.out.println("Warm." + "\n");
		                         }
		                         else if (Math.abs(guess2 - number) <= 10)
		                         {
		                             System.out.println("Hot!" + "\n");
		                         }    
	                         }	                                   
	                     }
	                     catch(InputMismatchException e)
	                     {
	                         System.out.println("Invalid input");
	                         input.next();
	                     }     
	                 }	 
	             }
	             catch(NumberFormatException e) //Catching user input error
	             {
	                 //If user input was not a number, then error message to client to enter proper integer
	                 results = "Please enter a proper integer!";
	                 input.next();
	             }	
				 if(input != null) //Pointer to close scanner
				 {
					 input.close(); //Closes the user input
				 }
				 
				 if(win == true)
				 {
					 System.out.println("Client One wins!");
					 System.out.println("The number was: "+ guess);
				 }
	             results = String.valueOf(guess) + "\n"; //Returning the integer sum as a result
				 
	             if(win2 == true)
				 {
					 System.out.println("Client Two wins!");
					 System.out.println("The number was: "+ guess2);
				 }
	             results = String.valueOf(guess2) + "\n"; //Returning the integer sum as a result

	             
	             //Returns the server response back to the client
	             DataOutputStream os = new DataOutputStream(socket.getOutputStream());
	             OutputStreamWriter osw = new OutputStreamWriter(os);
	             
	             //Writes the results into a message to send to client 
	             BufferedWriter bw = new BufferedWriter(osw);
	             bw.write(results);
	             
	             bw.flush();
	             System.exit(0);
	         }
	     }
	     finally
	     {
	         try
	         {
	             socketServer.close(); //Closes the server program
	         }
	         catch(Exception e)
			 {
				 e.printStackTrace(); //Handles exceptions
			 }
	     }
	 }
}