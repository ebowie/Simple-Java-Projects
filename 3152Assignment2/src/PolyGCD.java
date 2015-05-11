import java.util.ArrayList;
import java.util.Scanner;


public class PolyGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] polyB = {0,0,0,0,-448,336,-148,55,-460,337,-148,55,-12,1 }; 
		int [] polyA = {0,0,-448,336,-148,55,-12,1,0,0,0,448,-336,148,-55,-436,335,-148,55,-12,1};
		int [] polyC = {0,0,2,3,4,5,6,7,0,0,0,11,12,13,14,15,16,17,18,19,20};
		int [] polyD = {0,0,0,0,4,5,6,7,8,9,10,11,12,13};
		int temp = 0;
		int temp2 = 0;
		int x = polyD.length-1;
		int y = polyC.length-1;
		
		ArrayList one = new ArrayList();
		ArrayList two = new ArrayList();
		ArrayList three = new ArrayList();
		ArrayList four = new ArrayList();
		
		temp = polyA.length-polyB.length;
		
		
	
		while(polyD[x] != 0)
		{
			if((polyD[x]+temp)== polyC[y]){
				 
				temp2 = polyA[y]-polyB[x];
				if(temp2 != 0){
					one.add(temp2);
					two.add(polyC[y]);
				}
				
			}
			
			
			y--;
			x--;
		}
		
		
		while(y>1){
			
			three.add(polyA[y]);
			four.add(polyC[y]);
			y--;
			
			
			
			
		}
		
		
		String results = " ";
		String plus = "+";
		for(int k=0;k<three.size();k++){
			
			
			if(!(three.get(k).equals(0)))
			{
				
			results += three.get(k)+"x^"+four.get(k)+" ";
			
			if(k<8)
			{
				results +=plus+" ";
			}
		
			}
		
			
			

		}
		
		System.out.print(results);
		
		
		
		
	}
	

}
