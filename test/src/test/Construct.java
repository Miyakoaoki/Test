package test;

class Pare 
{int i;
 Pare(){i=6;}
}
class Construct extends Pare
{ Construct(){}
  Construct(int num){}
  public static void main(String[] args){
    Construct ct = new Construct(9);
    System.out.println(ct.i);
  }
}