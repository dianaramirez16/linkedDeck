//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/

public class Card {
      private CardSuit cardSuit;
      private CardValue cardValue;
      
      protected Card (CardValue cardValue, CardSuit cardSuit) {
            this.cardValue = cardValue;
            this.cardSuit = cardSuit;
      }
      
      public CardSuit getCardSuit() {
            return cardSuit;
      }
      
      public void setSuit(CardSuit cardSuit) {
            this.cardSuit = cardSuit;
      }
      
      public CardValue getCardValue() {
            return cardValue;
      }
      
      public void setCardValue(CardValue cardValue) {
            this.cardValue = cardValue;
      }
      
      
      
      
      public Boolean equalsTo(Card p, Card o) {
            if (p.getCardValue().equals(o.getCardValue())){  //cards are the same number
                  if(p.cardSuit.getCardSuit() > (o.cardSuit.getCardSuit())) {  //compare cardSuits p>o
                        return true;
                  } else return false;  //o > p 
            } else if (p.cardValue.getCardValue() > (o.cardValue.getCardValue())) { // p>o card number is greater
                  return true;
            } else return false;  //o > p
      }
      
      public String toString() {
            return cardValue + " of " + cardSuit /* + "(" + cardValue() + ")"*/;
      }
      
      
}