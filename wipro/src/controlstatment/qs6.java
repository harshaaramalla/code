package controlstatment;
public class qs6
{
public static void main(String[] args)
{
String gender = args[0];
int age = Integer.parseInt(args[1]);
if (gender.equals("Female") && (age >= 1 && age <= 58))
{
	System.out.println("Interest == 8.2%");
}
else if (gender.equals("Female") && (age >= 59 && age <= 120))
{
	System.out.println("Interest == 7.6%");
} 
else if (gender.equals("Male") && (age >= 1 && age <= 60)) 
{
	System.out.println("Interest == 9.2%");
}
else if (gender.equals("Male") && (age >= 61 && age <= 120))
{
	System.out.println("Interest == 8.3%");
}

}

}
	

