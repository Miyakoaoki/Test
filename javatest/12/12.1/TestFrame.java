import java.awt.*;
class TestFrame {
   public static void main(String arg[])
    {
        Frame f =  new Frame("A Test Window");
        f.setSize(300,400);
        f.setLocation(100,50);
        f.setVisible(true);
        FileDialog dlg=new FileDialog(f,"´ò¿ª",FileDialog.LOAD);
        dlg.setSize(100,50);
        dlg.setLocation(120,70);
        dlg.setVisible(true);
    }
}
