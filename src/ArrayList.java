public class ArrayStack <card> {
      
      //storage for the stack
      private E[] theData;
      private int TOS =-1; //indicates nothing is there initially
      private static final int INITIAL_CAPACITY =10;
      
      //default constructor to create stack
      public ArrayStack() {
            this.theData= (E[]) new Object[INITIAL_CAPACITY]; //cast to E
            //this.TOS =1; you can initialize here as well
            
      }
      
      @Override
      public E push(E obj) {
            // adds elements to the stack
            // first check if there is enough space
            if (TOS ==this.theData.length -1) {//this is stack full
                  System.out.println("Stack Overflow..!!");
                  //need to call reallocate() to increase the capacity
                  return null; //get out of method
            }
		/* TOS++; //go to proper index
		this.theData[TOS] = obj;  // you can have these three or change void to E obj
		return;  */
            
            return (this.theData[++TOS] =obj);
      }
      
      @Override
      public E pop() {
            // this method will delete an element from the stack
            // first check if there is an element to delete
            if(!isEmpty()) {
                  E temp = this.theData[TOS]; //save the data first
                  TOS--; 						// decrement the TOS
                  return temp;  				//return the element
                  //return this.theData[TOS--]; // alt method
            } else {
                  System.out.println("Stack underflow");
            }
            
            return null;
      }
      
      @Override
      public E peek() {
            // TODO Auto-generated method stub
            return null;
      }
      
      @Override
      public boolean isEmpty() {
            // check if TOS = -1
            /* if (TOS==-1) {
             * return true;
             * } else return false;   //the long method
             */
            
            return (TOS ==-1);  //short method
      }
      
      public String toString() { //displays stack contents
            String s= "Stack: ";
            for (int i =0; i<=TOS; i++) {
                  s+= this.theData[i] + " | ";
            }
            return s;
      }
      
}