public class menuClient {
      public static void main(String[] args) {
            singleLinkedList list = new singleLinkedList();
            //linked list
            System.out.println(list);
            list.addFirst(101);
            System.out.println(list);
            list.addFirst(201);
            System.out.println(list);
            list.addLast(333);
            System.out.println(list);
            list.addAfter(444, 10);
            System.out.println(list);
            //Node deleted = (Node)list.removeFirst();
            //System.out.println("the deleted data is: " + deleted.data);
            System.out.println(list);
            list.removeAfter(1);
            System.out.println(list);
            
            // queue
            Queue q = new Queue();
           /* q.enqueue();
            q.enqueue(20);
            q.dequeue();
            q.dequeue();
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
      */
      //    System.out.println("Dequeued item is "+ q.dequeue().key);
            
            //arraylist
            ArrayList<Card> myDeck = Deck.newDeck();
            /*System.out.println(myList);
          *//*  myList.add(10); //no elements, adds to index 0
            myList.add(20);*//*
            System.out.println(myList);
            myList.remove(0);
            System.out.println(myList);
            myList.remove(-1);
            System.out.println(myList);*/
            
            System.out.println(myDeck.toString());
            
            
      }

}
