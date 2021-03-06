//deck accessed by main declared as arraylist
//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/
//shuffle referenece:  https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES
public class Queue {
      private QNode front, rear;   //QUEUE POINTERS
      private int size=0;    //# of nodes
      
      // front, rear, & size are methods of a queue. first in first out
      
      //default constructor creates the queue
      public Queue() {
            this.front=this.rear=null; //in the beginning front is same as rear because queue is empty
            return;
      }
      
      public void addQueue(Card card) {          // this method adds elements to the Queue
            //first create new node
            QNode temp = new QNode(card);
            if (this.rear ==null) {
                  this.front = this.rear = temp;  //set new node to front and rear pointers if it's the only one
                  return;
            }
            
            this.rear.next=temp;    //add to end of queue
            this.rear = temp;       //set rear pointer to temp
            size++;
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
            size--;
            return temp;            //return deleted element
      }
      
      public int getSize(){
            return this.size;
      }
      
      
      public QNode peek() { //returns element at front
            if (size<0) {
                  System.out.println("queue does not contain anything yet!");
            }
            return this.front;
      }
      
      //method to display contents of the queue
      public String toString() {
            String value = "";
            QNode temp = front; //iterator to go over the nodes starting at the head
            if(temp == null)
            {
                  value += "   |   " + temp;
                  
            }
            while(temp.next !=null) { //while there is still a next
                  value += "   |   " + temp.next.card;  //get node data
                  temp = temp.next;				// move to next node
            }
            return value;
      }
      
}