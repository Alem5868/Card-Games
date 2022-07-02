import java.util.ArrayList;

public class Player {
  private String name;
  private Deck cards;

  public Player(String n) {
    name = n;
    cards = new Deck();
  }

  public String getName() {
    return name;
  }
}