package cards.domain;

public class PlayingCard {

  private Suit suit;
  private int rank;

  public PlayingCard(Suit suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }
  public String getSuitName() {
    String name = "";
    switch ( suit ) {
      case SPADES:
        name = "Spades";
        break;
      case HEARTS:
        name = "Hearts";
        break;
      case CLUBS:
        name = "Clubs";
        break;
      case DIAMONDS:
        name = "Diamonds";
        break;
      default:
      // No need for error checking as the Suit
      // enum is finite.
    }
    return name;
  }

  public int getRank() {
    return rank;
  }
}
