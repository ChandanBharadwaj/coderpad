package interview;

/*
 * Given two fraction passed in as int arrays {like 
 * int[] addFraction(int[] fraction1,int[]fraction2)}
 *  return the fraction which is result of adding the two input fractions
•	Fraction is represented as a two element array-[numerator,denominator]
•	The returned fraction has to be in its simplest form.
public static int[] addFraction(int[] fraction1,int[] fraction2)
{
              //Here we need to implement the solution
           return (new int[]{0,0});
}

*/
public class AddFractions {

	public static void main(String[] args) {

		int f1[] = { 4, 5 };
		int f2[] = { 4, 6 };
		addFraction(f1, f2);
	}

	public static int[] addFraction(int[] fraction1, int[] fraction2) {

		int den1 = fraction1[1],den2= fraction2[1];
		int num1 = fraction1[0], num2 = fraction2[0];
		 // Finding gcd of den1 and den2  
	    int den3 = gcd(den1,den2);  
	  
	    // Denominator of final fraction obtained  
	    // finding LCM of den1 and den2  
	    // LCM * GCD = a * b  
	    den3 = (den1*den2) / den3;  
	  
	    // Changing the fractions to have same denominator  
	    // Numerator of the final fraction obtained  
	    int num3 = (num1)*(den3/den1) + (num2)*(den3/den2);  
	  
	    // Calling function to convert final fraction  
	    // into it's simplest form  
	    lowest(den3,num3);  
		return (new int[] { 0, 0 });
	}

	// Function to return gcd of a and b
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static void lowest(int den3, int num3) {
		// Finding gcd of both terms
		int common_factor = gcd(num3, den3);

		// Converting both terms into simpler
		// terms by dividing them by common factor
		den3 = den3 / common_factor;
		num3 = num3 / common_factor;
		System.out.println(num3 + "/" + den3);
	}
}
