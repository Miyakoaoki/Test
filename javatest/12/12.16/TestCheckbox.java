import java.awt.*;
import java.awt.event.*;
public class TestCheckbox extends Frame{
      CheckboxGroup cg=new CheckboxGroup();
      Checkbox cb1=new Checkbox("��ͨ",cg,true);
      Checkbox cb2=new Checkbox("����",cg,false);
      Checkbox cb3=new Checkbox("б��",cg,false);
      Label label=new Label("����һ�����Գ���",1);
      Panel p=new Panel();
      public TestCheckbox(String title){
             super(title);
             Font f=new Font("����",0,30);
             cb1.setFont(f);
             cb2.setFont(f);
             cb3.setFont(f);
             label.setFont(f);
             cb1.addItemListener(new ItemEventHandler());
             cb2.addItemListener(new ItemEventHandler());
             cb3.addItemListener(new ItemEventHandler());
             p.add(cb1);p.add(cb2);p.add(cb3);
             add(p,"Center");
             add(label,"South");
             this.setBounds(200,300 ,500, 600);
             this.pack();
             this.setVisible(true);
      }
      public static void main(String[] args){
             TestCheckbox me=new TestCheckbox("Item�¼�����");
             me.pack();
            me.setVisible(true);
      }
      class ItemEventHandler implements ItemListener{
            public void itemStateChanged(ItemEvent e){
                  
                         String col=((Checkbox)e.getSource()).getLabel();
                         if(col.equals("��ͨ")) label.setFont(new Font("����",0,30));
                        else if(col.equals("����")) label.setFont(new Font("����",1,30));
                        else  label.setFont(new Font("����",2,30));
                  
                      
            }
     }
}