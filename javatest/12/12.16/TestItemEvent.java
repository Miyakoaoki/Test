import java.awt.*;
import java.awt.event.*;
public class TestItemEvent extends Frame{
      List color=new List(3);
      Label t=new Label();
      public TestItemEvent(String title){
             super(title);
             color.add("��ɫ");
             color.add("��ɫ");
             color.add("��ɫ");
             color.addItemListener(new ItemEventHandler());
             add(color,"Center");
             add(t,"South");
      }
      public static void main(String[] args){
             TestItemEvent me=new TestItemEvent("Item�¼�����");
             me.pack();
            me.setVisible(true);
      }
      class ItemEventHandler implements ItemListener{
            public void itemStateChanged(ItemEvent e){
                  if(e.getSource()==color){
                         String col=color.getSelectedItem();
                         if(col.equals("��ɫ")) t.setBackground(new Color(250,0,0));
                        else if(col.equals("��ɫ")) t.setBackground(new Color(0,250,0));
                        else  t.setBackground(Color.YELLOW);
                  }
                      
            }
     }
}