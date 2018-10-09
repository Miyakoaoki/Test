import java.awt.*;
import java.awt.event.*;
public class TestText{
     Frame f;
     Label label;
     TextField tf1,tf2;   
     public TestText(){
         f=new Frame("TestText");
         label=new Label();
         TextField tf1=new TextField(50);
         TextField tf2=new TextField(50);
         TextHandler th=new TextHandler();
         tf1.addTextListener(th);
         tf2.addTextListener(th);
         f.setLayout(new GridLayout(3,1));
         f.add(label);
         f.add(tf1);
         f.add(tf2);
         f.setBounds(200,200,200,100);
         f.setVisible(true);
     }
    public static void main(String[] args){
         TestText t=new TestText();
    }
    class TextHandler implements TextListener{
       public void textValueChanged(TextEvent e){
         String text=((TextField)e.getSource()).getText();
               label.setText(text);
         }
    
   }
}