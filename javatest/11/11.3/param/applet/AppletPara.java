import java.applet.*;
import java.awt.*;
public class AppletPara extends Applet
{
    private String text;
    private int size,color;
    public void init()
    {
        text = getParameter("text");                      //����ı�����
        size = Integer.parseInt(getParameter("size"));    //��������С
        color= Integer.parseInt(getParameter("color"),16);//�����ɫֵ
    }
    public void paint(Graphics g)
    {
        Color c = new Color(color);
        g.setColor(c);
        Font f=new Font("",1,size);
        g.setFont(f);
        g.drawString(text, 10, 50);         //��ʾָ����С��ɫ���ַ���
    }
}
