import java.awt.*;
import java.awt.event.*;
public class TestCheckbox extends Frame{
      CheckboxGroup cg=new CheckboxGroup();
      Checkbox cb1=new Checkbox("普通",cg,true);
      Checkbox cb2=new Checkbox("粗体",cg,false);
      Checkbox cb3=new Checkbox("斜体",cg,false);
      Label label=new Label("这是一个测试程序",1);
      Panel p=new Panel();
      public TestCheckbox(String title){
             super(title);
             Font f=new Font("宋体",0,30);
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
             TestCheckbox me=new TestCheckbox("Item事件处理");
             me.pack();
            me.setVisible(true);
      }
      class ItemEventHandler implements ItemListener{
            public void itemStateChanged(ItemEvent e){
                  
                         String col=((Checkbox)e.getSource()).getLabel();
                         if(col.equals("普通")) label.setFont(new Font("宋体",0,30));
                        else if(col.equals("粗体")) label.setFont(new Font("宋体",1,30));
                        else  label.setFont(new Font("宋体",2,30));
                  
                      
            }
     }
}