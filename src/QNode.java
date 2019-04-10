//this is the node for the QUEUE
//reference: https://www.geeksforgeeks.org/queue-set-2-linked-list-implementation/
public class QNode {
      //data
      Object data;
      //link
      QNode next;
      
      //constructors
      //default constructors
      public QNode(Object data) {
            this.data = data;  //assign given data
            this.next = null;  //by default there is no next node
      }
      
      //overloaded constructor
      //creates a node and points it to another node
      public QNode(Object data, QNode next) {
            this.data = data;
            this.next = next;
      }
      
      
      
}