import java.awt.*;
import java.awt.event.*;
public class Add {
           int count=0;
           Button button=new Button("Ôö¼Ó");
           Label label=new Label("0");
           Frame frame=new Frame("ÀÛ¼Ó");
           public Add(){
                  ActionHandler ae=new ActionHandler();
                  button.addActionListener(ae);
                  frame.setLayout(new GridLayout(2,1));
                  frame.add(button);
                  frame.add(label);
                  frame.pack();
                  frame.setVisible(true);
            }
            public static void main(String[] args){
                  Add addFrame=new Add();
            }
           class ActionHandler implements ActionListener{
                 public void actionPerformed(ActionEvent e){
                        count++;
                        label.setText(String.valueOf(count));
                  }
           }
}

