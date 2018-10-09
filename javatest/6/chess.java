class Game{
	Game(int i){
		System.out.println("game constructor");
	}
}
class BoardGame extends Game{
	BoardGame(int i){
		super(i);
	
		System.out.println("BoardGame constructor");
	}
}
public class chess extends BoardGame{
	chess(){
		super(11);
		System.out.println("chess constructor");
		
	}
	
	public static void main(String [] args ){
		chess a=new chess();
	
	}
	
}
