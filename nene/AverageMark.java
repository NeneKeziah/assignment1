/*The program ask the student to enter the marks for five units and compute the average and display it on the screen
 */
import java.util.Scanner;
 
public class AverageMark  {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   //user enters mark for java
  System.out.print("input mark for java: ");
  float  num1 = in.nextInt();
   //user enters marks for Application programming
  System.out.print("input mark for App programming:");
  float num2 = in.nextInt();
   // user enters mark for HCI
  System.out.print("Iinput mark for HCI :");
  float num3 = in.nextInt();
   //user  enters mark for networking
  System.out.print("input mark for Networking:");
  float num4 = in.nextInt();
  // user enters mark for structured cabling
  System.out.print("input mark for structured cabling:");
  int num5 = in.nextInt();
   
   //calculates the average marks and outputs
  System.out.println("Your average marks is:" + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}
