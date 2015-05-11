
public class matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{824,-65,-814,-741,-979,-764},{216,663,880,916,617,-535},{597,-245,79,747,477,-535},{-906,-905,-266,-8,765,448},{-348,470,-608,-686,702,-61},{-49,-433,966,902,-942,712}};
		int [][] b = {{761,-892,-564,-826,251,-414},{-44,-214,235,-781,421,-370},{881,444,360,932,700,725},{-750,-637,-915,192,617,41},{509,-167,127,628,-51,837},{-28,57,-13,-436,-720,22}};
		
		int [] [] c = new int[6][6];
		int [] [] d = new int[6][6];
		
		
		for(int i =0; i<6;i++){
			for(int j=0;j<6;j++){
				
				c[i][j] = a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
				
				if(j >= 5){
					System.out.println("\n");
				}
			}
			
		}
	
		for(int x=0; x<6;x++){
			for(int y=0;y<6;y++){
				for(int z =0; z<6;z++){
				d[x][y] += a[x][z]*b[z][y];
				}
			}
			
			
		}
		for(int i =0; i<6;i++){
			for(int j=0;j<6;j++){
				
				System.out.print(d[i][j]+ " ");
				if( j>=5)
				{
					System.out.println("\n");
				}
				
			}
		}
	}

}
