class Insect{
	int i=9; //1
	int j;
	Insect(){   //2
		prt("i="+i+",j="+j);
		j=39;
	}
	static int x1=prt("static Insect.x1.initialization"); //3
	static int prt(String s){
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect{
	int k=prt("Beetle.k initialized"); //4
	Beetle(){   //5
		prt("k="+k);
		prt("j="+j);
	}
	static int x2=prt("static Beetle.x2 initialized"); //6
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