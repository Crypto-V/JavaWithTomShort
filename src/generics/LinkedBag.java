package generics;

public final class LinkedBag <T> implements BagInterface<T>{

    private MyNode<T> firstNode;
    private int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }

    private MyNode<T> findEntry(T anEntry) {
        MyNode<T> currentNode = firstNode;
        boolean found = false;
        while(!found && currentNode != null){
            if(currentNode.getData().equals(anEntry)) found = true;
            else currentNode = currentNode.getNext();
        }
        if(found) return currentNode;
        else return null;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }

    @Override
    public boolean addNewEntry(T newEntry) {
        MyNode<T> newNode = new MyNode<>(newEntry);
        newNode.setNext(firstNode);
        firstNode = newNode;
        numberOfEntries++;
        return true;
    }

    @Override
    public T remove() {
        if(firstNode != null){
            T result = firstNode.getData();
            firstNode = firstNode.getNext();
            numberOfEntries--;
            return result;
        }else  return null;
    }

    @Override
    public boolean remove(T anEntry) {
        MyNode<T> nodeToRemove = findEntry(anEntry);
        if(nodeToRemove == null) return false;
        nodeToRemove.setData(firstNode.getData());
        firstNode = firstNode.getNext();
        numberOfEntries--;
        return true;
    }


    @Override
    public void clear() {
        firstNode = null;
        numberOfEntries = 0;

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        MyNode<T> currentNode = firstNode;
        while(currentNode != null){
            if (currentNode.getData().equals(anEntry)) count ++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        MyNode<T> currentNode = firstNode;
        boolean found = false;
        while(!found && currentNode!=null){
            if(currentNode.getData().equals(anEntry)) found = true;
            currentNode = currentNode.getNext();
        }
        return found;
    }

    @Override
    public T[] toArray() {
        T[] resultArray = (T[])new Object[numberOfEntries];
        int index = 0;
        MyNode<T> currentNode = firstNode;
        while(currentNode != null){
            resultArray[index++] = currentNode.getData();
            currentNode = currentNode.getNext();
        }
        return resultArray;
    }


    public String toString(){
        MyNode<T> currentNode = firstNode;
        String result = "Bag[ ";
        while (currentNode != null){
            result += currentNode.getData()+",";
            currentNode = currentNode.getNext();
        }
        result += " ]";
        return result;
    }
}
