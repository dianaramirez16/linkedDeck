// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;
//import java.util.List;

public class menuClient {
      public static Players[] playersArray = new Players[4];  //holds players
      
      public static void main(String[] args) {
            ArrayList<Card> d = Deck.newDeck();  //prints first time
            Deck.shuffleList(d); //shuffles & prints shuffled
            createPlayers();
            dealCards(d);
            startGame();
      }
      
      //method to generate players. each player gets a linked list "hand"
      public static void createPlayers() {
            //String playerName="Player";
            
            for (int i =0; i<4; i++){  //loops 4 times to create 4 players
                  playersArray[i] = new Players("player"+(i+1));
                  System.out.println(playersArray[i].getName());  //prints players for debugging
            }
            System.out.println(playersArray[0].getName());
            System.out.println(playersArray[1].getName());
            System.out.println(playersArray[2].getName());
            System.out.println(playersArray[3].getName());
      }
      
      public static void dealCards(ArrayList<Card> d) {
            for(int i=0; i<4; i++){
                  
                  Queue tempQ = new Queue();
                  Players tempPlayer = playersArray[i];
                  Card nullCard = new Card();
                  
                  //grabs only l4
                  nullCard.setCardPlayerName(playersArray[i].getName());
                  String pName = nullCard.getCardPlayerName();
                  
                  
                  
                  tempQ = tempPlayer.playerHand;
                  tempQ.enQueue(nullCard);
                  //fills first nodes in queues with null values
                  System.out.println("null hands: " + playersArray[i%4].playerHand + i + playersArray[i].getName());
            }
            
            for (int i =0; i<d.getSize(); i++){ //iterates through index objects
                  Queue tempQ = new Queue();
                  Card referenceAdd = d.get(i);
                  //System.out.print(referenceAdd);
                  
                  Players tempPlayer = playersArray[i%4];  //0,1,2,3,0,1,2,3
                  tempQ = tempPlayer.playerHand;
                  tempQ.enQueue(referenceAdd);
                  
                  int counter = (i%4);
                  System.out.println("i:" + i + "counter:" + counter);
                  System.out.println("var" + playersArray[counter].getName());  //grabs only l4
                  referenceAdd.setCardPlayerName(playersArray[counter].getName());
                  String pName = referenceAdd.getCardPlayerName();
                  
                  System.out.println("name:" + pName + "- hand:" + playersArray[i%4].playerHand );
                  
                  
                  //they are given the name of the player in order to determine their source in gameplay
            }
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
            System.out.println("player " + randomPlayer + "'s hand: " + playersArray[randomPlayer].playerHand);  //prints entire hand
            
            
            QNode tempNode = playersArray[randomPlayer].playerHand.peek();   //first qnode in rand players deck
            Card cardPlayed =  tempNode.getCard();
            tableQueue.enQueue(cardPlayed);
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