package implementation;

public class mercadinhoDaEsquina implements supermarketInterface{
    private int itemIndex; //Indice atual do vetor
    private final String[] listaDeItens;

    public mercadinhoDaEsquina(int tamanho) {
        this.listaDeItens = new String[tamanho];
        this.itemIndex = -1;
    }

    @Override
    public void adicionarItem(String novoItem) {
        if(itemIndex == listaDeItens.length-1){
            System.out.println("Lista cheia");
        }else{
            itemIndex++;
            listaDeItens[itemIndex] = novoItem;
        }
    }

    @Override
    public void verLista() {
        if(itemIndex<0){
            System.out.println("Lista vazia");
        }
        for (int i = 0; i<=itemIndex;i++){
            System.out.println(i+" - "+listaDeItens[i]);
        }
    }

    @Override
    public void removeItem(int itemIndex) {
        if (itemIndex>0 && itemIndex<=this.itemIndex){
            for (int i = itemIndex;i<this.listaDeItens.length-1;i++){
                listaDeItens[i] = listaDeItens[i+1];
            }
            this.itemIndex--;
        }
    }
}
