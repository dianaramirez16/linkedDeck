public class Players {
      //public static Deck[] handOfCards;
      public Queue playerHand;
      public static String name ="null";
      public static int wins;
      public static int losses;
      public static Boolean isWinner=false;
      
      public Players(String n){
            playerHand = new Queue();   //change to QUEUE or use only QUEUE methods
            this.name=n;
            wins=0;
            losses=0;
            isWinner=false;
      }
      
      public static String getName() {
            return name;
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