// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;

public class menuClient {
      static Players[] playersArray;  // array holds players
      
      public static void main(String[] args) {
            ArrayList<Card> d = Deck.newDeck();  //prints first time
            Deck.shuffleList(d); //shuffles & prints shuffled
            dealCards(d);  //deals and creates players
            
            
            dealCards(d);
            startGame();
      }
      
      public static void dealCards(ArrayList<Card> d) {
            //declare new player objects. they contain queue objects
            Players player1 = new Players("Player1");
            Players player2 = new Players("Player2");
            Players player3 = new Players("Player3");
            Players player4 = new Players("Player4");
            
            playersArray = new Players[] {player1, player2, player3, player4};
            
            
            
           /* for(int i=0; i<4; i++){
                  
                  Queue tempQ = new Queue();
                  Players tempPlayer = playersArray[i];
                  Card nullCard = new Card();
                  
                  //grabs only l4
                  nullCard.setCardPlayerName(playersArray[i].getName());
                  String pName = nullCard.getCardPlayerName();
                  tempQ = tempPlayer.playerHand;
                  tempQ.enQueue(nullCard);
                  //fills first nodes in queues with null values
                  //System.out.println("null hands: " + playersArray[i%4].playerHand + i + playersArray[i].getName());
            }*/
         /*
            for (int i =0; i<d.getSize(); i++){ //iterates through index objects
                  Card referenceAdd = d.get(i);
                  //System.out.print(referenceAdd);
                  if (i%4==0){
                        player1.playerHand.enQueue(referenceAdd);
                        System.out.println("Player1's hand:" + playersArray[0].playerHand + i);
                  } else if (i%4==1){
                        player2.playerHand.enQueue(referenceAdd);
                        System.out.println(player1.getName() + " hand:" + playersArray[1].playerHand + i);
                  }else if (i%4==2) {
                        player3.playerHand.enQueue(referenceAdd);
                        System.out.println("Player3's hand:" + playersArray[2].playerHand + i);
                  } else if (i%4==3) {
                        player4.playerHand.enQueue(referenceAdd);
                        System.out.println("Player4's hand:" + playersArray[3].playerHand + i);
                  }
            */
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