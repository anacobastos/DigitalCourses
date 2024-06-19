package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root;
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
        public boolean isLeaf(){
            return (this.left==null)&&(this.right==null);
        }

    }

    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }
        else{
            Node newNode = new Node(value);
            Queue<Node> fila = new LinkedList<>();
            fila.add(root);
            while(fila.size()>0){
                Node currentNode = fila.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }else{
                    fila.add(currentNode.left);
                }
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                }else{
                    fila.add(currentNode.right);
                }
            }
        }
    }


    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(final Node node){
      //R E D
      if(node ==null) return;
      System.out.println(node.value);
      preOrder(node.left);
      preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(final Node node){
        //E R D
        if(node ==null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void posOrder(){
        posOrder(root);
    }
    private void posOrder(final Node node){
        //E D R
        if(node ==null) return;
        posOrder(node.left);
        posOrder(node.right);
        System.out.println(node.value);
    }

    public void BFS(){
        if(root ==null)return;
        Queue<Node> fila = new LinkedList<>();
        fila.add(root);
        while(!fila.isEmpty()){
            Node node = fila.remove();
            if(node.left!=null) fila.add(node.left);
            if(node.right!=null) fila.add(node.right);

            System.out.println(node.value);
        }
    }


}
