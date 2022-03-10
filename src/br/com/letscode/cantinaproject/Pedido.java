package br.com.letscode.cantinaproject;
import java.util.ArrayList;
import java.util.Objects;

public class Pedido extends Cardapio{
    private String pedido;
    private double valorPedido;
    private double taxa;
    protected ArrayList<String> resumoPedido = new ArrayList<String>();


    public Pedido() {
    }

    public String getPedido(){
        return pedido;
    }

    public void setPedido(String pedido){
        this.pedido = pedido;
    }


    public String validarItemPedido(){
        int index = -1;
        for(int i=0 ; i < getLanches().length ; i++){
            if(Objects.equals(getPedido().toUpperCase(), getLanches()[i].toUpperCase())){
                resumoPedido.add(getLanches()[i]);
                valorPedido += getPrecoLanches()[i];
                taxa +=1;
                index = i;
            }
        }
        if(index < 0) {
            for (int i = 0; i < comida.length; i++) {
                if (Objects.equals(getPedido(), getComida()[i].toUpperCase())) {
                    resumoPedido.add(getComida()[i]);
                    valorPedido += getPrecoComida()[i];
                    taxa +=2;
                    index = i;
                }
            }
        }
        if (index < 0) {
            for (int i = 0; i < bebidas.length; i++) {
                if (Objects.equals(getPedido().toUpperCase(), getBebidas()[i].toUpperCase())){
                    resumoPedido.add(getBebidas()[i]);
                    valorPedido += getPrecoBebidas()[i];
                    taxa +=1;
                    index = i;
                }
            }
        }

        if (index < 0){
            return "Item não encontrado no cardápio";
        }
        else{
            return "Item adicionado ao pedido";
        }
    }

    public void resumoPedido(){
        int i = 1;
        System.out.println("\n   ---Resumo do pedido---");
        for (String s : resumoPedido) {
            System.out.println(i+" - "+s);
            i++;
        }
        System.out.println();
        double valorContaTotal = valorPedido + taxa;
        System.out.println("Valor do pedido: R$"+valorPedido);
        System.out.println("Taxa de entrega: R$"+taxa);
        System.out.println("Valor total a pagar: R$"+ valorContaTotal);
        System.out.println();
    }
}
