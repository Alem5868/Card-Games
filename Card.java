public class Card {

  private int value;
  private String suit; // have four images and just use the string to load correct suit

  public Card(int val, String s) {
    value = val;
    suit = s;
  }
}

/*
Code to load images:

import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;

public class Suit
  {
    private BufferedImage suitBG;

    public Suit()
    {
      try {
      suitBG = ImageIO.read(new File("heart_1.png"));
    } catch (IOException e) {
    }
    }
  }
*/