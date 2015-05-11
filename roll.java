import java.util.Random;
public class roll {

	private int dice1;
	private int dice2;
	private Random randomNumber;
	
public roll()
{
	randomNumber = new Random();
	rollDice();
}
public void rollDice()
{
	dice1  = randomNumber.nextInt(6);
	
	finalDice = dice1 + dice2;
	finalDice();
}
public void rollDice2()
{
	dice2  = randomNumber.nextInt(6);
}
public int getrollDice()
{
	return dice1;
}
public int getrollDice2()
{
	return dice2;
}
public int finalDice()
{
	int finalDice;
	finalDice = dice1 + dice2;
	return finalDice;
}
}
