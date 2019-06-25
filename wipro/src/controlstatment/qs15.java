package controlstatment;
import java.util.Scanner;
public class qs15 {
public static void main(String arg[])	
{
int n,sum;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number ");
n=in.nextInt();for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
 System.out.println("Sum of digits of a number is "+sum);               	  
}
}
