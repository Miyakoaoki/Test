import java.awt.*;
import java.awt.event.*;
public class TextSend{
     Frame f=new Frame("TextSend");
     TextField tf=new TextField(30);
     Label label=new Label();
     Button send=new Button("·¢ËÍ");
     public TextSend(){
             ActionHandler ae=new ActionHandler();
             send.addActionListener(ae);
             tf.addActionListener(ae);
             f.setLayout(new GridLayout(3,1));
             f.add(label);
             f.add(tf);
             f.add(send);
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
}