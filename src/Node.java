// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES

//this is the node for the single linked list
public class Node {
      //data
      Card card;
      //link
      Node next;
      
      //constructors
      //default constructors
      public Node(Card card) {
            this.card = card;  //assign given card
            this.next = null;  //by default there is no next node
      }
      
      //overloaded constructor
      //creates a node and points it to another node
      public Node(Card card, Node next) {
            this.card = card;
            this.next = next;
      }
      
      
      
}