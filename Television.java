import java.util.Scanner;
import java.util.Scanner;

public class Television
{
	public static void main(String[] args)
	{   
	String manufacturer;
	int volume,channel;
	double screenSize;
	boolean powerOn;
	boolean thePower;
		
			
	Scanner readinput = new Scanner(System.in);
	System.out.println("Enter the manufacturer brand");
	manufacturer = readinput.nextLine();
	
	System.out.print("Enter the Screen Size");
	screenSize=readinput.nextDouble();
	
	TelevisionDemo myTV = new TelevisionDemo(manufactuer, screenSize);
	
	thePower = myTV.power();
	System.out.println("the power is :" + thePower);
	
	
	
	}
	
}	

class TelevisionDemo
{
	  
	public TelevisionDemo(String brandName,double tvSize)
	{
			manufacturer = brandName;
		  screenSize = tvSize;
		  powerOn = false;
		  channel = 2;
		  volume = 20;
		  
	}
	public void setChannel(int c)
	{
		channel=c;
	}
	public boolean power()
	{
	powerOn=!powerOn;
	}
	public int increaseVolume()	
	{
		return ++volume;
	}
	public int decreaseVolume()
	{
	return --volume;
	}
	public int getChannel()
	{
	return channel;
	}
	public int getVolume()
	{
	return volume;
	}
	public String getManufacturer()
	{
	return manufacturer;
	}
	public double getScreenSize()
	{
	return ScreenSize;
	}
}