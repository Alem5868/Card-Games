import java.util.ArrayList;
import java.lang.Math;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<Card>();
  }

  public Deck(boolean gameDeck) {
    cards = new ArrayList<Card>();
    
    Card card;
    for (int a = 0; a < 16; a++) {
      card = new Card(a, "hearts");
      cards.add (card);
      card = new Card (a, "clubs");
      cards.add (card);
      card = new Card (a, "spades");
      cards.add (card);
      card = new Card (a, "diamonds");
      cards.add (card);
    }
  }

  public Card getCard() {
    int i = (int) Math.random() * cards.size();
    return (Card) cards.remove(i);
  }
}