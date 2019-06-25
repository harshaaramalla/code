package controlstatment;
public class qs5 
{
public static void main(String[] args)
{
char ch = 's';
if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) 
{
	System.out.println("alphabet");
} 
else if (ch >= 48 && ch <= 57)
{
	System.out.println("digit");
} else  
{
	System.out.println("special character");
}
}
}