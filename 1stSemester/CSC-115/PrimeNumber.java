public class PrimeNumber 
{
     
     
     public static boolean isPrime (int num)
     {
     boolean prime = true;
     for (int divisor = 2; divisor <= num / 2; divisor++)
      {
       if (num % divisor == 0)
         { // If true, number is not prime
          
          return false;
         }  
     }
     
     return true;
     
     }
     
     public static void main(String[] args)
  {
     
     
     
     
     
       final int NUMBER_OF_PRIMES = 50; // Number of primes to display
       final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
       int count = 0; // Count the number of prime numbers
       int number = 2; // A number to be tested for primeness
   
       System.out.println("The first 50 prime numbers are \n");
   
      // Repeatedly find prime numbers
      while (count < NUMBER_OF_PRIMES)
       {
        // Assume the number is prime
        
  
        // Test whether number is prime
      
  
        // Display the prime number and increase the count
        if (isPrime(number)) {
          count++; // Increase the count
         
          if (count % NUMBER_OF_PRIMES_PER_LINE == 0) 
          {
            // Display the number and advance to the new line
            System.out.println(number);
          }
          else 
          {
            System.out.print(number + " ");
          }
        }
        // Check if the next number is prime
        number++;
      
  
     } 
  
  } 
  
  } 