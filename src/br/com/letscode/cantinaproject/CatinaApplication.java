package br.com.letscode.cantinaproject;

import java.util.Scanner;

public class CatinaApplication {
    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();
        Scanner sc = new Scanner(System.in);

        String escolha;
        int opc=0;

        System.out.println("*~Seja bem Vindo à Cantina Codifichiamo~*\n");

        do {
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Mostrar o cardapio");

            if (pedido.resumoPedido.isEmpty()){
                System.out.println("2 - Realizar um pedido");
            }
            else{
                System.out.println("2 - Adicionar um item ao pedido");
                System.out.println("3 - Mostrar pedido");
            }
            System.out.println("0 - sair");
            opc = sc.nextInt();
            System.out.println();

            switch (opc) {
                case 1:
                    cardapio.mostrarCardapio();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Qual seu pedido?");
                    escolha = sc.next();
                    pedido.setPedido(escolha);
                    System.out.println(pedido.validarItemPedido());
                    System.out.println();
                    break;
                case 3:
                    pedido.resumoPedido();
                    int opc2;
                    System.out.println("Gostaria de finalizar o pedido?");
                    System.out.println("1 - Sim\n2 - Não");
                    opc2 = sc.nextInt();
                    if(opc2 == 1){
                        System.out.println("Obrigado pelo pedido – Conte conosco!");
                        opc = 0;
                    }
                    break;
                case 4:
                    System.out.println("");
                    break;
            }
        }while (opc !=0);

    }

}
