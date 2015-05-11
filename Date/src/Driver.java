
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(1991,6,5);
		Date newDate;
		
		
		//This tests both version long date and short date;
		date.getDate('s');
		
		System.out.println("short version: "+date.toString());
		
		date.getDate('i');
		System.out.println("long version: "+date.toString()+"\n\n");
		//this tests Julian day method
		System.out.println(date.toString() +"is day "+date.julianDays());
		
		//This tests the add method
		date = date.add(1000);
		
		date.getDate('s');
		
		System.out.println("short version: "+date.toString());
		
		date.getDate('i');
		System.out.println("long version: "+date.toString()+"\n\n");
		
		
		//This tests the subtract method
		date = date.subtract(1000);
		
		date.getDate('s');
		
		System.out.println("short version: "+date.toString());
		
		date.getDate('i');
		System.out.println("long version: "+date.toString()+"\n\n");
		
		
		//This tests leap year
		date = date.subtract(1000);
		
		date.getDate('s');
		
		System.out.println("short version: "+date.toString());
		
		date.getDate('i');
		System.out.println("long version: "+date.toString()+"\n\n");
		
		
		// This tests the daysbetween method
		newDate = new Date(1988,3,30);
		
		date.getDate('s');
		newDate.getDate('s');
		
		System.out.println("old short version: "+date.toString());
		System.out.println("new short version: "+newDate.toString()+"\n\n");
		
		date.getDate('i');
		newDate.getDate('i');
		
		System.out.println("old long version: "+date.toString());
		System.out.println("new long version: "+newDate.toString()+"\n\n");
		System.out.println(date.daysBetween(newDate)+" Days between each other\n\n");
		
		// another tests for daysbetween
		newDate = new Date(1900,5,3);
		date.getDate('s');
		newDate.getDate('s');
		
		System.out.println("old short version: "+date.toString());
		System.out.println("new short version: "+newDate.toString()+"\n\n");
		System.out.println(date.daysBetween(newDate)+" Days between each other\n\n");
		
		// testing bad data 
		newDate = new Date(-1900, 5,3);
		newDate.getDate('s');
		
		System.out.println("short version: "+newDate.toString()+"\n\n");
		
		newDate = new Date(1900, -5,3);
		newDate.getDate('s');
		
		System.out.println("short version: "+newDate.toString()+"\n\n");
		
		newDate = new Date(1900, 5,-3);
		newDate.getDate('s');
		
		System.out.println("short version: "+newDate.toString()+"\n\n");
		
		newDate = new Date(1900, 15,3);
		newDate.getDate('s');
		
		System.out.println("short version: "+newDate.toString()+"\n\n");
		
		newDate = new Date(1900, 5,34);
		newDate.getDate('s');
		
		System.out.println("short version: "+newDate.toString()+"\n\n");

		
	}

}
