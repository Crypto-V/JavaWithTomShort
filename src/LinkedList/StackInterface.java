package LinkedList;

public interface StackInterface <T> {

    public void push(T newEntry);
    /*Add a new entry to the top of the stack
    @param (T) newEntry - the entry to be added
    */

    public T pop();
    /*
     * remove the top item
     * throw EmptyStack exception if is called on empty stack
     * @return (T) - the value that was on the top of the stack
     */

    public T peek();
    /*return obj of generic of type T
    * throw EmptyStack exception if is called on empty stack
    * return (T)-value on the top
    */

    public boolean isEmpty();
//    return true if no elements ,false otherwise.

    public void clear();
    /*remove all elements from the stack*/
}
