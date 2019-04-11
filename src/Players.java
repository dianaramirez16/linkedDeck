public class Players {
      Deck[] handOfCards;
      String name;
      int wins;
      int losses;
      Boolean isWinner=false;
      
      public Players(String n, Deck[] h){
            this.handOfCards =h;
            this.name=n;
            int wins=0;
            int losses=0;
            isWinner=false;
      }
      
      public String getName() {
            return name;
      }
      
      public Deck[] getHandOfCards() {
            return handOfCards;
      }
      
      public int getWins() {
            return wins;
      }
      
      public int getLosses() {
            return losses;
      }
      
      public Boolean getWinner() {
            return isWinner;
      }
      
      public void setWinner(Boolean winner) {
            isWinner = winner;
      }
      
      public void setHandOfCards(Deck[] handOfCards) {
            this.handOfCards = handOfCards;
      }
      
      public void setLosses(int losses) {
            this.losses = losses;
      }
      
      public void setName(String name) {
            this.name = name;
      }
      
      public void setWins(int wins) {
            this.wins = wins;
      }
      
      @Override
      public String toString() {
            return super.toString();
      }
      
      @Override
      public boolean equals(Object obj) {
            return super.equals(obj);
      }
      
      
}
