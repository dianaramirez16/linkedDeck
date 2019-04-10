//reference: https://howtoprogramwithjava.com/enums/
public class Card {
      private CardSuit suit;
      private CardValue cardValue;
      
      public Card (CardValue cardValue, CardSuit suit) {
            this.cardValue = cardValue;
            this.suit = suit;
      }
      
      public CardSuit getSuit() {
            return suit;
      }
      
      public void setSuit(CardSuit suit) {
            this.suit = suit;
      }
      
      public CardValue getCardValue() {
            return cardValue;
      }
      
      public void setCardValue(CardValue cardValue) {
            this.cardValue = cardValue;
      }
      
      public int compareTo(Card o) {
            return -this.getCardValue().compareTo(o.getCardValue());
      }
      
      public String toString() {
            return cardValue + " of " + suit /* + "(" + cardValue() + ")"*/;
      }
      
      
}