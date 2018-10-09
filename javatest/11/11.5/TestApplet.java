import java.applet.*;
import java.awt.*;
public class TestApplet extends Applet{
      AudioClip ac;
      public void init(){
           ac=getAudioClip(getDocumentBase(),"0.au");
      }
      public void start(){
          ac.loop();
      }
      public void stop(){
          ac.stop();
      }
}