package controlstatment;
public class qs7
{
	public static void main(String[] args) {
		char c = 'a';
		
		if (Character.isLowerCase(c)) 
			System.out.println(c + "=>" + Character.toUpperCase(c));
		else
			System.out.println(c + "=>" + Character.toLowerCase(c));

	}

}
