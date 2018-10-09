import java.awt.*;
public class Draw extends Frame{
     public Draw(String title){
             super(title);
     }
     public static void main(String[] args){
          Frame f=new Draw("paint");
          f.setSize(300,300);
          f.setVisible(true);
     }
     public void paint(Graphics g){
          g.drawLine(10,30,50,50);
          g.drawRect(60,30,50,50);
          g.drawRoundRect(120,30,50,50,20,20);
          g.drawOval(10,100,70,50);//ª≠Õ÷‘≤
          g.drawArc(100,100,50,50,90,180);//ª≠‘≤ª°
          int[] x=new int[]{200,240,200,220,240};
          int[] y=new int[]{80,80,120,60,120};
          g.drawPolygon(x,y,5);
          g.fillRect(10,150,50,50);
     }
}