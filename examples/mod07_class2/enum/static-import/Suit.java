package cards.domain;

public enum Suit {
  SPADES   ("Spades"),
  HEARTS   ("Hearts"),
  CLUBS    ("Clubs"),
  DIAMONDS ("Diamonds");

  private final String name;

  private Suit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
