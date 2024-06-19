package dataStructure;

public class ListaLigada {
    public int length;
    private Node head;
    private Node tail;

    public ListaLigada(String data){
        this.length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }
    private class Node{
        String data;
        Node next;

        Node(String newData){
            data = newData;
        }
    }

    public void getHead(){
        System.out.println(head.data);
    }

    public void getTail(){
        System.out.println(tail.data);
    }

    public void getLength(){
        System.out.println(length);
    }

    public void append(String newData){//adicionar no fim da lista
        Node newNode = new Node(newData);
        if(length == 0){
            tail = newNode;
            head = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    public void prepend (String newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(String newData, int index){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$444");
        if(index<0||index>=length)
            System.out.println("Index invalido");
        else if(index==0)
            prepend(newData);
        else if (index == length -1)
            append(newData);
        else {
            Node newNode = new Node(newData);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }


    public void printData(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    public Node get(int index){
        Node temp = head;
        int cont =0;
        while(temp!= null){
            if(cont == index){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void removeFirst(){
        Node temp = head.next;
        head = temp;
        length--;
    }
    public void removeLast(){
        Node temp = head;
        while(temp!=null){
            if(temp.next ==tail) {
                tail = null;
                tail = temp;
                break;
            }
            temp = temp.next;
        }
        length--;
    }



}
