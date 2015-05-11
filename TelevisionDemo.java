import java.util.Scanner;
public class TelevisionDemo
{
	public static void main(String[]args)
	{
			String manufacturer;
			double screenSize;
			boolean thePower;
			String Power;
			int channel,channel2,volume,volume2,volume3;
			
			
		
	 Scanner readinput = new Scanner(System.in);
	  
	  
	
	 System.out.println("enter a manufacturer brand");
	 manufacturer = readinput.nextLine();
	 
	 System.out.println("enter the screen size");
	 screenSize = readinput.nextDouble();
	 
	 System.out.println("what channel do you want to watch");
	 channel=readinput.nextInt();
	 
	 Television myTV = new Television(manufacturer,screenSize);
	 myTV.setChannel(channel);
	 
	 
	 screenSize = myTV.getScreenSize;
	 manufacturer = myTV.getManufacturer();
	 thePower = myTV.power();
	 channel = myTV.getChannel();
	 channel2=myTV.getChannel2();
	 volume = myTV.getVolume();
	 volume2 = myTV.increaseVolume();
	 volume3 = myTV.decreaseVolume();
	 if( thePower == true)
	  { Power = "on";}
		else
		{ Power = "off";}
	   
	 System.out.println("This brand of tv is a : " + manufacturer+" "+ screenSize+ " inch HDTV ");
	 System.out.println("The power is: " + Power  );
	 System.out.println("The Channel was : "+channel2+" Now the Channel is set to: " + channel);
	 System.out.println("The Volume is at: "+volume + " and is now increased by "+ (volume2+=5));
	 System.out.println("The volume is to loud so lower the volume by :" + (volume2-=3));
	 System.out.println("OR if the volume was reset to "+volume+" then the volume would be lowered by "+ (volume3-=2));
	 	 
	 	 	}




}

class Television
{
	boolean powerOn;
	int volume, channel,channel2;
	String getManufacturer;
	double getScreenSize;
	

	public Television(String brandName, double tvSize)
	{
		getManufacturer= brandName;
		getScreenSize = tvSize;
		volume = 20;
		channel =2;
		channel2 =2;
		powerOn=false;
	
	
	}
	public int decreaseVolume()
	{
	 --volume;
	return volume;
	}
	public int increaseVolume()
	{
	 ++volume;
	return volume;
	}
	public int getVolume()
	{
	return volume;
	}
	public void setChannel(int c)
	{
	 
	channel = c;

	}
	public int getChannel()
	{
	return channel;
	}
	public int getChannel2()
	{
	return channel2;
	}
	
	public boolean power()
	{
	return powerOn =!powerOn;
	}

	public String getManufacturer()
	{
	return getManufacturer;
	}
	public double getScreenSize()
	{
	return getScreenSize;
	}





}