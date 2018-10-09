import java.io.*;
public class Student implements Serializable{
	int id;          // 学号
 	String name;      // 姓名
	String department; // 系别
	public Student(int id,String name,String department){
		this.id = id;
		this.name = name;
		this.department = department;
	}
                 public void display(){
		System.out.print(id+"\t");
		System.out.print(name+"\t");
		System.out.print(department);
                                  System.out.println();
	}
	public static void main(String[] args)throws Exception{
		Student stu=new Student(030102,"Liu Ming", "JSJ");
		FileOutputStream fo=new FileOutputStream("data.txt");// 保存对象的状态
		ObjectOutputStream so=new ObjectOutputStream(fo);
		so.writeObject(stu);
		so.close();

		FileInputStream fi=new FileInputStream("data.txt");
		ObjectInputStream si=new ObjectInputStream(fi);//恢复对象的状态
                                  try{
		while((stu=(Student)si.readObject())!=null)
                                           stu.display();
                                  }catch(EOFException e){
                                        System.out.println("已到文件尾");
                                  }
		si.close();
	}
}
