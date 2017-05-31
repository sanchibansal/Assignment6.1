import java.util.Arrays;
public class Reverse {
   public static void main(String[] args) {
      int[] arr = new int[10];
      int rev[]= new int[10];
      int prime = 2;
      for (int i = 0; i < 10; i++) {
         boolean primeFound = false;
         do {					//findind the prime numbers while primeFound is true usind do while loop
            int divisors = 0;
            for (int j = 2; j < prime - 1; j++) {
               if (prime % j == 0) {			
                  divisors++;
               }
            }
            if (divisors <= 1) {
               primeFound = true;
            } else {
               prime++;
            }
         } while (!primeFound);		//array with prime number is initialized
         arr[i] = prime;
         prime++;
      }
      System.out.println("array with prime numbers is: "+Arrays.toString(arr));
      int max=9;
      for(int i=0;i<10;i++){
    	   rev[max]=arr[i];		//reverse of the array is initialized
    	   max--;
    	    }
    	  System.out.println("reverse of the above array is: "+Arrays.toString(rev));
      
   
   }
   
}