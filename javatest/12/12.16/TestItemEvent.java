import java.awt.*;
import java.awt.event.*;
public class TestItemEvent extends Frame{
      List color=new List(3);
      Label t=new Label();
      public TestItemEvent(String title){
             super(title);
             color.add("红色");
             color.add("绿色");
             color.add("黄色");
             color.addItemListener(new ItemEventHandler());
             add(color,"Center");
             add(t,"South");
      }
      public static void main(String[] args){
             TestItemEvent me=new TestItemEvent("Item事件处理");
             me.pack();
            me.setVisible(true);
      }
      class ItemEventHandler implements ItemListener{
            public void itemStateChanged(ItemEvent e){
                  if(e.getSource()==color){
                         String col=color.getSelectedItem();
                         if(col.equals("红色")) t.setBackground(new Color(250,0,0));
                        else if(col.equals("绿色")) t.setBackground(new Color(0,250,0));
                        else  t.setBackground(Color.YELLOW);
                  }
                      
            }
     }
}