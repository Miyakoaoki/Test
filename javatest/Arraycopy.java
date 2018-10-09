public class Arraycopy
{
     public static void main(String args[])
     {
     	   int[] from = {2, 3, 5, 7, 11, 13};
           int[] to = {101, 102, 103, 104, 105, 106, 107};
           System.arraycopy(from, 2, to, 3, 3);
       
           for (int i = 0; i < to.length; i++)
                System.out.println(i + ": " + to[i]);
	
	   }
	}


