import java.util.ArrayList;
import java.lang.Math;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<Card>();
  }

  public Deck(boolean gameDeck) {
    cards = new ArrayList<Card>();
    for (int a = 0; a < 13; a++) {
      Card card = new Card(a);
      cards.add(card);
    }
  }

  public Card getCard() {
    int i = (int) Math.random() * cards.size();
    return (Card) cards.remove(i);
  }
}