package dataStructure;

public class Stack {
    private int height;
    private Node top;

    public class Node{
        int value;
        Node next;
        Node(int newData){
            this.value = newData;
        }

        public int getValue() {
            return value;
        }
    }

    public Stack(int data){
        top = new Node(data);
        height = 1;
    }
    public void getTop(){
        if(top!=null)
            System.out.println("Topo: "+top.value);
        else
            System.out.println("Pilha vazia");
    }
    public void getHeight(){
        System.out.println("Altura: "+height);
    }
    public void print(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Node temp = this.top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    public void push(int newValue){
        Node newNode = new Node(newValue);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;

        height++;
    }

    public Node pop(){
        if(height==0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

}
