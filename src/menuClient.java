// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES

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
                  
                  tempQ.addQueue(nullCard);
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
            player1.addQueue(d.get(0)); player1.addQueue(d.get(1)); player1.addQueue(d.get(2)); player1.addQueue(d.get(3));player1.addQueue(d.get(4)); player1.addQueue(d.get(5)); player1.addQueue(d.get(6)); player1.addQueue(d.get(7));player1.addQueue(d.get(8)); player1.addQueue(d.get(9)); player1.addQueue(d.get(10)); player1.addQueue(d.get(11));player1.addQueue(d.get(12));
            //player 2
            player2.addQueue(d.get(13)); player2.addQueue(d.get(14)); player2.addQueue(d.get(15));player2.addQueue(d.get(16));player2.addQueue(d.get(17));player2.addQueue(d.get(18));player2.addQueue(d.get(19));player2.addQueue(d.get(20));player2.addQueue(d.get(21));player2.addQueue(d.get(22));player2.addQueue(d.get(23));player2.addQueue(d.get(24));player2.addQueue(d.get(25));
            //player3
            player3.addQueue(d.get(26));player3.addQueue(d.get(27));player3.addQueue(d.get(28));player3.addQueue(d.get(29));player3.addQueue(d.get(30));player3.addQueue(d.get(31));player3.addQueue(d.get(32));player3.addQueue(d.get(33));player3.addQueue(d.get(34));player3.addQueue(d.get(35));player3.addQueue(d.get(36));player3.addQueue(d.get(37));player3.addQueue(d.get(38));
            //player4
            player4.addQueue(d.get(39));player4.addQueue(d.get(40));player4.addQueue(d.get(41));player4.addQueue(d.get(42));player4.addQueue(d.get(43));player4.addQueue(d.get(44));player4.addQueue(d.get(45));player4.addQueue(d.get(46));player4.addQueue(d.get(47));player4.addQueue(d.get(48));player4.addQueue(d.get(49));player4.addQueue(d.get(50));player4.addQueue(d.get(51));
      
      }
      
      
      public static void startGame(){
            Queue tableQueue = new Queue();
            Card nullCard = new Card();
            tableQueue.addQueue(nullCard);
      
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
            tableQueue.addQueue(firstCard1); player1.deQueue();
            
            //player 2 plays
            tableQueue.addQueue(firstCard2); player2.deQueue();
            
            //player 3 plays
            tableQueue.addQueue(firstCard3); player3.deQueue();
            
            //player 4 plays:
            tableQueue.addQueue(firstCard4); player4.deQueue();
            
            System.out.println("\ntable 1: " + tableQueue + "\n");
      
            QNode tempNode5 = player1.peek();   //prints first variable
            QNode tempNode6 = player2.peek();
            QNode tempNode7 = player3.peek();
            QNode tempNode8 = player4.peek();
            Card secondCard1 = tempNode5.getCard();
            Card secondCard2 = tempNode6.getCard();
            Card secondCard3 = tempNode7.getCard();
            Card secondCard4 = tempNode8.getCard();
      
            Card winningCard1 = findWinningCard(firstCard1,firstCard2,firstCard3,firstCard4);
            Players winningPlayer = new Players("Winner");
            
            if (winningCard1==firstCard1){
                  player1.addQueue(firstCard1); player1.addQueue(firstCard2); player1.addQueue(firstCard3); player1.addQueue(firstCard4);
                  winningPlayer.setName("Player1 with " + winningCard1);
            } else if (winningCard1==firstCard2) {
                  player2.addQueue(firstCard1); player2.addQueue(firstCard2); player2.addQueue(firstCard3); player2.addQueue(firstCard4);
                  winningPlayer.setName("Player2 with " + winningCard1);
            } else if (winningCard1==firstCard3) {
                  player3.addQueue(firstCard1); player3.addQueue(firstCard2); player3.addQueue(firstCard3); player3.addQueue(firstCard4);
                  winningPlayer.setName("Player3 with " + winningCard1);
            } else {
                  player4.addQueue(firstCard1); player4.addQueue(firstCard2); player4.addQueue(firstCard3); player4.addQueue(firstCard4);
                  winningPlayer.setName("Player4 with " + winningCard1);
            }
      
            System.out.println("Winner: " + winningPlayer.getName());  //print winner name
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
            player1.deQueue(); player2.deQueue(); player3.deQueue(); player4.deQueue();
            
            
// ---------------------------------------------------
            
            System.out.println("\n-----Round 2: \n");
            System.out.println("Player1's hand:  " + secondCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + secondCard2 + player2.toString());
            System.out.println("Player3's hand:  " + secondCard3 + player3.toString());
            System.out.println("Player4's hand:  " + secondCard4 + player4.toString());
            
            tableQueue.addQueue(secondCard1); tableQueue.addQueue(secondCard2); tableQueue.addQueue(secondCard3); tableQueue.addQueue(secondCard4);
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
      
            Card winningCard2 = findWinningCard(secondCard1,secondCard2,secondCard3,secondCard4);
            System.out.println("Winner: " + winningCard2 );
      
            if (winningCard2==secondCard1){
                  player1.addQueue(secondCard1); player1.addQueue(secondCard2); player1.addQueue(secondCard3); player1.addQueue(secondCard4);
            } else if (winningCard2==secondCard2) {
                  player2.addQueue(secondCard1); player2.addQueue(secondCard2); player2.addQueue(secondCard3); player2.addQueue(secondCard4);
            } else if (winningCard2==secondCard3) {
                  player3.addQueue(secondCard1); player3.addQueue(secondCard2); player3.addQueue(secondCard3); player3.addQueue(secondCard4);
            } else {
                  player4.addQueue(secondCard1); player4.addQueue(secondCard2); player4.addQueue(secondCard3); player4.addQueue(secondCard4);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
            
      // ---------------------------------------------------
            
           System.out.println("\n-----Round 3: \n");
            System.out.println("Player1's hand:  " + thirdCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + thirdCard2 + player2.toString());
            System.out.println("Player3's hand:  " + thirdCard3 + player3.toString());
            System.out.println("Player4's hand:  " + thirdCard4 + player4.toString());
      
            tableQueue.addQueue(thirdCard1); tableQueue.addQueue(thirdCard2); tableQueue.addQueue(thirdCard3); tableQueue.addQueue(thirdCard4);
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
      
            Card winningCard3 = findWinningCard(thirdCard1,thirdCard2,thirdCard3,thirdCard4);
            System.out.println("Winner: " + winningCard3 );
      
            if (winningCard3==fourthCard1){
                  player1.addQueue(fourthCard1); player1.addQueue(fourthCard2); player1.addQueue(fourthCard3); player1.addQueue(fourthCard4);
            } else if (winningCard3==fourthCard2) {
                  player2.addQueue(fourthCard1); player2.addQueue(fourthCard2); player2.addQueue(fourthCard3); player2.addQueue(fourthCard4);
            } else if (winningCard3==fourthCard3) {
                  player3.addQueue(fourthCard1); player3.addQueue(fourthCard2); player3.addQueue(fourthCard3); player3.addQueue(fourthCard4);
            } else {
                  player4.addQueue(fourthCard1); player4.addQueue(fourthCard2); player4.addQueue(fourthCard3); player4.addQueue(fourthCard4);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
      
      // ---------------------------------------------------
      
            System.out.println("\n-----Round 4: \n");
            System.out.println("Player1's hand:  " + fourthCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + fourthCard2 + player2.toString());
            System.out.println("Player3's hand:  " + fourthCard3 + player3.toString());
            System.out.println("Player4's hand:  " + fourthCard4 + player4.toString());
      
            tableQueue.addQueue(fourthCard1); tableQueue.addQueue(fourthCard2); tableQueue.addQueue(fourthCard3); tableQueue.addQueue(fourthCard4);
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
      
            Card winningCard4 = findWinningCard(fourthCard1,fourthCard2,fourthCard3,fourthCard4);
            System.out.println("Winner: " + winningCard4 );
      
            if (winningCard4==fourthCard1){
                  player1.addQueue(fourthCard5); player1.addQueue(fourthCard6); player1.addQueue(fourthCard7); player1.addQueue(fourthCard8);
            } else if (winningCard4==fourthCard2) {
                  player2.addQueue(fourthCard5); player2.addQueue(fourthCard6); player2.addQueue(fourthCard7); player2.addQueue(fourthCard8);
            } else if (winningCard4==fourthCard3) {
                  player3.addQueue(fourthCard5); player3.addQueue(fourthCard6); player3.addQueue(fourthCard7); player3.addQueue(fourthCard8);
            } else {
                  player4.addQueue(fourthCard5); player4.addQueue(fourthCard6); player4.addQueue(fourthCard8); player4.addQueue(fourthCard8);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
      
      // ---------------------------------------------------
      
            System.out.println("\n-----Round 5: \n");
            System.out.println("Player1's hand:  " + fourthCard1 + player1.toString()); //prints hands
            System.out.println("Player2's hand:  " + fourthCard2 + player2.toString());
            System.out.println("Player3's hand:  " + fourthCard3 + player3.toString());
            System.out.println("Player4's hand:  " + fourthCard4 + player4.toString());
      
            tableQueue.addQueue(fourthCard1); tableQueue.addQueue(fourthCard2); tableQueue.addQueue(fourthCard3); tableQueue.addQueue(fourthCard4);
            player1.deQueue();player2.deQueue();player3.deQueue();player4.deQueue();
            System.out.println("\ntable 3 : " + tableQueue + "\n");
      
            QNode fourthNode1 = player1.peek();   //prints first variable
            QNode fourthNode2 = player2.peek();
            QNode fourthNode3 = player3.peek();
            QNode fourthNode4 = player4.peek();
            Card fourth5 = fourthNode1.getCard();
            Card fourth6 = fourthNode2.getCard();
            Card fourth7 = fourthNode3.getCard();
            Card fourth8 = fourthNode4.getCard();
      
            Card winningCard5 = findWinningCard(fourth5,fourth6,fourth7,fourth8);
            System.out.println("Winner: " + winningCard5 );
      
            if (winningCard5==fourth5){
                  player1.addQueue(fourth5); player1.addQueue(fourth6); player1.addQueue(fourth7); player1.addQueue(fourth8);
            } else if (winningCard5==fourth6) {
                  player2.addQueue(fourth5); player2.addQueue(fourth6); player2.addQueue(fourth7); player2.addQueue(fourth8);
            } else if (winningCard5==fourth7) {
                  player3.addQueue(fourth5); player3.addQueue(fourth6); player3.addQueue(fourth7); player3.addQueue(fourth8);
            } else {
                  player4.addQueue(fourth5); player4.addQueue(fourth6); player4.addQueue(fourth8); player4.addQueue(fourth8);
            }
            tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();tableQueue.deQueue();
      
      
      
      
      }

      public static Card findWinningCard(Card card1, Card card2, Card card3, Card card4) {
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