package two;

public class Employee extends Role{
	private double salary;
	static final int ID = 123;
	
	Employee(){}
	
	Employee(int age){
		super(age);
	}
	
	Employee(int age,String sex){
		super(age,sex);
	}
	
	Employee(int age,String sex,String name){
		super(age,sex,name);
	}
	
	@Override
	public void paly() {
		// TODO Auto-generated method stub
		
	}
	final void sing() {
		
	}

}
