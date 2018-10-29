package cards.tests;

import cards.domain.PlayingCard;
import static cards.domain.Suit.*;

public class TestPlayingCard {
  public static void main(String[] args) {

    PlayingCard card1 = new PlayingCard(SPADES, 2);
    System.out.println("card1 is the " + card1.getRank()
                       + " of " + card1.getSuit().getName());

    // NewPlayingCard card2 = new NewPlayingCard(47, 2);
    // This will not compile.
  }
}
