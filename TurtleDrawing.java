import java.util.*;
import java.awt.*;

public class TurtleDrawing {
  public static void main(String[] args)  {

      World habitat = new World(300,300);
      Turtle yertle = new Turtle(habitat);
      Turtle myrtle = new Turtle(habitat);

      yertle.forward();
      yertle.turnLeft();
      yertle.forward();

      myrtle.turnRight();
      myrtle.forward();

      habitat.show(true);
  }
}
