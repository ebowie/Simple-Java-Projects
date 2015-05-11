import java.util.Scanner;
public class PracticeProgram
{
	public static void main(String[] args)
	{
	int number;
	number = 2;
	int guess;
	Scanner readinput = new Scanner(System.in);
	
		for(int x = 11;x>0;x--)
		{System.out.println(x);}		
		System.out.println("blast off!!");
	System.out.println("put in a number");
	 number = readinput.nextInt();
	 
	 		do
			{
			
	System.out.println("guess the number");
	guess = readinput.nextInt();

			
			if(number == guess)
			{
			System.out.println("you got it");
			}
			else
			{System.out.println("sorry guess again");
			}
			}while(number != guess);
	}				 


}
