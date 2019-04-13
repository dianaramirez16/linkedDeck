// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;

public class menuClient {
      static Queue[] playersArray;  // array holds players
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
            for(int i=0; i<4; i++){
            
                  Queue tempQ = new Queue();
                  Players tempPlayer = new Players("temp");
                  Card nullCard = new Card();
            
                  //grabs only 4
                  //nullCard.setCardPlayerName(playersArray[i].getName());
                  String pName = nullCard.getCardPlayerName();
                  
                  tempQ.enQueue(nullCard);
                  //fills first nodes in queues with null values
                  //System.out.println("null hands: " + playersArray[i%4] + i + playersArray[i]);
            }
            
            
            
            //declare new player objects. they contain queue objects
            /*Players playerObj1 = new Players("Player1");
            Players playerObj2 = new Players("Player2");
            Players playerObj3 = new Players("Player3");
            Players playerObj4 = new Players("Player4");*/
            
            playersArray = new Queue[]{player1, player2, player3, player4};
      
            //System.out.println("Player1's hand: " + d.get(0) + " | " + d.get(1) + " | " + d.get(2) + " | " + d.get(3) + "\n\t |" + d.get(4) + " | " + d.get(5) + " | " + d.get(6) + " | " + d.get(7) + "\n\t | " + d.get(8) + " | " + d.get(9) + " | " + d.get(10) + " | " + d.get(11) + " | " + d.get(12));
            player1.enQueue(d.get(0)); player1.enQueue(d.get(1)); player1.enQueue(d.get(2)); player1.enQueue(d.get(3));player1.enQueue(d.get(4)); player1.enQueue(d.get(5)); player1.enQueue(d.get(6)); player1.enQueue(d.get(7));player1.enQueue(d.get(8)); player1.enQueue(d.get(9)); player1.enQueue(d.get(10)); player1.enQueue(d.get(11));player1.enQueue(d.get(12));
            //player 2
            player2.enQueue(d.get(13)); player2.enQueue(d.get(14)); player2.enQueue(d.get(15));player2.enQueue(d.get(16));player2.enQueue(d.get(17));player2.enQueue(d.get(18));player2.enQueue(d.get(19));player2.enQueue(d.get(20));player2.enQueue(d.get(21));player2.enQueue(d.get(22));player2.enQueue(d.get(23));player2.enQueue(d.get(24));player2.enQueue(d.get(25));
            //player3
            player3.enQueue(d.get(26));player3.enQueue(d.get(27));player3.enQueue(d.get(28));player3.enQueue(d.get(29));player3.enQueue(d.get(30));player3.enQueue(d.get(31));player3.enQueue(d.get(32));player3.enQueue(d.get(33));player3.enQueue(d.get(34));player3.enQueue(d.get(35));player3.enQueue(d.get(36));player3.enQueue(d.get(37));player3.enQueue(d.get(38));
            //player4
            player4.enQueue(d.get(39));player4.enQueue(d.get(40));player4.enQueue(d.get(41));player4.enQueue(d.get(42));player4.enQueue(d.get(43));player4.enQueue(d.get(44));player4.enQueue(d.get(45));player4.enQueue(d.get(46));player4.enQueue(d.get(47));player4.enQueue(d.get(48));player4.enQueue(d.get(49));player4.enQueue(d.get(50));player4.enQueue(d.get(51));
      
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
      
            QNode tempNode1 = player1.peek();   //prints first variable
            QNode tempNode2 = player2.peek();
            QNode tempNode3 = player3.peek();
            QNode tempNode4 = player4.peek();
            Card firstCard1 = tempNode1.getCard();
            Card firstCard2 = tempNode2.getCard();
            Card firstCard3 = tempNode3.getCard();
            Card firstCard4 = tempNode4.getCard();
            
            System.out.println("Round 1: \n");
            System.out.println("Player1's hand:  " + firstCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + firstCard2 + player2.toString());
            System.out.println("Player3's hand:  " + firstCard3 + player3.toString());
            System.out.println("Player4's hand:  " + firstCard4 + player4.toString());
            
            //player 1 plays
            tableQueue.enQueue(firstCard1);
            player1.deQueue();
            
            //player 2 plays
            tableQueue.enQueue(firstCard2);
            player2.deQueue();
            
            //player 3 plays
            tableQueue.enQueue(firstCard3);
            player3.deQueue();
            
            //player 4 plays:
            tableQueue.enQueue(firstCard4);
            player4.deQueue();
            
            randomPlayer++; //random player incremented
            
            /*
            QNode tempNode = playersArray[randomPlayer].peek();   //first qnode in rand players deck
            Card cardPlayed = tempNode.getCard();
            tableQueue.enQueue(cardPlayed);*/
            
            System.out.println("\ntable: " + tableQueue + "\n");
      
            QNode tempNode5 = player1.peek();   //prints first variable
            QNode tempNode6 = player2.peek();
            QNode tempNode7 = player3.peek();
            QNode tempNode8 = player4.peek();
            Card secondCard1 = tempNode5.getCard();
            Card secondCard2 = tempNode6.getCard();
            Card secondCard3 = tempNode7.getCard();
            Card secondCard4 = tempNode8.getCard();
      
            System.out.println("Winner: ");
            
            
            
            
            System.out.println("Round 2: \n");
            System.out.println("Player1's hand:  " + secondCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + secondCard2 + player2.toString());
            System.out.println("Player3's hand:  " + secondCard3 + player3.toString());
            System.out.println("Player4's hand:  " + secondCard4 + player4.toString());
      
      
      }

      public static Card findWinner(Card card1, Card card2, Card card3, Card card4) {
            Card winningCard = null;
            //4 > 3
            if (Card.equalsTo(card1, card2)) { //card 1 > 2
                  if (Card.equalsTo(card1, card3)) { //card 1 > 3
                        if (Card.equalsTo(card1, card4)) {//card 1 > all
                              return winningCard = card1;
                        } else return winningCard = card4; //card 4 > all
                  } else if (Card.equalsTo(card3, card4)) { // card 3 > all
                        return winningCard = card3;
                  } else return winningCard = card4;
            }else if (Card.equalsTo(card2, card3)) { //card 2 > 3
                  if (Card.equalsTo(card2, card4)){ //card 2 > 4
                        return winningCard = card2;
                  } else return winningCard = card4;
            } else if (Card.equalsTo(card3, card4)) { //card 3 is greater
                  return winningCard = card3;
            } else return winningCard = card4;
            
      }
 
}