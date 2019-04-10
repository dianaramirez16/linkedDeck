//single linked list implementation

public class singleLinkedList {
      private Node head;   //head of linked list
      private int size;    //# of nodes
      
      //constructor to create LL
      public singleLinkedList() {
            this.head = new Node(null);   // creates head node
            this.size = 0;  //initializes list to 0 nodes
      }
      
      //addfirst must copy head node "next" to node being inserted
      public void addFirst(Card card) {
            /* step by step :
             * Node first = new Node(card); //creates the node
             * first.next = head.next; //sets next value using head value
             * head.next = first; //updates head.next pointer
             */
            head.next = new Node(card, head.next);
            size++; //add to count size
      }
      
      //addAfter method to insert value after a node
      public void addAfter(Card card, Node target) {
            /* step by step :
             * Node insert = new Node(card); //creates the node
             * insert.next = target.next; //sets next value using head value
             * target.next = insert; //updates head.next pointer
             */
            target.next = new Node(card, target.next);
            size++;
      }
      
      //overload addAfter method
      public void addAfter(Card card, int index) {
            /* step by step:
             * Node target = getNode(index)
             * addAfter(card, target);
             * altogether:
             */
            if(index<0 || index>size) {
                  System.out.println("cannot add at given index.");
                  return;
            }
            addAfter(card, getNode(index));
      }
      
      // method to insert at the end of LL
      public void addLast(Card card) {
            Node target = getNode(size);  //get reference of last node
            this.addAfter(card, target);  //use addAfter() method to insert
      }
      
      private Node getNode(int index) {
            //this method returns the reference of the node at the index
            //first check if index is valid
            if(index<0 || index>size) {
                  return null;
            }
            //otherwise we iterate over the list and return the reference
            Node iter = head; //make copy of head so that it doesn't shift
            for(int i =0; i<index; i++) {
                  iter =iter.next; //keep going to next node
            }
            // at the end of this for loop you are pointing to the index provided
            return iter;
      }
      //method to remove data from the beginning of the list
      public Node removeFirst() {
            //check if there is an object to remove
            if (size==0) {
                  //there is no data
                  System.out.println("there is no data");
                  return null;
            }
            Node temp = head.next; //store in temp reference to return
            head.next = head.next.next; //point the head to the second node or null if there is no other node
            size--;
            return temp;
      }
      
      public Node removeAfter(Node target) {
            Node temp = target.next;   //this is the node being deleted
            if (temp != null) {
                  target.next = temp.next;
                  size--;
            } else {
                  return null;
            }
            return temp;
      }
      
      //method to remove data after a target node
      public Node removeAfter(int target) {
            //check if valid node
            Node temp = getNode(target);
            if( temp !=null) {
                  removeAfter(temp);
            }
            return null;
      }
      
      
      //toString method to print contents of LL
      public String toString() {
            String value = "List: ";
            Node temp = head; //iterator to go over the nodes starting at the head
            while(temp.next !=null) { //while there is still a next
                  value += " | " + temp.next.data;  //get node data
                  temp = temp.next;				// move to next node
            }
            return value;
      }
      
      
      
      //method to print LL in reverse
      private void printReverse() {
            if(size==0) {
                  return;
            }
            printReverse(head.next);
      }
      
      
      //overloaded method that actually prints the list
      private void printReverse(Node current) {
            //steps: we only print a node if the next is null
            //else we print the next nodes data before current
            
            if(current.next==null) { //points at last node, ok to print
                  System.out.print(current.data + " <- ");
            } else { //points at inner node
                  printReverse(current.next);
                  //once the next node is printed, then you can print current
                  System.out.print(current.data + " <- ");
            }
            
            
      }
}