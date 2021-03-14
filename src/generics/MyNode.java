package generics;

public class MyNode <T>{
    private T data;
    private MyNode<T> next;

    public MyNode(T dataValue) {
        data= dataValue ;
        next = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T dataValue){
        data = dataValue;
    }

    public MyNode<T> getNext(){
        return next;
    }

    public void setNext(MyNode<T> nextNode){
        next = nextNode;
    }

    public static void main(String[] args) {
        MyNode<Integer> node1 = new MyNode<>(1);
        MyNode<Integer> node2 = new MyNode<>(2);
        MyNode<Integer> node3 = new MyNode<>(3);

        node1.setNext(node2);
        node2.setNext(node3);

        System.out.println("Values:\nnode1: "
                + node1.getData()
                +"\nnode2: "+node2.getData()
                +"\nnode3: "+node3.getData());
    }
}
