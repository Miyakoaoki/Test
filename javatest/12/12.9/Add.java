import java.awt.*;
import java.awt.event.*;
public class Add implements ActionListener{
  int count=0;
  Button button=new Button("Ôö¼Ó");
  Label label=new Label("0");
  Frame frame=new Frame("ÀÛ¼Ó");
  public Add(){
	 button.addActionListener(this);
	 frame.add(button,"Center");
	 frame.add(label,"South");
	 frame.pack();
	 frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter(){
                      public void windowClosing(WindowEvent e){
                              System.exit(0);
                      }
             });
}
public void actionPerformed(ActionEvent ae){
   count++;
   label.setText(String.valueOf(count));
}
public static void main(String[] args){
  Add addFrame=new Add();
}
}
