// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES

// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;

public class menuClient {
      static Queue tableQueue = new Queue();
      static Queue player1 = new Queue();   //change to QUEUE or use only QUEUE methods
      static Queue player2 = new Queue();   //change to QUEUE or use only QUEUE methods
      static Queue player3 = new Queue();   //change to QUEUE or use only QUEUE methods
      static Queue player4 = new Queue();   //change to QUEUE or use only QUEUE methods
      
      public static void main(String[] args) {
            ArrayList<Card> d = Deck.newDeck();
            Deck.shuffleList(d); //shuffles & prints shuffled
            dealCards(d);  //deals and declares players
            startGame();
      }
      
      
      public static void dealCards(ArrayList<Card> d) {
            for(int i=0; i<4; i++){
            
                  Queue tempQ = new Queue();
                  Players tempPlayer = new Players("temp");
                  Card nullCard = new Card();
            
                  //grabs only 4
                  
                  String pName = nullCard.getCardPlayerName();
                  
                  tempQ.addQueue(nullCard);
                  
            }
      
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
            System.out.println("----- Round 1: \n");
            playOrder(randomPlayer, firstCard1, firstCard2, firstCard3, firstCard4); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard1 = findWinningCard(firstCard1,firstCard2,firstCard3,firstCard4);  //returns card obj
            int roundWinner1 = findWinner(winningCard1, firstCard1, firstCard2, firstCard3,firstCard4);  //returns players object
            clearTable(tableQueue);
            
      //------------------------ round 2

            QNode tempNode5 = player1.peek();   //prints first variable
            QNode tempNode6 = player2.peek();
            QNode tempNode7 = player3.peek();
            QNode tempNode8 = player4.peek();
            Card secondCard1 = tempNode5.getCard();
            Card secondCard2 = tempNode6.getCard();
            Card secondCard3 = tempNode7.getCard();
            Card secondCard4 = tempNode8.getCard();
            System.out.println("\n----- Round 2: \n");
            playOrder(roundWinner1, secondCard1, secondCard2, secondCard3,secondCard4); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard2 = findWinningCard(secondCard1,secondCard2,secondCard3,secondCard4);  //returns card obj
            int roundWinner2 = findWinner(winningCard2, secondCard1,secondCard2,secondCard3,secondCard4);  //returns players object
            clearTable(tableQueue);
            
      //------------------------ round 3
            
            QNode tempNode9 = player1.peek();   //prints first variable
            QNode tempNode10 = player2.peek();
            QNode tempNode11 = player3.peek();
            QNode tempNode12 = player4.peek();
            Card thirdCard1 = tempNode9.getCard();
            Card thirdCard2 = tempNode10.getCard();
            Card thirdCard3 = tempNode11.getCard();
            Card thirdCard4 = tempNode12.getCard();
            System.out.println("\n----- Round 3: \n");
            playOrder(roundWinner2, thirdCard1,thirdCard2,thirdCard3,thirdCard4); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard3 = findWinningCard(thirdCard1,thirdCard2,thirdCard3,thirdCard4);  //returns card obj
            int roundWinner3 = findWinner(winningCard3, thirdCard1,thirdCard2,thirdCard3,thirdCard4);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 4
      
            QNode thirdNode9 = player1.peek();   //prints first variable
            QNode thirdNode10 = player2.peek();
            QNode thirdNode11 = player3.peek();
            QNode thirdNode12 = player4.peek();
            Card fourthCard1 = thirdNode9.getCard();
            Card fourthCard2 = thirdNode10.getCard();
            Card fourthCard3 = thirdNode11.getCard();
            Card fourthCard4 = thirdNode12.getCard();
      
            System.out.println("\n----- Round 4: \n");
            playOrder(roundWinner3, fourthCard1,fourthCard2,fourthCard3,fourthCard4); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard4 = findWinningCard(fourthCard1,fourthCard2,fourthCard3,fourthCard4);  //returns card obj
            int roundWinner4 = findWinner(winningCard4, fourthCard1,fourthCard2,fourthCard3,fourthCard4);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 5
      
            QNode thirdNode1 = player1.peek();   //prints first variable
            QNode thirdNode2 = player2.peek();
            QNode thirdNode3 = player3.peek();
            QNode thirdNode4 = player4.peek();
            Card fifthCard1 = thirdNode1.getCard();
            Card fifthCard2 = thirdNode2.getCard();
            Card fifthCard3 = thirdNode3.getCard();
            Card fifthCard4 = thirdNode4.getCard();
            
            System.out.println("\n----- Round 5: \n");
            playOrder(roundWinner4, fifthCard1,fifthCard2,fifthCard3,fifthCard4); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard5 = findWinningCard(fifthCard1,fifthCard2,fifthCard3,fifthCard4);  //returns card obj
            int roundWinner5 = findWinner(winningCard5, fifthCard1,fifthCard2,fifthCard3,fifthCard4);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 6
            QNode fourthNode1 = player1.peek();   //prints first variable
            QNode fourthNode2 = player2.peek();
            QNode fourthNode3 = player3.peek();
            QNode fourthNode4 = player4.peek();
            Card sixthCard5 = fourthNode1.getCard();
            Card sixthCard6 = fourthNode2.getCard();
            Card sixthCard7 = fourthNode3.getCard();
            Card sixthCard8 = fourthNode4.getCard();
            
            System.out.println("\n----- Round 6: \n");
            playOrder(roundWinner5, sixthCard5,sixthCard6,sixthCard7,sixthCard8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard6 = findWinningCard(sixthCard5,sixthCard6,sixthCard7,sixthCard8);  //returns card obj
            int roundWinner6 = findWinner(winningCard6, sixthCard5,sixthCard6,sixthCard7,sixthCard8);  //returns players object
            clearTable(tableQueue);
            
      //------------------------ round 7
            QNode sixthNode1 = player1.peek();   //prints first variable
            QNode sixthNode2 = player2.peek();
            QNode sixthNode3 = player3.peek();
            QNode sixthNode4 = player4.peek();
            Card seventh5 = sixthNode1.getCard();
            Card seventh6 = sixthNode2.getCard();
            Card seventh7 = sixthNode3.getCard();
            Card seventh8 = sixthNode4.getCard();
      
            System.out.println("\n----- Round 7: \n");
            playOrder(roundWinner6, seventh5,seventh6,seventh7,seventh8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard7 = findWinningCard(seventh5,seventh6,seventh7,seventh8);  //returns card obj
            int roundWinner7 = findWinner(winningCard7, seventh5,seventh6,seventh7,seventh8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 8
            QNode eigthNode1 = player1.peek();   //prints first variable
            QNode eigthNode2 = player2.peek();
            QNode eigthNode3 = player3.peek();
            QNode eigthNode4 = player4.peek();
            Card eigth5 = eigthNode1.getCard();
            Card eigth6 = eigthNode2.getCard();
            Card eigth7 = eigthNode3.getCard();
            Card eigth8 = eigthNode4.getCard();
      
            System.out.println("\n----- Round 8: \n");
            playOrder(roundWinner7, eigth5,eigth6,eigth7,eigth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard8 = findWinningCard(eigth5,eigth6,eigth7,eigth8);  //returns card obj
            int roundWinner8 = findWinner(winningCard8, eigth5,eigth6,eigth7,eigth8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 9
            QNode ninthNode1 = player1.peek();   //prints first variable
            QNode ninthNode2 = player2.peek();
            QNode ninthNode3 = player3.peek();
            QNode ninthNode4 = player4.peek();
            Card ninth5 = ninthNode1.getCard();
            Card ninth6 = ninthNode2.getCard();
            Card ninth7 = ninthNode3.getCard();
            Card ninth8 = ninthNode4.getCard();
      
            System.out.println("\n----- Round 9: \n");
            playOrder(roundWinner8, ninth5,ninth6,ninth7,ninth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard9 = findWinningCard(ninth5,ninth6,ninth7,ninth8);  //returns card obj
            int roundWinner9 = findWinner(winningCard9, ninth5,ninth6,ninth7,ninth8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 10
            QNode tenthNode1 = player1.peek();   //prints first variable
            QNode tenthNode2 = player2.peek();
            QNode tenthNode3 = player3.peek();
            QNode tenthNode4 = player4.peek();
            Card tenth5 = tenthNode1.getCard();
            Card tenth6 = tenthNode2.getCard();
            Card tenth7 = tenthNode3.getCard();
            Card tenth8 = tenthNode4.getCard();
      
            System.out.println("\n----- Round 10: \n");
            playOrder(roundWinner9, tenth5,tenth6,tenth7,tenth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard10 = findWinningCard(tenth5,tenth6,tenth7,tenth8);  //returns card obj
            int roundWinner10 = findWinner(winningCard10, tenth5,tenth6,tenth7,tenth8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 11
            QNode eleventhNode1 = player1.peek();   //prints first variable
            QNode eleventhNode2 = player2.peek();
            QNode eleventhNode3 = player3.peek();
            QNode eleventhNode4 = player4.peek();
            Card eleventh5 = eleventhNode1.getCard();
            Card eleventh6 = eleventhNode2.getCard();
            Card eleventh7 = eleventhNode3.getCard();
            Card eleventh8 = eleventhNode4.getCard();
      
            System.out.println("\n----- Round 11: \n");
            playOrder(roundWinner10, eleventh5,eleventh6,eleventh7,eleventh8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard11 = findWinningCard(eleventh5,eleventh6,eleventh7,eleventh8);  //returns card obj
            int roundWinner11 = findWinner(winningCard11, eleventh5,eleventh6,eleventh7,eleventh8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 12
            QNode twelfthNode1 = player1.peek();   //prints first variable
            QNode twelfthNode2 = player2.peek();
            QNode twelfthNode3 = player3.peek();
            QNode twelfthNode4 = player4.peek();
            Card twelfth5 = twelfthNode1.getCard();
            Card twelfth6 = twelfthNode2.getCard();
            Card twelfth7 = twelfthNode3.getCard();
            Card twelfth8 = twelfthNode4.getCard();
      
            System.out.println("\n----- Round 12: \n");
            playOrder(roundWinner11, twelfth5,twelfth6,twelfth7,twelfth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard12 = findWinningCard(twelfth5,twelfth6,twelfth7,twelfth8);  //returns card obj
            int roundWinner12 = findWinner(winningCard12, twelfth5,twelfth6,twelfth7,twelfth8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 13
            QNode thirteenthNode1 = player1.peek();   //prints first variable
            QNode thirteenthNode2 = player2.peek();
            QNode thirteenthNode3 = player3.peek();
            QNode thirteenthNode4 = player4.peek();
            Card thirteenth5 = thirteenthNode1.getCard();
            Card thirteenth6 = thirteenthNode2.getCard();
            Card thirteenth7 = thirteenthNode3.getCard();
            Card thirteenth8 = thirteenthNode4.getCard();
      
            System.out.println("\n----- Round 13: \n");
            playOrder(roundWinner12, thirteenth5,thirteenth6,thirteenth7,thirteenth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard13 = findWinningCard(thirteenth5,thirteenth6,thirteenth7,thirteenth8);  //returns card obj
            int roundWinner13 = findWinner(winningCard13, thirteenth5,thirteenth6,thirteenth7,thirteenth8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 14
            QNode fourteenthNode1 = player1.peek();   //prints first variable
            QNode fourteenthNode2 = player2.peek();
            QNode fourteenthNode3 = player3.peek();
            QNode fourteenthNode4 = player4.peek();
            Card fourteenth5 = fourteenthNode1.getCard();
            Card fourteenth6 = fourteenthNode2.getCard();
            Card fourteenth7 = fourteenthNode3.getCard();
            Card fourteenth8 = fourteenthNode4.getCard();
      
            System.out.println("\n----- Round 14: \n");
            playOrder(roundWinner13, fourteenth5,fourteenth6,fourteenth7,fourteenth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard14 = findWinningCard(fourteenth5,fourteenth6,fourteenth7,fourteenth8);  //returns card obj
            int roundWinner14 = findWinner(winningCard14, fourteenth5,fourteenth6,fourteenth7,fourteenth8);  //returns players object
            clearTable(tableQueue);
      
      //------------------------ round 15
            QNode fifteenthNode1 = player1.peek();   //prints first variable
            QNode fifteenthNode2 = player2.peek();
            QNode fifteenthNode3 = player3.peek();
            QNode fifteenthNode4 = player4.peek();
            Card fifteenth5 = fifteenthNode1.getCard();
            Card fifteenth6 = fifteenthNode2.getCard();
            Card fifteenth7 = fifteenthNode3.getCard();
            Card fifteenth8 = fifteenthNode4.getCard();
      
            System.out.println("\n----- Round 15: \n");
            playOrder(roundWinner14, fifteenth5,fifteenth6,fifteenth7,fifteenth8); //prints starting hands
            System.out.println("\nCards on Table: " + tableQueue + "\n");
            Card winningCard15 = findWinningCard(fifteenth5,fifteenth6,fifteenth7,fifteenth8);  //returns card obj
            int roundWinner15 = findWinner(winningCard15, fifteenth5,fifteenth6,fifteenth7,fifteenth8);  //returns players object
            clearTable(tableQueue);
            
            declareWinner(player1, player2, player3, player4);
            
      }
      
      public static void declareWinner(Queue p1, Queue p2, Queue p3, Queue p4){
            System.out.println("size p1 " + p1.getSize());
      }
      
      public static void playOrder(int o, Card c1, Card c2, Card c3, Card c4){
            //method for playOrder accepts randomPlayer int as input for first round
            //return is void
            if (o==1) {
                  System.out.println("Player1 goes first:  " + c1 + player1.toString());
                  System.out.println("Player2 goes next:  " + c2 + player2.toString());
                  System.out.println("Player3 goes third:  " + c3 + player3.toString());
                  System.out.println("Player4 goes last:  " + c4 + player4.toString());
                  tableQueue.addQueue(c1); player1.deQueue();
                  tableQueue.addQueue(c2); player2.deQueue();
                  tableQueue.addQueue(c3); player3.deQueue();
                  tableQueue.addQueue(c4); player4.deQueue();
            } else if (o==2) {
                  System.out.println("Player2 goes first:  " + c2 + player2.toString());
                  System.out.println("Player3 goes next:  " + c3 + player3.toString());
                  System.out.println("Player4 goes third:  " + c4 + player4.toString());
                  System.out.println("Player1 goes last:  " + c1 + player1.toString());
                  tableQueue.addQueue(c2); player2.deQueue();
                  tableQueue.addQueue(c3); player3.deQueue();
                  tableQueue.addQueue(c4); player4.deQueue();
                  tableQueue.addQueue(c1); player1.deQueue();
            } else if (o==3) {
                  System.out.println("Player3 goes first:  " + c3 + player3.toString());
                  System.out.println("Player4 goes next:  " + c4 + player4.toString());
                  System.out.println("Player1 goes third:  " + c1 + player1.toString());
                  System.out.println("Player2 goes last:  " + c2 + player2.toString());
                  
                  tableQueue.addQueue(c3); player3.deQueue();
                  tableQueue.addQueue(c4); player4.deQueue();
                  tableQueue.addQueue(c1); player1.deQueue();
                  tableQueue.addQueue(c2); player2.deQueue();
            } else {
                  System.out.println("Player4 goes first:  " + c4 + player4.toString());
                  System.out.println("Player1 goes next:  " + c1 + player1.toString());
                  System.out.println("Player2 goes third:  " + c2 + player2.toString());
                  System.out.println("Player3 goes last:  " + c3 + player3.toString());
                  tableQueue.addQueue(c4); player4.deQueue();
                  tableQueue.addQueue(c1); player1.deQueue();
                  tableQueue.addQueue(c2); player2.deQueue();
                  tableQueue.addQueue(c3); player3.deQueue();
            }
            
      }
      
      public static int findWinner(Card winningCard1, Card c1, Card c2, Card c3, Card c4){
            // new method for finding winner should accept winning card, and cards played in that round
            // should return winner name: String
            
            if (winningCard1==c1){
                  player1.addQueue(c1); player1.addQueue(c2); player1.addQueue(c3); player1.addQueue(c4);
                  System.out.println("WINNER : Player1 with " + winningCard1);
                  return 1;
            } else if (winningCard1==c2) {
                  player2.addQueue(c1); player2.addQueue(c2); player2.addQueue(c3); player2.addQueue(c4);
                  System.out.println("WINNER : Player2 with " + winningCard1);
                  return 2;
            } else if (winningCard1==c3) {
                  player3.addQueue(c1); player3.addQueue(c2); player3.addQueue(c3); player3.addQueue(c4);
                  System.out.println("WINNER : Player3 with " + winningCard1);
                  return 3;
            } else {
                  player4.addQueue(c1); player4.addQueue(c2); player4.addQueue(c3); player4.addQueue(c4);
                  System.out.println("WINNER : Player4 with " + winningCard1);
                  return 4;
            }
      
            
            
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
 
      public static Queue clearTable(Queue tableQueue){
            tableQueue.deQueue();
            tableQueue.deQueue();
            tableQueue.deQueue();
            tableQueue.deQueue();
            return tableQueue;
      }
}