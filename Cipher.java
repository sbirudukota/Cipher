/*Sravani Birudukota
 Programming fundamentals
Summer
Programming Assignment 1
*/
import java.util.*; // import all class,methods,packages..
public class Cipher{

   public static void main(String[] args){
	   
      Random rand = new Random();   //create a random object for key
      int [] data = new int[5];    //scanning numbers using arrays and scanner
      try (Scanner sc = new Scanner(System.in)) {    //create scanner object 
	      
		  int key = rand.nextInt(9) + 1;
	      
		  System.out.println("CPSC 501");
		  System.out.println("NAME: Sravani Birudukota");
		  System.out.println("PROGRAMMING ASSIGNMENT 1");
		  System.out.println("Welcome to the Cipher program");
	      
		  System.out.println("Please enetr 5 numbers beween 0 and 19"); // user input 
		  System.out.print("1st number: ");
		  data[0] = sc.nextInt();
	      
		  System.out.print("2nd number: ");
		  data[1] = sc.nextInt();
	      
		  System.out.print("3rd number: ");
		  data[2] = sc.nextInt();
	      
		  System.out.print("4th number: ");
		  data[3] = sc.nextInt();
	      
		  System.out.print("5th number: ");
		  data[4] = sc.nextInt();
	      
		  int sum = 0;
		  for (int i = 0; i<5; i++){
		      if (data[i] < 0 || data[i] > 19){
		         System.out.println("Please read instructions and try again");
		         System.exit(1);     //terminate the program
		      }
		      sum = sum + data[i];   //Sum & store numbers in a variable
		  }
	      
		  System.out.println("Total = " + sum);
	      
		  System.out.println("Your random key is " + key);
	      
		  if (sum < 10){ 
		      int a = (sum + key) % 10;
		      a = key * 10 + a;
		      System.out.println("Your encoded number is " + a);
		  }
		  else {
			  
		      //separating the numbers
		      int a = sum / 10;
		      int b = sum % 10;
			  
		      //encoding
		      a = (key + a) % 10;
		      b = (key + b) % 10;
		      a = a * 10 + b;
			  
		      //Display the encoded number to the user.
		      System.out.println("Your encoded number is " + a);
		  }
	}
    
   }
}

