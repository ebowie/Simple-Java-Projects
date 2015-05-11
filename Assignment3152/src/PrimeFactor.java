import java.math.BigInteger;
import java.util.LinkedList;
public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BigInteger a = new BigInteger("4656612873077392578118");
		BigInteger b = new BigInteger("12");
		LinkedList c = new LinkedList(tdFactors(a));
		LinkedList d = new LinkedList(tdFactors(b));
		System.out.println(c+"  "+d);
		
		
		
	}
	/*
	static BigInteger sqrt(BigInteger n) {
		  BigInteger a = BigInteger.ONE;
		  BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		  while(b.compareTo(a) >= 0) {
		    BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
		    if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
		    else a = mid.add(BigInteger.ONE);
		  }
		  return a.subtract(BigInteger.ONE);
		}
	*/
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


	
	
	
	
	
	
