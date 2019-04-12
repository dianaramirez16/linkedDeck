// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;

public class menuClient {
      
      public static void main(String[] args) {
            ArrayList<Card> d = Deck.newDeck();
            
            /*
            
            
            // queue
            Queue q = new Queue();
            q.enqueue();
            q.enqueue(20);
            q.dequeue();
            q.dequeue();
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
      */
      //    System.out.println("Dequeued item is "+ q.dequeue().key);
            //ArrayList<String> myDeck = new ArrayList<>();
            createPlayers();
      }
      
      //method to generate players. each player gets a linked list "hand"
      public static void createPlayers() {
            String playerName="Player";
            for (int i =1; i<5; i++){  //loops 4 times to create 4 players
                  //create players by calling Players method
                  new Players("player"+i);
                  
                  System.out.println(Players.getName());  //prints players
            }
      }
      
      //method to select random player to start
      //method to display player's hands
            //print linked lists
      //create queue as table where cards are shown
      //method to print after each round, the cards in every player's hands
      //method to play for 15 rounds or a player has all cards, check for a tie
      //
    
}