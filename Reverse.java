import java.util.Scanner;


public class Reverse{

    public static void main(String[] args){

	Scanner input= new Scanner(System.in);
	
	long nm;

      	long result; 

	do{

	    System.out.print("Please enter a long integer (0 to quit):");

	    nm= input.nextLong();

	    if(nm==0){

	    System.out.println("Goodbye!");

	    System.exit(0);
	    }
	    
	    result=reverseDigits(nm);

	    System.out.printf("%s%d\n", "The number reversed is:", result); 
	    
        }while(nm !=  0); 
    
        	    	
    }

  public static long reverseDigits(long n){

      long a=0;
    
      while(n!=0){

	  a= a*10; 

	  a= a+ n%10;

	  n=n/10; 
	}
	        
      return a;

  }
       
}
