//deck accessed by main declared as arraylist
//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/

public class Deck extends Card {
      private static ArrayList<Card> protoDeck = new ArrayList<Card>(52);
      
      static {
            for (final CardSuit cardSuit : CardSuit.values()) {
                  for (final CardValue cardValue : CardValue.values() ) {
                        Card tempCard = new Card(cardValue, cardSuit);
                        protoDeck.add(tempCard);
                  }
            }
      }
      
      protected Deck(final CardValue cardValue, final CardSuit cardSuit) {
            super(cardValue, cardSuit);
      }
      
      public static ArrayList<Card> newDeck() {
            /*final ArrayList<Card> cardArrayList = new ArrayList<>();
            return cardArrayList;*/
            return new ArrayList<Card>(Deck.protoDeck);
      }
      
}