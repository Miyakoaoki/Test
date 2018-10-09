public class continuelabtest
{
	public static void main(String args[])
	{
		lab:
		for(int i=0;i<=3;i++)
		{  
		   for(int j=0;j<=i;j++)
		   {   
		        System.out.print('A');
		        if(j==0) continue lab;
		   }
		    System.out.print('B');
		 }
		
		  System.out.print('C');

		}
	
	}