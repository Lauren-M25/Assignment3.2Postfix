/********************************************************************
 * Programmer: Lauren Minaker
 * Class:  CS40S
 *
 * Assignment: A3.1 Stack
 *
 * Description: Stack class
 ***********************************************************************/

// import libraries as needed here

public class Stack<T> {
    //*** Class Variables ***
    
        protected Node t; // the top of the stack
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: default constructor for stack
    * 
    * Interface:
    * ****************************************/
    
    public Stack(){
        this.t = null;
    }
    
    //*** Getters ***
    
    /*****************************************
    * Description: returns the data of the top and pops it off the stack
    * 
    * Interface:
    * ****************************************/
    public T pop(){
        T topPayload = null;
        
        if(this.isEmpty()){
           System.out.println("The stack is empty.");
        } else {
           topPayload = (T) t.getPayload();
           t = t.getnext();
        }
        
        return topPayload;
    }
    
    /*****************************************
    * Description: checks if the stack is empty
    * 
    * Interface:
    * ****************************************/
    public boolean isEmpty(){
        boolean empty = false;
        if(t == null){
            empty = true;
        }
        return empty;
    }
    
    /*****************************************
    * Description: returns the top value without popping it
    * 
    * Interface:
    * ****************************************/
    public T peek(){
        T payload;
        payload = (T) t.getPayload();
        return payload;
    }
    
    //*** Setters ***
    
    /*****************************************
    * Description: adds a new node to the top of the stack
    * 
    * Interface:
    * ****************************************/
    public void push(Node n){
        n.setnext(t);
        t = n;
    }
    
} // end of public class
