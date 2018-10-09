package three;

class Insect{
int i=9; //4
int j;
Insect(){ //5
prt("i="+i+",j="+j);
j=39;
}
static int x1=prt("static Insect.x1.initialization"); //1
static int prt(String s){
System.out.println(s);
return 47;
}
}
public class Beetle extends Insect{
int k=prt("Beetle.k initialized"); //6
Beetle(){ //7
prt("k="+k);
prt("j="+j);
}
static int x2=prt("static Beetle.x2 initialized"); //2
static int prt(String s){
System.out.println(s);
return 63;
}
public static void main(String [] args)
{
prt("Beetle constructor");//3
Beetle b=new Beetle();
}
}