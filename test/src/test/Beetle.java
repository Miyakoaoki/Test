package test;

class Insect{
	int i=9; //3
	int j;
	Insect(){   //4
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
	int k=prt("Beetle.k initialized"); //5
	Beetle(){   //6
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
		prt("Beetle constructor");
		Beetle b=new Beetle();
	}
}
