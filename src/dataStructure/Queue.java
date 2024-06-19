package dataStructure;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public class Node{
        Node next;
        int value;

        Node(int newValue){
            value = newValue;
        }

        public int getValue(){
            return value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    public void getFirst() {
        if (first!= null)
            System.out.println("Primeiro: "+first.getValue());
        else
            System.out.println("Fila está vazia");
    }

    public void getLast() {
        if (first!= null)
            System.out.println("Ultimo: "+last.getValue());
        else
            System.out.println("Fila está vazia");
    }

    public void getLength(){
        System.out.println("Tamanho: "+length);
    }

    public void print(){
        Node temp = first;
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    public void enqueue (int value){
        Node newNode = new Node(value);
        if(length == 0){
            last = newNode;
            first = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){

        if(length ==0)
            return null;

        Node temp = first;
        if(length ==1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

}
