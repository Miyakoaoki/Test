import java.awt.*;
import java.awt.event.*;
public class Draw extends Frame{
     Graphics g;
     int x,y,ox,oy;
     public Draw(String title){
          super(title);
          setSize(200,200);
          setVisible(true);
          g=this.getGraphics();//获取Frame的Graphics对象
          g.setColor(Color.red);
          addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                          ox=e.getX();oy=e.getY();
                }
          });
          addMouseMotionListener(new MouseMotionAdapter(){
                public void mouseDragged(MouseEvent e){
                         x=e.getX();y=e.getY();
                         g.drawLine(ox,oy,x,y);
                         ox=x;oy=y;
                }
          });
     }
     public static void main(String[] args){
          Frame f=new Draw("绘图");
     }         
}