import java.awt.*;
public class BorderSimple {
     public static void main(String[] args) {
           Frame fs = new Frame("Border Layout Simple");
           fs.setLayout(new BorderLayout(10,10));
           Button north = new Button("North");
           Button south = new Button("South");
          Button west = new Button("West");
          Button east = new Button("East");
         Button center = new Button("Center");
         fs.add(north, BorderLayout.NORTH);
			fs.add(south, BorderLayout.SOUTH);
			fs.add(west, "West");
			fs.add(east, BorderLayout.EAST);
			fs.add(center, BorderLayout.CENTER);

		fs.setSize(400, 400);
		fs.setVisible(true);
	}
}
