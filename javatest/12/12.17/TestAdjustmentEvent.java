import java.awt.*;
import java.awt.event.*;
public class TestAdjustmentEvent extends Frame implements AdjustmentListener{
     Scrollbar sb;
     Label label;
     public TestAdjustmentEvent(String title){
             super(title);
             label=new Label("Java",Label.CENTER);
             sb=new Scrollbar(Scrollbar.HORIZONTAL,10,1,1,300);
             add(label,"Center");
             add(sb,"South");
             sb.addAdjustmentListener(this);
     }
     public static void main(String[] args){
             TestAdjustmentEvent me=new TestAdjustmentEvent("Adjustment事件处理");
             me.setSize(300,300);
             me.setVisible(true);
     }
     public void adjustmentValueChanged(AdjustmentEvent e){
            Font font=new Font("TimeRoman",1,sb.getValue());
            label.setFont(font);
     }
}