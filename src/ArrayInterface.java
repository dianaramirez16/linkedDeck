
//this is a new interface

public interface ArrayInterface<E> {
      //there are 2 versions of add for arraylist
      public void add (E a); //method adds at the end of the list
      public void add(int index, E a); //overload method; adds at location index
      
      //remove method
      public E remove (int index); //remove from index
      
      //get and set
      public E get (int index); //returns the obj at index
      public void set(int index, E a); //update the value at index
      
      public int getSize(); //returns # of elements
      
      public int indexOf(E a); //returns index of the object
      
      //these methods qualify our array as an arraylist
      //next we create the class that instantiates these methods
      
      
      
}