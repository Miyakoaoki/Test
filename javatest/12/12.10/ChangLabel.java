import java.awt.*;
import java.awt.event.*;
public class ChangLabel{
       Frame f=new Frame("�л��ı�");
       Button b=new Button("�л�");
       Label lab=new Label("���",1);
       public ChangLabel(){
          Font font=new Font("����",Font.BOLD,20);
          b.setFont(font);
          ActionHandler ah=new ActionHandler();
          b.addActionListener(ah);
          lab.setFont(font);
          f.setLayout(new GridLayout(2,1));
          f.add(lab);
          f.add(b);
          f.setSize(200,300);
          f.setVisible(true);
          f.addWindowListener(new WindowHandler());
       }
       public static void main(String[] args){
             new ChangLabel();
       }
       
       class ActionHandler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                    if(lab.getText().equals("���"))  lab.setText("�ټ�");
                    else lab.setText("���");
            }
       }
       class WindowHandler implements WindowListener{
             public void windowClosing(WindowEvent e){
                    System.exit(0);
             }
             public void windowActivated(WindowEvent e){}
             public void windowClosed(WindowEvent e){}
             public void windowDeactivated(WindowEvent e){}
             public void windowDeiconified(WindowEvent e){}
             public void windowIconified(WindowEvent e){}
             public void windowOpened(WindowEvent e){}
        }
}