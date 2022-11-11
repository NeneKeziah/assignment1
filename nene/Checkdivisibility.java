/*
The program will check for divisibility test of integers 
*/
import java.util.Scanner;
public class Checkdivisibility{
    public static void main(String[]args){
        
int num,one=1, two=2,three=3,four=4,five=5,six=6,seven=7,eight=8,nine=9;
Scanner s=new Scanner(System.in);
//divisibility test  for 1
System.out.println("divisibility test for 1");
System.out.println("Enter any number");
num=s.nextInt();
if (num%one==0){
    System.out.println("Any number divided by 1 will give the number itself");
    
}


//divisibility test for  2
System.out.println("divisibility test for 2");
System.out.println("Enter any number");
num=s.nextInt();
if (num%two==0){
    System.out.println("The number is divisible by 2");
    
}
else {
    System.out.println("The number is not divisible by 2");
}
//divisibility test  for 3
System.out.println("divisibility test for 3");
System.out.println("Enter any number");
num=s.nextInt();
if (num%three==0){
    System.out.println("The number is divisible by 3");
    
}
else {
    System.out.println("The number is not divisible by 3");
}


//divisibility test  for 4
System.out.println("divisibility test for 4");
System.out.println("Enter any number");
num=s.nextInt();
if (num%four==0){
    System.out.println("The number is divisible by 4");
    
}
else {
    System.out.println("The number is not divisible by 4");
}

//divisibility test  for 5
System.out.println("divisibility test for 5");
System.out.println("Enter any number");
num=s.nextInt();
if (num%five==0){
    System.out.println("The number is divisible by 5");
    
}
else {
    System.out.println("The number is not divisible by 5");
}

//divisibility test  for 6
System.out.println("divisibility test for 6");
System.out.println("Enter any number");
num=s.nextInt();
if (num%six==0){
    System.out.println("The number is divisible by 6");
    
}
else {
    System.out.println("The number is not divisible by 6");
}

//divisibility test  for 7
System.out.println("divisibility test for 7");
System.out.println("Enter any number");
num=s.nextInt();
if (num%seven==0){
    System.out.println("The number is divisible by 7");
    
}
else {
    System.out.println("The number is not divisible by 7");
}

//divisibility test  for 8
System.out.println("divisibility test for 8");
System.out.println("Enter any number");
num=s.nextInt();
if (num%eight==0){
    System.out.println("The number is divisible by 8");
    
}
else {
    System.out.println("The number is not divisible by 8");
}

//divisibility test  for 9
System.out.println("divisibility test for 9");
System.out.println("Enter any number");
num=s.nextInt();
if (num%nine==0){
    System.out.println("The number is divisible by 9");
    
}
else {
    System.out.println("The number is not divisible by 9");
}






    }
}