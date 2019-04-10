//this is the node for the single linked list
public class QNode {
      //data
      Object data;
      //link
      Node next;
      
      //constructors
      //default constructors
      public QNode(Object data) {
            this.data = data;  //assign given data
            this.next = null;  //by default there is no next node
      }
      
      //overloaded constructor
      //creates a node and points it to another node
      public QNode(Object data, Node next) {
            this.data = data;
            this.next = next;
      }
      
      
      
}