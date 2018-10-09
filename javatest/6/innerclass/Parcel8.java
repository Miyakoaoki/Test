public class Parcel8{
	public Destination dest(final String x){
		return new Destination(){
			private String label=x;
			public String readLabel(){ return label;}
			
		};
	}
	public static void main(String [] args){
		Parcel8 p=new Parcel8();
		Destination d=p.dest("fsdfs");
		System.out.println(d.readLabel());
	}
}