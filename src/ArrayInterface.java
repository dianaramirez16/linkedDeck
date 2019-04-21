//deck accessed by main declared as arraylist
//reference: https://gist.github.com/Rob-bie/b490814b4b7cbb070d58
//reference: https://howtoprogramwithjava.com/enums/
//shuffle referenece:  https://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
// DIANA RAMIREZ
// PROJECT 3 DATA STRUCTURES

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