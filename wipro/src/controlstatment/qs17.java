package controlstatment;
public class qs17 {
public static void main(String args[])
{
int num=123456789;
int reversenum =0;
 while( num != 0 )
{
reversenum = reversenum * 10;
reversenum = reversenum + num%10;
num = num/10;
}
System.out.println("Reverse of  number is: "+reversenum);
}
}