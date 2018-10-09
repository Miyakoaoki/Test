import java.applet.Applet;
import java.awt.*;
public class TestApplet extends Applet {
      Image[] images;
      int total,current;
      public void init(){
           total=10;
           current=0;
           images=new Image[total];
           for(int i=0;i<10;i++){
              images[i]=getImage(getDocumentBase(),"images/T"+(i+1)+".gif");
              System.out.println("×°ÔØµÚ"+(i+1)+"¸±Í¼Æ¬");
           }
      }
      public void paint(Graphics g){
          g.drawImage(images[current],80,50,300,200,this);
          current=++current%10;
          try{
              Thread.sleep(1000);
          }catch(InterruptedException ie){}
          repaint();
      }
}