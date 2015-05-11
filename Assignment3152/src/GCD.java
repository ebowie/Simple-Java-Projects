import java.math.*;
import java.math.BigInteger;
public class GCD {

	public static void main(String[] args) {
		BigInteger c;
		int d;
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("5");
		a=a.pow(10);
		a= a.subtract(a.ONE);
		
		BigInteger b = new BigInteger("7");
		b =b.pow(20);
		b =b.subtract(b.ONE);
		
		
		
		
		c = a.gcd(b);
		System.out.println(c);
		a = new BigInteger("12345");
		b = new BigInteger("54321");
		c = a.gcd(b);
		System.out.println(c);
	}


}
