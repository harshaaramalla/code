package controlstatment;

public class qs13 {

	public static void main (String[] args)
	   {		
	       int i =10;
	       int num =0;
	       
	       String  primenumbers = "";

	       for (i = 10; i <= 99; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		count = count + 1;
		     }
		  }
		  if (count ==2)
		  {
		    
		     primenumbers = primenumbers + i + "\t";
		  }	
	       }	
	       System.out.println("Prime numbers from 10 to 99 are :");
	       System.out.println(primenumbers);
	   }
	}