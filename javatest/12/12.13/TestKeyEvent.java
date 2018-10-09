import java.awt.*;
import java.awt.event.*;
public class TestKeyEvent extends Frame{
       Label keyChar;
       Label keyCode;
       Label keyText;
       Label actionKey;
       TextField tf;
       public TestKeyEvent(String title){
              super(title);
              setLayout(new GridLayout(5,1));
              keyChar=new Label("keyChar:");
              keyCode=new Label("keyCode:");
              keyText=new Label("keyText:");
              actionKey=new Label("actionKey:");
              tf=new TextField();
              add(keyChar);
              add(keyCode);
              add(keyText);
              add(actionKey);
              add(tf);
              tf.addKeyListener(new KeyHandler());
       }
       public static void main(String[] args){
              TestKeyEvent f=new TestKeyEvent("Key事件处理");
              f.setSize(200,200);
              f.setVisible(true);
       }
       class KeyHandler implements KeyListener{
             public void keyPressed(KeyEvent e){
                  keyCode.setText("keyCode:"+e.getKeyCode());
                  keyText.setText("keyText:"+e.getKeyText(e.getKeyCode()));
                  actionKey.setText("actionKey:"+e.isActionKey());
             }
             public void keyTyped(KeyEvent e){
                 keyChar.setText("keyChar:"+e.getKeyChar());
             }
             public void keyReleased(KeyEvent e){}
      }
}