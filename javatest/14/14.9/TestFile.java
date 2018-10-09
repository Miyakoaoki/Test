import java.io.*;
public class TestFile{
    public static void main(String[] args)throws IOException{
         FileOutputStream fos=new FileOutputStream("Student.dat");
         DataOutputStream dos=new DataOutputStream(fos);
         dos.writeUTF(" �鼪ͯ");
         dos.writeInt(20);
         dos.writeInt(180);
         dos.writeUTF("��");
         dos.close();
         FileInputStream fis=new FileInputStream("Student.dat");
         DataInputStream dis=new DataInputStream(fis);
 
         Student stu=new Student(dis.readUTF(),dis.readInt(),dis.readInt(),dis.readUTF());
         System.out.println("������"+stu.name);
         System.out.println("���䣺"+stu.age);
         System.out.println("��ߣ�"+stu.height);
         System.out.println("�Ա�"+stu.sex);
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