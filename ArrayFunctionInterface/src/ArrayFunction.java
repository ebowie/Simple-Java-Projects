import java.util.Random;


public class ArrayFunction implements ArrayFunctionInterface {

	@Override
	public double[] sortMe(double[] array) {
		// TODO Auto-generated method stub
		
		double temp = 0;
		for(int i =0; i<array.length; i++){
			
			for(int j =0; j<array.length; j++){
				if(array[i] < array[j]){
				temp = array[i];
				
				array[i] = array[j];
				
				array[j] = temp;
				}
			}
		}
		
		
		return array;
	}

	@Override
	public double getMax(double[] array) {
		// TODO Auto-generated method stub
		double temp = array[0];
		for(int i = 0; i <array.length; i++){
			if(array[i] > temp){
				temp = array[i];
			}
			
			
		}
		
		
		return temp;
	}

	@Override
	public double getMin(double[] array) {
		// TODO Auto-generated method stub
		double temp = array[0];
		for(int i = 0; i <array.length; i++){
			if(array[i] < temp){
				temp = array[i];
			}
			
			
		}
		
		return temp;
	}

	@Override
	public int whereAmI(double[] array, double searchValue) {
		// TODO Auto-generated method stub
		
		int temp = -1;
		for(int i = 0; i <array.length; i++){
			if(array[i] == searchValue){
				temp = i;
			}
			
			
			
		}
		
		
		return temp;
	}

	@Override
	public double sumMeUp(double[] array) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 0; i<array.length; i++){
			sum += array[i];
		}
		return sum;
	}

	@Override
	public double[] reverseMe(double[] array) {
		// TODO Auto-generated method stub
		double [] array2 = new double[array.length];
		int j =0;
		for(int i = array.length-1; i>=0; i--){
			array2[j] = array[i];
			j++;
		}
		
		
		
		return array2;
	}

	@Override
	public void printMe(double[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
		
	}

	@Override
	public double[] doubleMySize(double[] array) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		double [] array2 = new double[array.length*2];
		  
			for(int i = 0; i<array2.length; i++){
				if(i<array.length){
					array2[i] = array[i];
					
				}
				else{
					array2[i] = rand.nextInt(50)+1;
				}
				
				
			}
		
		
		return array2;
	}

	
}
