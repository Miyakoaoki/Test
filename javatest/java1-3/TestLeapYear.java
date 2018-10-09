public class TestLeapYear
{
	public static void isLeapYear(int year)
	{
	  boolean n1=(year%4==0);
	  boolean n2=(year%100==0);
	  boolean n3=(year%400==0);
	  if((n1==true&&n2!=true)||(n2==true&&n3==true))
	  {
	  	 System.out.println(year+"  is leap year");
	  	} 
	   else
	   {
	   	 System.out.println(year+"  is not leap year");
	   	}
	}
	
	public static void main(String args [])
	{
		isLeapYear(1900);
		isLeapYear(1904);
		isLeapYear(2000);
		}
	
	}