import java.awt.*;
public class Login
{
    public static void main(String arg[])
    {
         Frame f = new Frame("User Login");       
         f.setSize(280,150);                         
         Button b= new Button("login");
         b.setBounds((f.getWidth()-100)/2,(f.getHeight()-50)/2,100,50);
         Panel p=new Panel() ;                //�������
         p.add(b);
         f.add(p);                               //���һ����ť
         f.setBackground(Color.lightGray);  //��ܱ�����ɫ
         f.setVisible(true);                         //��ʾ���  
    }
}
