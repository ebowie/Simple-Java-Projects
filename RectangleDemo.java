   public class RectangleDemo
   {
      public static void main(String[] args)
      {
         Rectangle myRect = new Rectangle();
         double theArea;
         double thePerimeter;
         myRect.setWidth(20);
      	myRect.setLength(15);
         theArea= myRect.area();
         thePerimeter=myRect.perimeter();
         System.out.println("My Rectangle has area"+theArea);
         System.out.println("My Rectangle has area"+thePerimeter);
         Rectangle myRect2 = new Rectangle(10,10);
      	thePerimeter=myRect2.perimeter();
      	theArea = myRect2.area();
      	System.out.println("this is the area of the new object"+theArea);
      	System.out.println("this is the perimeter of the new object"+ thePerimeter);
      }
   
   
   }//end of class rectangleDemo

    class Rectangle
   {
      private double width, length;
      Rectangle (){
   	}
      Rectangle(double len, double wid){
   		length =len;
   		width=wid;
   	}
   	
      public void setWidth(double w)
      {
      width = w;
       }
      public void setLength(double ln)
   	{
   	length = ln;
   	}
   	public double getWidth()
   	{
   	return width;
   	}
   	public double getLength()
   	{
   	return length;
   	}
   	public double area()
   	{
   	double a;
   	a = length*width;
   	return a;
   	}
   	public double perimeter()
   	{
   	double p ;
   	p=  (length*2)+(width*2);
   	return p;
   	}
   	
   
   
   }

//2.i had to remove the public from the  public class rectangle to get it to excutes, then it printed out a area of 0.0
//3. that the area is still going to be 0.0
//4n/a
//5.my prediction was correct
//6.n/a
//7. it display the length at 3.3 and the width at 2.0 and the area of it at 6.6
//8. n/a 
//9. the complier had a problem locationg the myRect.width and length

//task2
//1.n/a
//2. the area came out to be 125.0
//3. the perimeter that i got from the rectangle is 30
//4. the area i got was 300.0 and the perimeter i got is 35.0

//task3
//results put out another rectangle with different lengths and width

//task4 
