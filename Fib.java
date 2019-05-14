/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n <= 2) // decision
			return 1; // base case solution
		// recursive case solution
		return fib_recurrence(n - 1) // recursive abstraction
			   + // combining operator
			   fib_recurrence(n - 2); // (no leftover)
    }
     /* These are class methods because...
		they do not rely on any attributes of 
		a single instance of a class.
    */

    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        if (n == 1)
			return 1;
		int current = 1;
		int previous = 1;
		for (int i = 2; i < n; i++) {
			int temp = current;
			current += previous;
			previous = temp;
		}
		return current;
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count 
	   the # of loops
       
       Then cost of the the recurrence algorithm
       grows linearly as the size of the problem increases,
       because for ever additional element, another
	   loop of computations is required.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
		double psi = (1 - Math.sqrt(5)) / 2;
		return (Math.pow(phi, n) + Math.pow(psi, n)) / Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count 
	   the # of calls to Math.pow(phi, n)
       
       Then cost of the the recurrence algorithm
       grows constantly as the size of the problem increases,
       because the same calculations are run the same amount
	   of times for all values of n.
     */
}
