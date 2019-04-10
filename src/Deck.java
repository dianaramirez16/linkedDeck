//reference: https://howtoprogramwithjava.com/enums/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck
{
      private ArrayList deck;
      
      public Deck (){
            this.deck = new ArrayList();
            for (CardValue card: CardValue.values()) {
                  for(CardSuit suit: CardSuit.values()) {
                        deck.add(new Card(card, suit));
                  }
            }
            
      }
 
   /*Collections.shuffle(Deck);
 
    Iterator cardIterator = deck.iterator();
    while (cardIterator.hasNext())
    {
      Card aCard = cardIterator.next();
      System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
    }*/
}
