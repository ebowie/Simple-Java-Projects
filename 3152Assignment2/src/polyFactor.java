import java.math.BigInteger;
import java.util.LinkedList;


public class polyFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] poly = {"0","0","448","336","148","55","12","1","0","0","0","448","336","148","55","436","335","148","55","12","1"};
		String[] poly2 = {"0","0","x","x","x","x","x","x","0","0","0","x","x","x","x","x","x","x","x","x","x"};
		String[] poly3 = {"-","+","-","+","-","-","+","-","+","+","-","+","-","+","-"};		
		String results = " ";
		int count =0;
		for(int k = poly.length-1;k>0;k--){
			
			if(!poly[k].equals("0") && !poly2.equals("0")){
				if(!poly[k].equals("1")){
					
					BigInteger a = new BigInteger(poly[k]);
					LinkedList c = new LinkedList(tdFactors(a));
					results += c;
				}
				if(poly2[k].equals("x")){
					for(int x = 0; x<k;x++){
						results += "x"+" ";
					}
				}
				if(count < 14){
					results += poly3[count]+" ";
					count++;
				}
				
			}
			
			
		}
		System.out.println(results);
	}
	public static LinkedList tdFactors(BigInteger n)
	{
	    BigInteger two = BigInteger.valueOf(2);
	    LinkedList fs = new LinkedList();

	    if (n.compareTo(two) < 0)
	    {
	        throw new IllegalArgumentException("must be greater than one");
	    }

	    while (n.mod(two).equals(BigInteger.ZERO))
	    {
	        fs.add(two);
	        n = n.divide(two);
	    }

	    if (n.compareTo(BigInteger.ONE) > 0)
	    {
	        BigInteger f = BigInteger.valueOf(3);
	        while (f.multiply(f).compareTo(n) <= 0)
	        {
	            if (n.mod(f).equals(BigInteger.ZERO))
	            {
	                fs.add(f);
	                n = n.divide(f);
	            }
	            else
	            {
	                f = f.add(two);
	            }
	        }
	        fs.add(n);
	    }

	    return fs;
	}


}
