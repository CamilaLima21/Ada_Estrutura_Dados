package aula_02;


public class Lista<T> {
    ItemListaEncadeada<T> primeiroItem;
    ItemListaEncadeada<T> ultimoItem;
    int tamanho = 0;

    public Lista() {}

    public T add(T dado){
        if(primeiroItem==null){
            this.primeiroItem = new ItemListaEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ItemListaEncadeada<T> item = new ItemListaEncadeada<>();
            item.setDado(dado);
            ultimoItem.setProximo(item);
            ultimoItem = item;
        }
        /*System.out.println(primeiroItem.getDado());
        System.out.println(ultimoItem==null?"":ultimoItem.getDado());
        System.out.println(primeiroItem);
        System.out.println(ultimoItem);
        System.out.println();
        System.out.println();*/
        tamanho ++;
        return dado;
    }

    public T get(int posicao) throws Exception {
        this.validateRulesList(posicao);

        ItemListaEncadeada<T> item = primeiroItem;

        for (int i = 0; i < posicao; i++) {
            item = item.getProximo();
        }

        return item.getDado();
    }

    public T remove(int posicao) throws Exception {
        this.validateRulesList(posicao);

        ItemListaEncadeada<T> itemAtual = primeiroItem;
        ItemListaEncadeada<T> itemAnterior = null;

        if (posicao == 0) {
            primeiroItem = itemAtual.getProximo();
            return primeiroItem.getDado();
        }

        for (int i = 0; i < posicao; i++) {
            if (i < posicao) itemAnterior = itemAtual;
            itemAtual = itemAtual.getProximo();
        }

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
        }

        return itemAtual.getDado();
    }

    public T validateRulesList(int posicao) throws Exception {
        if (posicao < 0) throw new Exception("Posição não pode ser negativa");
        if (posicao == 0) return primeiroItem.getDado();
        if (posicao >= tamanho) throw new IndexOutOfBoundsException("Posição acima do tamanho da lista");

        return null;
    }

    public void printList() {
        ItemListaEncadeada<T> item = primeiroItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " + primeiroItem.getDado());
        System.out.println("ultimoItem: " + ultimoItem.getDado());

        while (item.getProximo() != null) {
            System.out.println(item.getDado());
            item = item.getProximo();
        }

        System.out.println(item.getDado());
    }

    public static void main(String[] args) throws Exception {
        Lista<String> lista = new Lista<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Ultimo");
        lista.add("Fábio");

        lista.printList();

        lista.remove(3);

        lista.printList();
    }
}
