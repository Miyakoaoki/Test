   public class Testif
   {
   public static void main(String args [])
   {
   
   double rate;//存款利率
   double bouns=100.0;//本金
   double time;//存款时间
   if (time<1) 
          rate=0.0078; 
   else if(time>=1&&time<2)
          rate=0.0280;
   else rate=0.04;
   bouns=bouns+bouns*rate;
   }
   }