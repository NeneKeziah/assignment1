/* 
This program displays all multiples of 2,3 and 7
within the range of 71 to 150
*/
import java.util.Scanner;
public class multiple {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        // Multiples of 2 within the range of 71 to 150 
        System.out.println("\nMultiples of 2 within the range of 71 to 150 are:");
    //if statement and for loop to calculate the multiples of the given number
for (int num=71; num<=150; num++){
    if(num%2==0)
    System.out.println("num"+num);
}
System.out.println("\nMultiples of 3 within the range of 71 to 150 are:");
for (int num=71; num<=150; num++){
    if(num%3==0)
    System.out.println("num"+num);
}
System.out.println("\nMultiples of 7 within the range of 71 to 150 are:");
for (int num=71; num<=150; num++){
    if(num%7==0)
    System.out.println("num"+num);
}
       
    }
}
