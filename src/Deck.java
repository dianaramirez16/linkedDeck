//deck accessed by main declared as arraylist
//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/

import java.util.Random;
public class Deck extends Card {
      private static ArrayList<Card> protoDeck = new ArrayList<Card>();
      
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
      
      public static ArrayList<Card> newDeck() { //
            //System.out.println("protoPrint: " + protoDeck);   //prints tostring from arraylist class
            return protoDeck;
      }
      
      //shuffle methods
      
      public static void shuffleList(ArrayList<Card> a) {
            int n = a.getSize();
            Random random = new Random();
            random.nextInt();
            for (int i = 0; i < n; i++) {
                  int change = i + random.nextInt(n - i);
                  swap(a, i, change);
            }
           // System.out.println("shuffled: " + protoDeck + "\n");
      }
      
      private static void swap(ArrayList<Card> a, int i, int change) {
            //  int helper = a.get(i);
            Card helper = a.get(i);  // needs to return int
            a.set(i, a.get(change));
            a.set(change,(helper));   //set accepts index, card
      }
      
      
      
}