   public class Testif
   {
   public static void main(String args [])
   {
   
   double rate;//�������
   double bouns=100.0;//����
   double time;//���ʱ��
   if (time<1) 
          rate=0.0078; 
   else if(time>=1&&time<2)
          rate=0.0280;
   else rate=0.04;
   bouns=bouns+bouns*rate;
   }
   }