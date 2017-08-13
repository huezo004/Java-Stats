import java.util.Scanner;
import java.util.Random;

public class DiceStats{

    public static void main(String[] args){

	int dice;

        int rolls;

	Scanner input= new Scanner(System.in); 

	System.out.print("How many dice will constitute one roll?");

	dice= input.nextInt();

	System.out.print("How many rolls?");

	rolls=input.nextInt(); 

	int frequency[]= new int [(6*dice)+1]; // array size 
		
	for(int i=0; i<rolls; ++i)
	   ++frequency[sum(dice)]; 
    

    System.out.printf("%s%11s%10s\n", "Sum", " #of times", " Percentage");
	
	       
  for( int y= dice; y<frequency.length; ++y)
      System.out.printf("%2d%8d%10.2f%s \n",y,frequency[y],((float)frequency[y]/(float)rolls)*100.0, "%"); 
	   
    }

    public static int sum(int diceNumber){
	int num=0;
	Random randomNum= new Random(); 
	for(int i=0; i<diceNumber; ++i)
	    num += randomNum.nextInt(7);     
	return num; 
    }
}
