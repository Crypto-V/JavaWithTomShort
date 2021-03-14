package generics;

public final class ArrayBag <T> implements BagInterface<T> {

    private T[] bag;
    private int numOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private boolean initialised = false;
    private static final int MAX_CAPACITY = 10000;

    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity){
        if(capacity <= MAX_CAPACITY){
            T[] tempBag = (T[]) new Object[capacity];
            bag = tempBag;
            numOfEntries = 0;
            initialised = true;
        }else throw new IllegalStateException("Attempt to create a bag where the capacity exceed the max_capacity");

    }

    private boolean isArrayFull(){
        return (bag.length == numOfEntries);
    }

    private void checkInitialisation(){
        if(!initialised)
            throw new SecurityException("Array bag is not initialised properly!");
    }

    private T removeElementAt(int index){
        T result = null;
        if(!isEmpty() && index >=0 && index <numOfEntries){
            result = bag[index];
            bag[index] = bag[numOfEntries-1];
            bag[numOfEntries-1] = null;
            numOfEntries--;
        }
        return result;
    }

    public int getCurrentSize() {
        return numOfEntries;
    }


    public boolean isEmpty() {
        return (numOfEntries == 0 );
    }


    public boolean addNewEntry(T newEntry) {
        checkInitialisation();
        if(isArrayFull()) return false;
        else {
            bag[numOfEntries++] = newEntry;
            return true;
        }
    }


    public T remove() {
        checkInitialisation();
        return removeElementAt(numOfEntries-1);
    }


    public boolean remove(T anEntry) {
        boolean found =  false;
        int index = 0;
        while(!found && index <numOfEntries){
            if(bag[index].equals(anEntry)) found = true;
            else index++;
        }
        if (found) removeElementAt(index);
        return found;
    }


    public void clear() {
        while(!isEmpty()) remove();
    }


    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(int i = 0; i < numOfEntries; i++){
            if(bag[i].equals(anEntry)) count++;
        }
        return count;
    }


    public boolean contains(T anEntry) {
        boolean found =  false;
        int index = 0;
        while (!found && index<numOfEntries){
            if(bag[index++].equals(anEntry)) found = true;
        }
        return found;

    }


    public T[] toArray() {
        T[] resultArray = (T[]) new Object[numOfEntries];
        System.arraycopy(bag,0,resultArray,0,numOfEntries);
        return resultArray;
    }

    public String toString(){
        String strResult = "Bag[";
        for (int i = 0; i<numOfEntries; i++){
            strResult += bag[i]+ " ";

        }
        strResult += "]";
        return strResult;

    }

//    public static void main(String[] args) {
//        ArrayBag<String> bagOfNames = new ArrayBag<String>(5);
//        System.out.println("Adding Adrian..." +bagOfNames.addNewEntry("Adrian"));
//        System.out.println("Adding Mary..." +bagOfNames.addNewEntry("Mary"));
//        System.out.println("Adding Vasile..." +bagOfNames.addNewEntry("Vasile"));
//
//        Object[] arrayOfNames = bagOfNames.toArray();
//
//        for (Object name:arrayOfNames) System.out.print(name+"....");
//        System.out.println();
//
//        System.out.println("Adding John..." +bagOfNames.addNewEntry("John"));
//        System.out.println("Adding Siobhan..." +bagOfNames.addNewEntry("Siobhan"));
//        System.out.println("Adding Patrick..." +bagOfNames.addNewEntry("Patrick"));
//
//        Object[] arrayOfNames2 = bagOfNames.toArray();
//
//        for (Object name:arrayOfNames2) System.out.print(name+"....");
//        System.out.println();
//
//    }
}
