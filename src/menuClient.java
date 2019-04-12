//import java.util.ArrayList;
public class menuClient {
      
      public static void main(String[] args) {
            ArrayList<Card> d = Deck.newDeck();
            
            /*
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
            q.enqueue();
            q.enqueue(20);
            q.dequeue();
            q.dequeue();
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
      */
      //    System.out.println("Dequeued item is "+ q.dequeue().key);
            //ArrayList<String> myDeck = new ArrayList<>();
            createPlayers();
      }
      
      //method to generate players. each player gets a linked list "hand"
      public static void createPlayers() {
            String[] deck = new String[13];  //placeholder for player's hand. could be linked list
            String playerName="Player";
            for (int i =0; i<4; i++){  //loops 4 times to create 4 players
                  //create players by calling Players method
                  new Players("player"+i);
                  
                  System.out.println(Players.getName());  //prints players
            }
            
      }
      //method to select random player to start
      //
      
    /*  public static String deckAdd(Card addCard) {
            String s = "";
            
      }
      
      */
      
}