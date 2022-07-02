import java.util.ArrayList;

public class Game {
  private ArrayList<Player> players;
  private Deck deck;

  public Game() {
    players = new ArrayList<Player>();
    deck = new Deck ();
  }
}