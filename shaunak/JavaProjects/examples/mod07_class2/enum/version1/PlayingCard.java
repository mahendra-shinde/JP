package cards.domain;

public class PlayingCard {

  // pseudo enumerated type
  public static final int SUIT_SPADES   = 0;
  public static final int SUIT_HEARTS   = 1;
  public static final int SUIT_CLUBS    = 2;
  public static final int SUIT_DIAMONDS = 3;

  private int suit;
  private int rank;

  public PlayingCard(int suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public int getSuit() {
    return suit;
  }
  public String getSuitName() {
    String name = "";
    switch ( suit ) {
      case SUIT_SPADES:
        name = "Spades";
        break;
      case SUIT_HEARTS:
        name = "Hearts";
        break;
      case SUIT_CLUBS:
        name = "Clubs";
        break;
      case SUIT_DIAMONDS:
        name = "Diamonds";
        break;
      default:
        System.err.println("Invalid suit.");
    }
    return name;
  }

  public int getRank() {
    return rank;
  }
}
