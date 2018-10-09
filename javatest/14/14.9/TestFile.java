import java.io.*;
public class TestFile{
    public static void main(String[] args)throws IOException{
         FileOutputStream fos=new FileOutputStream("Student.dat");
         DataOutputStream dos=new DataOutputStream(fos);
         dos.writeUTF(" 洪吉童");
         dos.writeInt(20);
         dos.writeInt(180);
         dos.writeUTF("男");
         dos.close();
         FileInputStream fis=new FileInputStream("Student.dat");
         DataInputStream dis=new DataInputStream(fis);
 
         Student stu=new Student(dis.readUTF(),dis.readInt(),dis.readInt(),dis.readUTF());
         System.out.println("姓名："+stu.name);
         System.out.println("年龄："+stu.age);
         System.out.println("身高："+stu.height);
         System.out.println("性别："+stu.sex);
         dis.close();
    }
}
class Student{
       String name,sex;
       int age,height;
       public Student(String _name,int _age,int _height,String _sex){
         name=_name;age=_age;height=_height;sex=_sex;
       }
}