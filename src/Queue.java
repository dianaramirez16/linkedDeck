// Author: Diana Ramirez
// Queue implementation using circular array

public class Queue {
      private QNode front, rear;   //QUEUE POINTERS
      private int size;    //# of nodes
      
      // front, rear, & size are methods of a queue. first in first out
      
      //Data
      // private Object[] Q;     //array reference for the actual queue. queue is null atm
      // private int capacity;   //max elements in queue
      // private final int DEFAULT_CAPACITY=52; // default cap
      
      //default constructor creates the queue
      public Queue() {
            this.front=this.rear=null; //in the beginning front is same as rear because queue is empty
            return;
      }
      
      public void enQueue(Object obj) {          // this method adds elements to the Queue
            //first create new node
            QNode temp = new QNode(obj);
            if (this.rear ==null) {
                  this.front = this.rear = temp;  //set new node to front and rear pointers if it's the only one
                  return;
            }
            
            this.rear.next=temp;    //add to end of queue
            this.rear = temp;       //set rear pointer to temp
      }
      
      
      public QNode deQueue() {     // this method deletes an element from the Queue
            
            if(this.front==null) {         //there is nothing in the queue
                  return null;
            }
            //remove elements ONLY FROM THE FRONT
            QNode temp = this.front;      // saves element to temp
            this.front = this.front.next; // actual deletion
            
            //update pointers if queue is ever empty again
            if (this.front ==null)
                  this.rear = null;
            return temp;            //return deleted element
      }
      
     
      public QNode peek() { //returns element at front
            if (size==0) {
                  System.out.println("queue does not contain anything yet!");
            }
            return this.front;
      }
      
      //method to display contents of the queue
      public String toString() {
            String value = "List: ";
            QNode temp = front; //iterator to go over the nodes starting at the head
            while(temp.next !=null) { //while there is still a next
                  value += " | " + temp.next.data;  //get node data
                  temp = temp.next;				// move to next node
            }
            return value;
      }
      
}