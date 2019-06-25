package controlstatment;
import java.util.Scanner;
public class qs16 {
public static void main(String[] args)
{
int n;
Scanner in = new Scanner(System.in);
System.out.print("Enter the n value:");
n =in.nextInt();
for (int i = 0; i < n; i++)
{
for (int j = 0; j <= i; j++)
{
System.out.print("*");
}
System.out.println();
}
}
}