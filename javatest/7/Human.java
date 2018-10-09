class Annoyance extends Exception{}
class Sneeze extends Annoyance{}
public class Human{
	public static void main(String [] args)
	{
		try{
			 throw new Sneeze();
			
			}
			catch(Exception a){
				System.out.println("caught Annoyance");				
			}
		//	catch(Sneeze b){
		//		System.out.println("caught Sneeze");				
		//	}
		
		}
}