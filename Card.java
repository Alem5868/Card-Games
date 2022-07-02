import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;

public class Card {

  private int value;
  private BufferedImage photo;

  public Card(int val) {
    value = val;
    try
      {
        photo = ImageIO.read (new File ());
      }
    catch (IOException e )
      {}
  }
}