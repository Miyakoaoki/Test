import java.awt.*;
import java.awt.event.*;
public class TestMouseEvent extends Frame{
       Label mouseInfo;
       public TestMouseEvent(String title){
             super(title);
             mouseInfo=new Label("");
             mouseInfo.setFont(new Font("TimeNewRoman",1,20));
             add(mouseInfo,"North");
             this.addMouseMotionListener(new MouseMotionHandler());
       }
       public static void main(String[] args){
            TestMouseEvent me=new TestMouseEvent("Mouse事件处理");
            me.setSize(200,200);
            me.setVisible(true);
       }
       class MouseMotionHandler implements MouseMotionListener{
            public void mouseMoved(MouseEvent e){
                  mouseInfo.setText("Move->x:"+e.getX()+"y:"+e.getY());
            }
            public void mouseDragged(MouseEvent e){
                  mouseInfo.setText("Drag->x:"+e.getX()+"y:"+e.getY());
            }
       }
}