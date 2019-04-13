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
            
      //----------------------- round 1
      
            QNode tempNode1 = player1.peek();   //prints first variable inside player's hands
            QNode tempNode2 = player2.peek();
            QNode tempNode3 = player3.peek();
            QNode tempNode4 = player4.peek();
            Card firstCard1 = tempNode1.getCard();
            Card firstCard2 = tempNode2.getCard();
            Card firstCard3 = tempNode3.getCard();
            Card firstCard4 = tempNode4.getCard();
            
            System.out.println("-----Round 1: \n");
            System.out.println("Player1's hand:  " + firstCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + firstCard2 + player2.toString());
            System.out.println("Player3's hand:  " + firstCard3 + player3.toString());
            System.out.println("Player4's hand:  " + firstCard4 + player4.toString());
            
            //player 1 plays
            tableQueue.enQueue(firstCard1); player1.deQueue();
            
            //player 2 plays
            tableQueue.enQueue(firstCard2); player2.deQueue();
            
            //player 3 plays
            tableQueue.enQueue(firstCard3); player3.deQueue();
            
            //player 4 plays:
            tableQueue.enQueue(firstCard4); player4.deQueue();
            
            System.out.println("\ntable 1: " + tableQueue + "\n");
      
            QNode tempNode5 = player1.peek();   //prints first variable
            QNode tempNode6 = player2.peek();
            QNode tempNode7 = player3.peek();
            QNode tempNode8 = player4.peek();
            Card secondCard1 = tempNode5.getCard();
            Card secondCard2 = tempNode6.getCard();
            Card secondCard3 = tempNode7.getCard();
            Card secondCard4 = tempNode8.getCard();
      
            Card winningCard1 = findWinner(firstCard1,firstCard2,firstCard3,firstCard4);
            System.out.println("Winner: " + winningCard1 );
            
            if (winningCard1==firstCard1){
                  player1.enQueue(firstCard1); player1.enQueue(firstCard2); player1.enQueue(firstCard3); player1.enQueue(firstCard4);
            } else if (winningCard1==firstCard2) {
                  player2.enQueue(firstCard1); player2.enQueue(firstCard2); player2.enQueue(firstCard3); player2.enQueue(firstCard4);
            } else if (winningCard1==firstCard3) {
                  player3.enQueue(firstCard1); player3.enQueue(firstCard2); player3.enQueue(firstCard3); player3.enQueue(firstCard4);
            } else {
                  player4.enQueue(firstCard1); player4.enQueue(firstCard2); player4.enQueue(firstCard3); player4.enQueue(firstCard4);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
            player1.deQueue(); player2.deQueue(); player3.deQueue(); player4.deQueue();
            
            
// ---------------------------------------------------
            
            System.out.println("\n-----Round 2: \n");
            System.out.println("Player1's hand:  " + secondCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + secondCard2 + player2.toString());
            System.out.println("Player3's hand:  " + secondCard3 + player3.toString());
            System.out.println("Player4's hand:  " + secondCard4 + player4.toString());
            
            tableQueue.enQueue(secondCard1); tableQueue.enQueue(secondCard2); tableQueue.enQueue(secondCard3); tableQueue.enQueue(secondCard4);
            player1.deQueue();player2.deQueue();player3.deQueue();player4.deQueue();
            System.out.println("\ntable 2: " + tableQueue + "\n");
      
            QNode tempNode9 = player1.peek();   //prints first variable
            QNode tempNode10 = player2.peek();
            QNode tempNode11 = player3.peek();
            QNode tempNode12 = player4.peek();
            Card thirdCard1 = tempNode9.getCard();
            Card thirdCard2 = tempNode10.getCard();
            Card thirdCard3 = tempNode11.getCard();
            Card thirdCard4 = tempNode12.getCard();
      
            Card winningCard2 = findWinner(secondCard1,secondCard2,secondCard3,secondCard4);
            System.out.println("Winner: " + winningCard2 );
      
            if (winningCard2==secondCard1){
                  player1.enQueue(secondCard1); player1.enQueue(secondCard2); player1.enQueue(secondCard3); player1.enQueue(secondCard4);
            } else if (winningCard2==secondCard2) {
                  player2.enQueue(secondCard1); player2.enQueue(secondCard2); player2.enQueue(secondCard3); player2.enQueue(secondCard4);
            } else if (winningCard2==secondCard3) {
                  player3.enQueue(secondCard1); player3.enQueue(secondCard2); player3.enQueue(secondCard3); player3.enQueue(secondCard4);
            } else {
                  player4.enQueue(secondCard1); player4.enQueue(secondCard2); player4.enQueue(secondCard3); player4.enQueue(secondCard4);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
            
      // ---------------------------------------------------
            
           System.out.println("\n-----Round 3: \n");
            System.out.println("Player1's hand:  " + thirdCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + thirdCard2 + player2.toString());
            System.out.println("Player3's hand:  " + thirdCard3 + player3.toString());
            System.out.println("Player4's hand:  " + thirdCard4 + player4.toString());
      
            tableQueue.enQueue(thirdCard1); tableQueue.enQueue(thirdCard2); tableQueue.enQueue(thirdCard3); tableQueue.enQueue(thirdCard4);
            player1.deQueue();player2.deQueue();player3.deQueue();player4.deQueue();
            System.out.println("\ntable 3 : " + tableQueue + "\n");
      
            QNode thirdNode9 = player1.peek();   //prints first variable
            QNode thirdNode10 = player2.peek();
            QNode thirdNode11 = player3.peek();
            QNode thirdNode12 = player4.peek();
            Card fourthCard1 = thirdNode9.getCard();
            Card fourthCard2 = thirdNode10.getCard();
            Card fourthCard3 = thirdNode11.getCard();
            Card fourthCard4 = thirdNode12.getCard();
      
            Card winningCard3 = findWinner(thirdCard1,thirdCard2,thirdCard3,thirdCard4);
            System.out.println("Winner: " + winningCard3 );
      
            if (winningCard3==fourthCard1){
                  player1.enQueue(fourthCard1); player1.enQueue(fourthCard2); player1.enQueue(fourthCard3); player1.enQueue(fourthCard4);
            } else if (winningCard3==fourthCard2) {
                  player2.enQueue(fourthCard1); player2.enQueue(fourthCard2); player2.enQueue(fourthCard3); player2.enQueue(fourthCard4);
            } else if (winningCard3==fourthCard3) {
                  player3.enQueue(fourthCard1); player3.enQueue(fourthCard2); player3.enQueue(fourthCard3); player3.enQueue(fourthCard4);
            } else {
                  player4.enQueue(fourthCard1); player4.enQueue(fourthCard2); player4.enQueue(fourthCard3); player4.enQueue(secondCard4);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
      
      // ---------------------------------------------------
      
            System.out.println("\n-----Round 4: \n");
            System.out.println("Player1's hand:  " + fourthCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + fourthCard2 + player2.toString());
            System.out.println("Player3's hand:  " + fourthCard3 + player3.toString());
            System.out.println("Player4's hand:  " + fourthCard4 + player4.toString());
      
            tableQueue.enQueue(fourthCard1); tableQueue.enQueue(fourthCard2); tableQueue.enQueue(fourthCard3); tableQueue.enQueue(fourthCard4);
            player1.deQueue();player2.deQueue();player3.deQueue();player4.deQueue();
            System.out.println("\ntable 3 : " + tableQueue + "\n");
      
            QNode thirdNode1 = player1.peek();   //prints first variable
            QNode thirdNode2 = player2.peek();
            QNode thirdNode3 = player3.peek();
            QNode thirdNode4 = player4.peek();
            Card fourthCard5 = thirdNode1.getCard();
            Card fourthCard6 = thirdNode2.getCard();
            Card fourthCard7 = thirdNode3.getCard();
            Card fourthCard8 = thirdNode4.getCard();
      
            Card winningCard4 = findWinner(fourthCard1,fourthCard2,fourthCard3,fourthCard4);
            System.out.println("Winner: " + winningCard4 );
      
            if (winningCard4==fourthCard1){
                  player1.enQueue(fourthCard1); player1.enQueue(fourthCard2); player1.enQueue(fourthCard3); player1.enQueue(fourthCard4);
            } else if (winningCard4==fourthCard2) {
                  player2.enQueue(fourthCard1); player2.enQueue(fourthCard2); player2.enQueue(fourthCard3); player2.enQueue(fourthCard4);
            } else if (winningCard4==fourthCard3) {
                  player3.enQueue(fourthCard1); player3.enQueue(fourthCard2); player3.enQueue(fourthCard3); player3.enQueue(fourthCard4);
            } else {
                  player4.enQueue(fourthCard1); player4.enQueue(fourthCard2); player4.enQueue(fourthCard3); player4.enQueue(secondCard4);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
      
      
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