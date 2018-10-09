import java.applet.*;
import java.awt.*;
public class AppletPara extends Applet
{
    private String text;
    private int size,color;
    public void init()
    {
        text = getParameter("text");                      //获得文本参数
        size = Integer.parseInt(getParameter("size"));    //获得字体大小
        color= Integer.parseInt(getParameter("color"),16);//获得颜色值
    }
    public void paint(Graphics g)
    {
        Color c = new Color(color);
        g.setColor(c);
        Font f=new Font("",1,size);
        g.setFont(f);
        g.drawString(text, 10, 50);         //显示指定大小颜色的字符串
    }
}
