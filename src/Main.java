import dataStructure.Queue;
import dataStructure.Stack;
import dataStructure.Tree;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        System.out.println("%%%%%%%%%%%%%%%");
        tree.BFS();
        System.out.println("%%%%%%%%%%%%%%%");

    }

    private static void filaDeAtendimento(int n){
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente: "+ cliente);
        //simula a chegada dos clientes
        for (int i =2;i<=n;i++){
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: "+ cliente);
            queue.enqueue(cliente);
        }
        //atendimento dos clientes
        var node = queue.dequeue();
        while (node!=null){
            System.out.println("Atendido o cliente: "+node.getValue());
            node = queue.dequeue();
        }
    }

    private static void inverter(final int[] numeros){//inverte numeros numa pilha
        Stack myStack = new Stack(numeros[0]);
        for(int i=1;i<numeros.length;i++){
            myStack.push(numeros[i]);
        }
        var node = myStack.pop();
        while (node!=null){
            System.out.println(node.getValue());
            node=myStack.pop();
        }
    }
}