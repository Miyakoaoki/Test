import java.awt.*;
import java.awt.event.*;
public class TextSend{
     Frame f=new Frame("TextSend");
     TextField tf=new TextField(30);
     Label label=new Label();
     Button send=new Button("发送");
     public TextSend(){
             ActionHandler ae=new ActionHandler();
             send.addActionListener(ae);
             tf.addActionListener(ae);
             f.setLayout(new GridLayout(3,1));
             f.add(label);
             f.add(tf);
             f.add(send);
             WindowHandler wh=new WindowHandler();
             f.addWindowListener(wh);
             f.setSize(200,300);
             f.setVisible(true);
      }
      public static void main(String[] args){
             TextSend ts=new TextSend();
      }
      class ActionHandler implements ActionListener{
             public void actionPerformed(ActionEvent e){
                  String text=tf.getText();
                  label.setText(text);
             }
     }
    class WindowHandler implements WindowListener{
        public void windowClosing(WindowEvent e){
                 System.out.println("我退出了");
                 System.exit(0);
        }
        public void windowActivated(WindowEvent e){}
        public void windowClosed(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowOpened(WindowEvent e){
            label.setText("欢迎");
        }


     }
}