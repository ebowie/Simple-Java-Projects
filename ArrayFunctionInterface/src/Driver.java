import java.util.Random;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double [] arrayValues = {5,45,36,20,18,12,2,21,48,7};
           double [] arrayValues2 = {5,45,36,20,18,12,2,21,48,7};
         ArrayFunction myArray = new ArrayFunction();
         
         
         System.out.println("PrintMe Method");
         	myArray.printMe(arrayValues);
         	 System.out.println("\n");
         System.out.println("SortMe Method");
	         double [] array = myArray.sortMe(arrayValues2);
	         for(int i=0; i<array.length; i++){
	         	System.out.print(array[i]+" ");
	         }
	         System.out.println("\n");
	         
         System.out.println("getMax Method");
         	System.out.print(myArray.getMax(arrayValues)+" ");
         	System.out.println("\n");
         	
         System.out.println("getMin Method");
         	System.out.print(myArray.getMin(arrayValues)+" ");
         	System.out.println("\n");
         	
         System.out.println("WhereAmI Method");
         	System.out.println(myArray.whereAmI(arrayValues, 12));
         	System.out.println(myArray.whereAmI(arrayValues, 8));
         	System.out.println("\n");
         	
         System.out.println("ReverseMe Method");
	         double [] array2 = myArray.reverseMe(arrayValues);
	         for(int i=0; i<array.length; i++){
	         	System.out.print(array2[i]+" ");
	         }
	         System.out.println("\n");
	         
         System.out.println("SumMeUp Method");
         	System.out.println(myArray.sumMeUp(arrayValues));
         	System.out.println("\n");
         	
         System.out.println("DoubleMySize Method");
	         double [] array3 = myArray.doubleMySize(arrayValues);
	         for(int i=0; i<array3.length; i++){
	         	System.out.print(array3[i]+" ");
	         }
	         System.out.println("\n");
         
      
           
       
           
	}

}
