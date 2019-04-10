//deck accessed by main declared as arraylist
//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/

public class Deck {
      private static ArrayList<Card> protoDeck = new ArrayList<Card>();
      
      static {
            for (final CardSuit cardSuit : CardSuit.values()) {
                  for (final CardValue cardValue : CardValue.values() ) {
                        Card tempCard = new Card(cardValue, cardSuit);
                        Deck.protoDeck.add(tempCard);
                  }
            }
      }
      
      protected Deck(final CardValue cardValue, final CardSuit cardSuit) {
            new Card(cardValue, cardSuit);
      }
      
      public static ArrayList<Card> newDeck() {
            return new ArrayList<Card>(Deck.protoDeck);
      }
      
}
