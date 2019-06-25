package controlstatment;
public class qs18
{
public static void main(String[] args)
{
int num = 121, rev = 0, remainder, original;
original = num;
while( num != 0 )
{
remainder = num % 10;
rev = rev* 10 + remainder;
num  /= 10;
}
if (original == rev)
System.out.println(original + " is a palindrome.");
 else
System.out.println(original + " is not a palindrome.");
    }
}