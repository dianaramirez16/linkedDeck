public class Players {
      public static Deck[] handOfCards;
      public static String name;
      public static int wins;
      public static int losses;
      public static Boolean isWinner=false;
      
      public Players(String n, Deck[] h){
            this.handOfCards =h;
            this.name=n;
            int wins=0;
            int losses=0;
            isWinner=false;
      }
      
      public static String getName() {
            return name;
      }
      
      public static Deck[] getHandOfCards() {
            return handOfCards;
      }
      
      public static int getWins() {
            return wins;
      }
      
      public static int getLosses() {
            return losses;
      }
      
      public static Boolean getWinner() {
            return isWinner;
      }
      
      public static void setWinner(Boolean winner) {
            isWinner = winner;
      }
      
      public static void setHandOfCards(Deck[] h) {
            handOfCards = h;
      }
      
      public static void setLosses(int l) {
            losses = l;
      }
      
      public static void setName(String n) {
            name = n;
      }
      
      public static void setWins(int w) {
            wins = w;
      }
      
}
