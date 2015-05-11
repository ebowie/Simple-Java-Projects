import java.io.*;
import java.util.Scanner;
public class Passwords {
	public static void main(String [] args)throws IOException
	{	char playAgain;
		do
		{
		String checkPasswords;
		String verifyed;
		Scanner input2 = new Scanner(System.in);
		Verify myPass = new Verify("Passwords.txt");
		
		
		System.out.println("enter a password");
		checkPasswords = input2.nextLine();
		
		verifyed = myPass.getPassword(checkPasswords);
		
		System.out.println(verifyed);
		
		System.out.println("Do you want enter another sentence, Enter 'y' if so : ");
		String character = input2.next();
		 playAgain = character.charAt(0);
	}while(playAgain == 'y'|| playAgain =='Y');
			
			
	}

}
