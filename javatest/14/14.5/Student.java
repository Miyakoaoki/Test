import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class InfoFrame{
    JLabel name=new JLabel("学生姓名");
    JLabel number=new JLabel("学号");
    JTextField tname=new JTextField();
    JTextField tnumber=new JTextField();
    JButton save=new JButton("保存");
    JButton clear=new JButton("清空");
    JFrame f=new JFrame("学生信息录入窗口");
    public InfoFrame(){
           EventHandler handler=new EventHandler();
           save.addActionListener(handler);
           clear.addActionListener(handler);
           f.getContentPane().setLayout(new GridLayout(3,2));
           f.getContentPane().add(name);
           f.getContentPane().add(tname);
           f.getContentPane().add(number);
           f.getContentPane().add(tnumber);
           f.getContentPane().add(save);
           f.getContentPane().add(clear);
           f.setSize(300,200);
           f.setVisible(true);
          // f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
           new InfoFrame();
    }
    class EventHandler implements ActionListener{
          public void actionPerformed(ActionEvent e){
                if(e.getSource()==save){
                    String name=tname.getText();
                    int number=Integer.parseInt(tnumber.getText());
                    try{
                    FileOutputStream fos=new FileOutputStream("student.dat");
                    DataOutputStream dos=new DataOutputStream(fos);
                    dos.writeUTF(name);
                    dos.writeInt(number);
                    dos.close();
                    }catch(IOException ioe){}
                }
                else if(e.getSource()==clear){
                    tname.setText("");
                    tnumber.setText("");
                }
          }
     }
}