import java.util.Scanner;


public class Pi{

    public static void main(String [] args ){

	int number;

	int odd=1;

	double pi=0.0;
	
	Scanner input= new Scanner(System.in);	
	
        System.out.printf("%s\n","Compute to how many terms of the series?");
	
	number= input.nextInt();

	System.out.printf("%s%16s\n", "terms", " PI approximation");

	for(int i=1; i<=number; ++i){

	    double current=0.0;

	    if(i%2==0){
		current= (double)-4/odd;
	    }
	    else{
		current= (double)4/odd;
	    }
	    odd=odd+ 2;
            pi= pi+current;
	    
	    System.out.printf("%d%10.6f\n",i, pi);  
	}


    }

}
