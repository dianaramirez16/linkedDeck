//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/

public enum CardValue {
      ACE(1),
      TWO(2),
      THREE(3),
      FOUR(4),
      FIVE(5),
      SIX(6),
      SEVEN(7),
      EIGHT(8),
      NINE(9),
      TEN(10),
      JACK(11),
      QUEEN(12),
      KING(13);
      
      private final Integer cardValue;
      
      private CardValue (final int value) {   //sets card value
            this.cardValue = value;
      }
      
      public Integer getCardValue() {   //returns card value
            return cardValue;
      }
      
}
