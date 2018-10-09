/*
 *
 **/
public class PrintSpecialArray{
public static void main (String args[]){
         final int  num=8; //
	int[][] t= new int[2*num+1][2*num+1];
          //¸³Öµ 
	  for (int i=0;i<=num;i++)
	  {
		  for (int j=0;j<=num; j++)
		  {
			  if(i<j) t[i][j]= num - i;
			  else    t[i][j]= num - j;
			  t[i][2*num-j] = t[i][j];
			  t[2*num-i][j] = t[i][j];
			  t[2*num-i][2*num-j] =t[i][j];
		  }
	  }
      //´òÓ¡ 
	  for (int i=0;i<2*num+1;i++)
	  {
		  for (int j=0;j<2*num+1; j++ )
		  {
		    System.out.print(t[i][j]);
		  }
		  System.out.println("");
	  }
	}
}
