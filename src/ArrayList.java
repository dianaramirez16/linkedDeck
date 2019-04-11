public class ArrayList <E> implements ArrayInterface<E> {
      
      private int size; //how many elements in the AL
      private int capacity; //how big is the AL
      private E[] myArray; //this does not create the array,
      //that comes in the constructor later.
      //this is a reference to the actual array
      
      //constructors
      //default constructor, creates an array list of size 5
      public ArrayList(ArrayList<Card> protoDeck) {
            this.capacity =52;
            this.size =0;  //initially there is no data
            myArray = (E[]) new Object[this.capacity]; //creates array at default size
      }
      
      
      //overhead constructor
      public ArrayList(int capacity) {
            this.size=0;
            myArray = (E[]) new Object[this.capacity]; //creates array at default size
      }
      
      public void add(E a) {
            // this method adds an element to the end of the array list
            if (size<capacity) { //if true, there is space
                  myArray[size]=a; // size set to first empty location
                  size++; // keeps track of # of elements in the array
            } else { //false, there is no space to add
                  System.out.print("not enough space, call reallocate method");
                  this.reallocate();
                  this.add(a);
            }
            
      }
      
      private void reallocate() {
            // double capacity of array list
            this.capacity*=2;
            E[] temp= (E[]) new Object[this.capacity];
            //creates empty array double the size
            //next step is to copy over elements to new array
            for(int i=0; i< myArray.length; i++) {
                  temp[i] = myArray[i];
            }
            //updates the reference to point to the new array
            this.myArray =temp;
      }
      
      
      
      public void add(int index, E a) {
            // this method will add data to given index
            // check if index is valid
            if (index<0 ||index> size) {
                  System.out.println("invalid index");
                  return;
            } else if (index ==size) { //indicates element needs to be added at the end of the array
                  //method already exists for adding the end, call it here
                  this.add(a);
            } else {
                  //data will be inserted by shifting the elements
                  //check if there is space to shift
                  if (this.capacity ==this.size) { //means array is full if true
                        //need to call reallocate method if full
                        this.reallocate();
                  } else { //space is available
                        //shift from end to index, right to left by 1
                        for(int i=size-1; i>index; i--) {
                              this.myArray[i] = this.myArray[i-1];
                        }
                        
                        this.myArray[index]=a;
                        this.size++; // updates the number of elements
                  }
                  
            }
      }
      
      
      public E remove(int index) {
            // this method deletes an element from the given index
            // make sure the index is valid
            if (index<0 || index >=size) {
                  System.out.println("Invalid index!");
                  return null;  //programs expects return, so just enter null
            }
            // here we will save the element to be deleted in a temp
            E temp = myArray[index];
            // then we will shift elements to the left
            for(int i =index; i<size -1; i++) {
                  this.myArray[i] = this.myArray[i+1];
            }
            //now we update the size of the array because an element has been removed
            size--;
            return temp;
      }
      
      
      public E get(int index) {
            
            /// --- copied from remove method ---
            if (index<0 || index >=size) {
                  System.out.println("Invalid index!");
                  return null;  //programs expects return, so just enter null
            }
            /// --- end copy----
            return myArray[index];
      }
      
      
      
      public void set(int index, E a) {
            //replaces element at given index
            //first check if index is valid
            if (index < 0 || index > size) { //index outside of range
                  System.out.println("boo! invalid index");
                  return;
            }
            myArray[index] = a;
            
      }
      
      
      public int getSize() {
            return this.size;
      }
      
      
      public int indexOf(E a) {
            // return the index of the value being searched
            
            for (int i=0; i<size; i++) {
                  //go over array and check all elements
                  if (myArray[i].equals(a)) {
                        return 1;
                  }
            }
            return -1; // if nothing is matched to search, then element is not found
      }
      
      //if any of these are removed then it becomes an abstract class
      //you can add any methods to this list
      
      //create method to print arrayList
      //override for the toString method needed
      public String toString() {
            System.out.println("AL: ");
            String s = " ";
            for (int i =0; i<size; i++) { //concatenates and formats print out of data
                  s = s+myArray[i] + " | ";
            }
            return s;
      }
      
}