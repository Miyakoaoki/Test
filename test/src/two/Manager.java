package two;

public class Manager extends Employee{
	final String vehicle = "car";
	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee e = new Employee(20);
		System.out.println(e.getAge());
		e = new Employee(21,"��");
		System.out.println(e.getAge()+","+e.getSex());
		e = new Employee(22,"Ů","С��");
		System.out.println(e.getAge()+","+e.getSex()+","+e.getName());
	}
}
