public class Players {
      public static String name ="";
      public static int wins=0;
      public static int losses=0;
      public static Boolean isWinner=false;
      /*
      //overhead constructor
      public static Players Players() {
            return Players();
      }*/
      
      //overhead constructor
      public Players(String n){
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