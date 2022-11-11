/*
This program prompts the user to enter their name and age and then prints out 
number of characters in their name and whether their age is odd or even number
 */
import java.util.Scanner;
public class Main
{
    static int num;
  public static void main(String[] args) 
  {    
        // prompts the user to enter their details
        Scanner reader = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);    
        int count = 0,i=0;    
        System.out.println("Please Enter your sir name =  ");
		String str = sc.nextLine();
		//while loop to calculate the total characters in the string
		while(i < str.length())
		{
			if(str.charAt(i) != ' ') 
			{
				count++;
			}
			i++;
		}		
        //displays the total numbers of characters in the sir name.
		System.out.println("\nThe Total Number of Characters  =  " + count);
        
        System.out.println("Enter your age: ");
        int num = reader.nextInt();
//prints wheather the age is odd or even number.
        if(num % 2 == 0)
            System.out.println(" Your current age is even number");
        else
            System.out.println( " Your current age is odd number");
            // end of program
    }      
}