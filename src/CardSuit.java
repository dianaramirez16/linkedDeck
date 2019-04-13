//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/
// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES

public enum CardSuit {
      SPADES(1),
      HEARTS(2),
      DIAMONDS(3),
      CLUBS(4);
      
      
      private final Integer suitValue;
      
      private CardSuit(int value) {  //sets suit value
            this.suitValue = value;
      }
      
      public Integer getCardSuit() {   //returns suit value
            return suitValue;
      }
}
