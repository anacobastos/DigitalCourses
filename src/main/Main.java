package main;

import implementation.mercadinhoDaEsquina;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mercadinhoDaEsquina sergio = new mercadinhoDaEsquina(5);
        int opcao;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1- Adicionar um item");
            System.out.println("2- Remover um item");
            System.out.println("3- Ver lista");
            System.out.println("4- Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1://ADicionar um item
                    System.out.print("Digite um item a adicionar: ");
                    String item = scanner.next();
                    sergio.adicionarItem(item);
                    break;
                case 2://Remover item
                    sergio.verLista();
                    System.out.print("Digite qual o indice do item a ser removido: ");
                    int itemIndex = scanner.nextInt();
                    sergio.removeItem(itemIndex);
                    break;
                case 3:
                    sergio.verLista();
                    break;
                default:
                    break;

            }

        }while(opcao!=4);
        scanner.close();
    }
}