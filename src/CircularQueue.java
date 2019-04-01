// Author: Diana Ramirez
// Queue implementation using circular array

public class CircularQueue {
      // front, rear, & size
      
      //Data
      private Object[] Q;     //array reference for the actual queue. queue is null atm
      private int front;      //front of queue
      private int rear;	    //rear of queue
      private int size;       //number of elements in the queue
      private int capacity;   //max elements in queue
      private final int DEFAULT_CAPACITY=5; // default cap
      
      //default constructor creates the queue
      public CircularQueue () {
            Q = new Object[this.DEFAULT_CAPACITY];
            //now default is set, initialize other variables
            this.front=0;
            this.rear=0;
            this.size=0;
            this.capacity= this.DEFAULT_CAPACITY;
      }
      
      //overloaded constructor that will change the size 
      public CircularQueue(int capacity) {
            this.capacity= capacity;
            Q = new Object[this.capacity];
            this.front=0;
            this.rear=0;
            this.size=0;
      }
      
      
      public void offer(Object obj) {
            // this method adds elements to the Queue
            // first check capacity/size for space
            if(this.isFull()) { //the queue is full
                  System.out.println("The Queue is full, cannot insert!");
                  return;
            }
            // there is space to insert data REAR ONLY
            Q[rear] = obj;  //data is inserted
            rear = (rear +1)%capacity;	//update rear for next data using MODULUS b/c it is a circular array
            size++;			//update # of elements in the queue
      }
      
      
      public Object poll() {
            // this method deletes an element from the Queue
            // first check if there is an element to delete
            if(isEmpty()) {   //there is nothing in the queue
                  return null;
            }
            //remove elements ONLY FROM THE FRONT
            Object temp = Q[front];   //saves element to return to temp var
            Q[front] = null;  		  //makes space emepty, actual deletion
            front = (front +1) % capacity; //updates front var, don't forget MOD
            size--;			       //update size
            return temp;	       //return deleted element
      }
      
      
      public boolean isEmpty() {
            // empty if size is 0
            return (size==0);
      }
      
      
      public Boolean isFull() {
		/* checks whether the queue is full or not
		 if(capacoty ==szie) { return true;}
		 else return false; */
            return (capacity ==size);   //short hand
      }
      
      
      public Object peek() {
            if (size==0) {
                  System.out.println("queue does not contain anything yet!");
            }
            return Q[front];
      }
      
      //method to display contents of the queue
      public String toString() {
            String S="Q: ";
            //keep in mind circular array has no "front"
            //we need to find the front using modulus
            //there might be elements in the middle of the array that are empty so index will not be helpful here
		/*we will loop over the actual elements in the queue
		for (int i=front; i< front + size; i++) {
			S+= " | " + Q[i%capacity];   //to point to data use mod
		}
		*/
            for (int i=0; i<Q.length; i++) {
                  S+= " | " + Q[i];   //to point to data use mod
            }
            return S;
            
      }
      
}