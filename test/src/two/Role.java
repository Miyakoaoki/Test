package two;

public abstract class Role {
	private String name;
	private int age;
	private String sex;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public abstract void paly();
	
	Role(){
		this.age = 20;
	}
	
	Role(int age){
		this.age = age;
	}
	
	Role(int age,String sex){
		this(age);
		this.sex = sex;
	}
	
	Role(int age,String sex,String name){
		this(age,sex);
		this.name = name;
	}
}
