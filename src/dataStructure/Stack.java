package dataStructure;

public class Pilha {
    private int height;
    private Node top;

    public class Node{
        int data;
        Node next;
        Node(int newData){
            this.data = newData;
        }
    }

    public Pilha(int data){
        top = new Node(data);
        height = 1;
    }
    public Node getTop(){
        return this.top;
    }

    public void print(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Node temp = this.top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

}
