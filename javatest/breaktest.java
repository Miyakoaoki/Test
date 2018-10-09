public class breaktest
{
	public static void main(String args[])
	 {
	 
	 //	int i=0;
	//	while(i<=10)
	//	{  i++;
	//	   if(i==5)break;
	//	 }
	//	System.out.println(i);
	
		for(int i=0;i<=3;i++)
		{  for(int j=0;j<=i;j++)
		   {   System.out.print('A');
		        if(j==0)break;
		   }
		    System.out.print('B');
		 }	
	 	}	
	}