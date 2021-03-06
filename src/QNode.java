//deck accessed by main declared as arraylist
//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/
//shuffle referenece:  https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES
//reference: https://www.geeksforgeeks.org/queue-set-2-linked-list-implementation/

public class QNode {
      //card
      Card card;
      //link
      QNode next;
      
      //constructors
      //default constructors
      public QNode(Card card) {
            this.card = card;  //assign given card
            this.next = null;  //by default there is no next node
      }
      
      //overloaded constructor
      //creates a node and points it to another node
      public QNode(Card card, QNode next) {
            this.card = card;
            this.next = next;
      }
      
      
      public Card getCard() {
            return this.card;
      }
      
      
}