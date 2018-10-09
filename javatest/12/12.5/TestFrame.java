import java.awt.*;
class TestFrame {
   public static void main(String arg[])
    {
     Frame f =  new Frame("A Test Window");
     MenuBar mb=new MenuBar();
     Menu m1=new Menu("File");
     Menu m2=new Menu("Edit");
     MenuItem mi1=new MenuItem("New");
     MenuItem mi2=new MenuItem("Open");
     

     Menu m3=new  Menu("È¨ÏÞ");
     MenuItem mi3=new MenuItem("1");
     MenuItem mi4=new MenuItem("2");
     m3.add(mi3);
     m3.add(mi4);
     
     m1.add(mi1);m1.add(mi2);m1.add(m3);
     mb.add(m1);mb.add(m2);
 
     PopupMenu p=new PopupMenu();
     MenuItem mi5=new MenuItem("¸´ÖÆ");
    MenuItem mi6=new MenuItem("ð¤Ìù");
     p.add(mi5);
     p.addSeparator();
     p.add(mi6);
     f.add(p);
     

     f.setMenuBar(mb);
     f.setSize(250,150);
     f.setVisible(true);
    }
}
