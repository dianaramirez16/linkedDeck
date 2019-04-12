// reference for shuffle method: https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
import java.util.Random;

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
            String playerName="Player";
            for (int i =1; i<5; i++){  //loops 4 times to create 4 players
                  //create players by calling Players method
                  new Players("player"+i);
                  
                  System.out.println(Players.getName());  //prints players
            }
      }
      
      public static void shuffleList(ArrayList<Card> a) {
            int n = a.size();
            Random random = new Random();
            random.nextInt();
            for (int i = 0; i < n; i++) {
                  int change = i + random.nextInt(n - i);
                  swap(a, i, change);
            }
      }
      
      //method to select random player to start
      //
      
    /*  public static String deckAdd(Card addCard) {
            String s = "";
            
      }
      
      */
      
}