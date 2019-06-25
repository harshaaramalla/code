package controlstatment;
import java.util.Scanner;
public class qs14
{
public static void main(String[] args)
{
int num;
Scanner in = new Scanner(System.in);
System.out.print("Enter the num value:");
num =in.nextInt();
int number = num;
if (number == 0 || number == 1) {
System.out.println(number + " is neither prime nor composite");
} 
else
{
if (isPrime(number))
System.out.println(number + " is a prime number");
else
System.out.println(number + " is not a prime number");
}
}
public static boolean isPrime(int num)
{
if (num < 0) num *= -1;
Boolean isPrime = true;
for (int i = 2; i < num/2+1; i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}
if (num == 0 || num == 1) isPrime = false;
return isPrime;
}
}