// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;

public class menuClient {
      static Players[] playersArray;  // array holds players
      static Queue player1 = new Queue();   //change to QUEUE or use only QUEUE methods
      static Queue player2 = new Queue();   //change to QUEUE or use only QUEUE methods
      static Queue player3 = new Queue();   //change to QUEUE or use only QUEUE methods
      static Queue player4 = new Queue();   //change to QUEUE or use only QUEUE methods
      
      
      public static void main(String[] args) {
            ArrayList<Card> d = Deck.newDeck();  //prints first time
            Deck.shuffleList(d); //shuffles & prints shuffled
            dealCards(d);  //deals and creates players
            startGame();
      }
      
      
      public static void dealCards(ArrayList<Card> d) {
            //declare new player objects. they contain queue objects
            Players playerObj1 = new Players("Player1");
            Players playerObj2 = new Players("Player2");
            Players playerObj3 = new Players("Player3");
            Players playerObj4 = new Players("Player4");
            playersArray = new Players[]{playerObj1, playerObj2, playerObj3, playerObj4};
      
            //System.out.println("Player1's hand: " + d.get(0) + " | " + d.get(1) + " | " + d.get(2) + " | " + d.get(3) + "\n\t |" + d.get(4) + " | " + d.get(5) + " | " + d.get(6) + " | " + d.get(7) + "\n\t | " + d.get(8) + " | " + d.get(9) + " | " + d.get(10) + " | " + d.get(11) + " | " + d.get(12));
            player1.enQueue(d.get(0)); player1.enQueue(d.get(1)); player1.enQueue(d.get(2)); player1.enQueue(d.get(3));
            player1.enQueue(d.get(4)); player1.enQueue(d.get(5)); player1.enQueue(d.get(6)); player1.enQueue(d.get(7));
            player1.enQueue(d.get(8)); player1.enQueue(d.get(9)); player1.enQueue(d.get(10)); player1.enQueue(d.get(11));
            player1.enQueue(d.get(12));
            //player 2
            player2.enQueue(d.get(13));
            player2.enQueue(d.get(14));
            player2.enQueue(d.get(15));
            player2.enQueue(d.get(16));
            player2.enQueue(d.get(17));
            player2.enQueue(d.get(18));
            player2.enQueue(d.get(19));
            player2.enQueue(d.get(20));
            player2.enQueue(d.get(21));
            player2.enQueue(d.get(22));
            player2.enQueue(d.get(23));
            player2.enQueue(d.get(24));
            player2.enQueue(d.get(25));
            //player3
            player3.enQueue(d.get(26));
            player3.enQueue(d.get(27));
            player3.enQueue(d.get(28));
            player3.enQueue(d.get(29));
            player3.enQueue(d.get(30));
            player3.enQueue(d.get(31));
            player3.enQueue(d.get(32));
            player3.enQueue(d.get(33));
            player3.enQueue(d.get(34));
            player3.enQueue(d.get(35));
            player3.enQueue(d.get(36));
            player3.enQueue(d.get(37));
            player3.enQueue(d.get(38));
            //player4
            player4.enQueue(d.get(39));
            player4.enQueue(d.get(40));
            player4.enQueue(d.get(41));
            player4.enQueue(d.get(42));
            player4.enQueue(d.get(43));
            player4.enQueue(d.get(44));
            player4.enQueue(d.get(45));
            player4.enQueue(d.get(46));
            player4.enQueue(d.get(47));
            player4.enQueue(d.get(48));
            player4.enQueue(d.get(49));
            player4.enQueue(d.get(50));
            player4.enQueue(d.get(51));
      
            System.out.println("Player1's hand: " + player1.toString());
            System.out.println("Player2's hand: " + player2.toString());
            System.out.println("Player3's hand: " + player3.toString());
            System.out.println("Player4's hand: " + player4.toString());
      }
      
      
      public static void startGame(){
            Queue tableQueue = new Queue();
            Card nullCard = new Card();
            tableQueue.enQueue(nullCard);
      
            System.out.println("\n\n\n");
            System.out.println("Let's play a game.");
            Random rand = new Random();
            int randomPlayer = 1 + rand.nextInt(4 - 1);
            System.out.println("Player " + randomPlayer + " has been randomly selected to go first.");
            System.out.println("player " + randomPlayer + "'s hand: " + playersArray[randomPlayer]);  //prints entire hand
      
      
            //QNode tempNode = playersArray[randomPlayer].peek();   //first qnode in rand players deck
            //Card cardPlayed = tempNode.getCard();
            //tableQueue.enQueue(cardPlayed);
            System.out.println("table: " + tableQueue);
      
      }

      
            //method to select random player to start
            //method to display player's hands
            //print linked lists
            //create queue as table where cards are shown
            //method to print after each round, the cards in every player's hands
            //method to play for 15 rounds or a player has all cards, check for a tie
            //
 
}