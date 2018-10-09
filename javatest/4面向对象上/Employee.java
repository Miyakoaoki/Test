class Employee
{     
   private int id;
   private static int nextId = 1;
   public void setId()
  {   id = nextId;
      nextId++;
   }
   
   public static void main(String [] args)
   {
   	     Employee Alice=new Employee();
         Alice.setId();
         System.out.println("Alice id="+Alice.id);
         System.out.println("Alice nextId="+Alice.nextId);
        
         Employee   Bob=new Employee();
         Bob.setId();
         System.out.println("Bob id="+Bob.id);
         System.out.println("Bob nextId="+Bob.nextId);

   }
   
   
}
