import java.util.*;
public class GetCurrentTime{
   public static void main(String[] args){
      Calendar cd = Calendar.getInstance();
      Date d  = cd.getTime();
      System.out.println(d.toString());
   }
} 
