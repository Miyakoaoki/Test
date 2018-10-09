package two;

public class Manager extends Employee{
	final String vehicle = "car";
	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee e = new Employee(20);
		System.out.println(e.getAge());
		e = new Employee(21,"ÄÐ");
		System.out.println(e.getAge()+","+e.getSex());
		e = new Employee(22,"Å®","Ð¡ºì");
		System.out.println(e.getAge()+","+e.getSex()+","+e.getName());
	}
}
