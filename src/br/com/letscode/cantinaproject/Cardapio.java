package br.com.letscode.cantinaproject;

public class Cardapio {
    protected String[] lanches = new String[]{"Burguer", "Pizza", "Fogazza"};
    private double[] precoLanches = new double[]{30, 45, 20};

    protected String[] comida = new String[]{"Pasta", "Lasagna", "Polpetone"};
    private double[] precoComida = new double[]{30, 70, 50};

    protected String[] bebidas = new String[]{"Refrigerante", "Suco", "Vinho"};
    private double[] precoBebidas = new double[]{5, 7, 50};

    public Cardapio() {
    }

    public String[] getLanches() {
        return lanches;
    }

    public void setLanches(String[] lanches) {
        this.lanches = lanches;
    }

    public double[] getPrecoLanches() {
        return precoLanches;
    }

    public void setPrecoLanches(double[] precoLanches) {
        this.precoLanches = precoLanches;
    }

    public String[] getComida() {
        return comida;
    }

    public void setComida(String[] comida) {
        this.comida = comida;
    }

    public double[] getPrecoComida() {
        return precoComida;
    }

    public void setPrecoComida(double[] precoComida) {
        this.precoComida = precoComida;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }

    public double[] getPrecoBebidas() {
        return precoBebidas;
    }

    public void setPrecoBebidas(double[] precoBebidas) {
        this.precoBebidas = precoBebidas;
    }

    public void mostrarCardapio(){
        System.out.println("    ---Lanches---");
        for (int i = 0 ; i<lanches.length ; i++){
            //System.out.println(getLanches()[i]+" - R$"+getPrecoLanches()[i]);
            System.out.printf("%-12.12s - R$%.2f\n", getLanches()[i], getPrecoLanches()[i]);
        }

        System.out.println("    ---Comida---");
        for (int i =0 ; i< comida.length ; i++){
            //System.out.println(getComida()[i]+" - R$"+getPrecoComida()[i]);
            System.out.printf("%-12.12s - R$%.2f\n", getComida()[i], getPrecoComida()[i]);
        }

        System.out.println("    ---Bebidas---");
        for (int i=0 ; i< bebidas.length ; i++){
            //System.out.println(getBebidas()[i]+" - R$"+getPrecoBebidas()[i]);
            System.out.printf("%-12.12s - R$%.2f\n", getBebidas()[i], getPrecoBebidas()[i]);
        }

        System.out.println("\n\n*Será cobrada uma taxa de R$1,00 para cada lanche ou bebida\ne R$2,00 para" +
                " cada prato de comida, referente a entrega do pedido");

    }

}
