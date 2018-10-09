import java.awt.*;
public class Login
{
    public static void main(String arg[])
    {
         Frame f = new Frame("User Login");       
         f.setSize(280,150);                         
         Button b= new Button("login");
         b.setBounds((f.getWidth()-100)/2,(f.getHeight()-50)/2,100,50);
         Panel p=new Panel() ;                //创建面板
         p.add(b);
         f.add(p);                               //添加一个按钮
         f.setBackground(Color.lightGray);  //框架背景颜色
         f.setVisible(true);                         //显示框架  
    }
}
