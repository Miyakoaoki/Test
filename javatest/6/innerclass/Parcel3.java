abstract class Contents{
	abstract public int value();
}
interface Destinations{
	String readLabel();
}

public class Parcel3{
	private class PContents extends Contents{
		private int i=11;
		public int value(){return i;}	
	}
	protected class PDestination implements Destinations{
		private String label;
		private PDestination(String whereto){label=whereto;}
		public String readLabel(){return label;	}
	}
	public Destinations dest(String s){return new PDestination(s);}		
    public Contents cont(){return new PContents();}	
    
}
	class Test{
		public static void main(String [] args){
			Parcel3 p=new Parcel3();
			Contents c=p.cont();
			Destinations d=p.dest("fdsf");
			System.out.println(c.value());	
			System.out.println(d.readLabel());	
		}
	}
