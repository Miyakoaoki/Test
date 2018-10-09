import java.awt.*;
import java.awt.event.*;
public class TestMouseEvent extends Frame{
       Label mouseInfo;
       public TestMouseEvent(String title){             
             super(title);
             mouseInfo=new Label("");
             mouseInfo.setFont(new Font("TimeNewRoman",1,20));
             add(mouseInfo,"North");
             this.addMouseListener(new MouseHandler());
       }
       public static void main(String[] args){
            TestMouseEvent me=new TestMouseEvent("Mouse事件处理");
            me.setSize(200,200);
            me.setVisible(true);
       }
       class MouseHandler implements MouseListener{
            public void mousePressed(MouseEvent e){
                  if(e.getButton()==1)
                       mouseInfo.setText("点击左键");
                  else if (e.getButton()==2)
                       mouseInfo.setText("点击中键");
                  else if(e.getButton()==3)
                       mouseInfo.setText("点击右键");
            }
            public void mouseReleased(MouseEvent e){
                  mouseInfo.setText("释放");
            }
            public void mouseEntered(MouseEvent e){
                  mouseInfo.setText("进入");
            }
            public void mouseExited(MouseEvent e) {
                  mouseInfo.setText("离开");
            }
            public void mouseClicked(MouseEvent e){
                   mouseInfo.setText(mouseInfo.getText()+"点击");
            }
       }
}