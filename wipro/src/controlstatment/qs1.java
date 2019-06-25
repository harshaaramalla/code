package controlstatment;
import java.util.*;
public class qs1
{
public static void main(String[] args)
{
int n;
Scanner in = new Scanner(System.in);
System.out.print("Enter the n value:");
n =in.nextInt();
if(n > 0)
{
System.out.println("The given number "+n+" is Positive");
 }
else if(n < 0)
 {
 System.out.println("The given number "+n+" is Negative");
 }
else
{
 System.out.println("The given number "+n+" is  0 ");
}
}
}
