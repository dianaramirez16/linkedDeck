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
      
      public static ArrayList<Card> newDeck() {
            System.out.println("protoPrint: " + protoDeck);
            return new ArrayList<Card>();
      }
      
     /* //shuffle methods
      
      public static void shuffleList(ArrayList<Card> a) {
            int n = a.getSize();
            Random random = new Random();
            random.nextInt();
            for (int i = 0; i < n; i++) {
                  int change = i + random.nextInt(n - i);
                  swap(a, i, change);
            }
      }
      
      private static void swap(ArrayList<Card> a, int i, int change) {
            //  int helper = a.get(i);
            int helper = a.get(i);  // needs to return int
            a.set(i, a.get(change));
            a.set(change, a.get(helper));
      }
      
      public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            shuffleList(list);
            for (int i : list) {
                  System.out.println(i);
            }
      
      */
      
      public static singleLinkedList dealCards(ArrayList<Card> aShuffled) {
            for (int i =0; i<13; i++){ //iterates through index objects
                  //deals 13 cards to each linked list which is the hand of the player
                  singleLinkedList list = new singleLinkedList();
                  list.addLast(aShuffled.get(i)); //accepts card object
                  
            }
            return list;
      }
}