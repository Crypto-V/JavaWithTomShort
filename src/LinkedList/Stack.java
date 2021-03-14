package LinkedList;

import java.util.EmptyStackException;

public class Stack<T> implements StackInterface<T>{
    private MyNode<T> topNode;

    public Stack(){
        topNode = null;
    }

    @Override
    public void push(T newEntry) {
        MyNode<T> newNode = new MyNode<>(newEntry);
        newNode.setNext(topNode);
        topNode = newNode;
    }

    @Override
    public T pop() {
        T dataToReturn = peek();
        topNode = topNode.getNext();
        return dataToReturn;
    }

    @Override
    public T peek() {
        if(topNode == null)throw new EmptyStackException();
        else return topNode.getData();
    }

    @Override
    public boolean isEmpty() {
        return (topNode == null);
    }

    @Override
    public void clear() {
        topNode = null;
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int i = 1; i<=4; i++){
           try{
               System.out.println("Peak = "+stack.peek());
               System.out.println("Pop = "+ stack.pop());
           }catch(EmptyStackException e){
               System.out.println("Exception!");
           }
        }

        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Stack is empty: "+stack.isEmpty());
        stack.clear();
        System.out.println("Stack is empty: "+stack.isEmpty());

    }
}
