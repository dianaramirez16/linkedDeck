public class menuClient {
      public static void main(String[] args) {
            singleLinkedList list = new singleLinkedList();
            CircularQueue Q = new CircularQueue();
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
            Q.offer(10); System.out.println(Q);
            Q.offer(20); System.out.println(Q);
            Q.offer(30); System.out.println(Q);
            Q.offer(40); System.out.println(Q);
      
            Q.poll(); System.out.println(Q);
            Q.poll(); System.out.println(Q);
            Q.offer(50); System.out.println(Q);
            Q.poll(); System.out.println(Q);
            Q.offer(60); System.out.println(Q);
            Q.offer(70); System.out.println(Q);
            Q.offer(80); System.out.println(Q);
            Q.offer(90); System.out.println(Q);
      
      }

}
