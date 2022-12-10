package aula_02;

public class ItemListaEncadeada<T> {

	private T dado;
	private ItemListaEncadeada<T> proximo;
	
	public T getDado() {
		return dado;
	}
	
	public void setDado(T dado) {
		this.dado = dado;
	}
	
	public ItemListaEncadeada<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(ItemListaEncadeada<T> proximo) {
		this.proximo = proximo;
	}
	
	
}
