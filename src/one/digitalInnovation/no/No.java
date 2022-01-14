package one.digitalInnovation.no;
/**
 * Classe No refatorada utilizando Generics.
 * 
 * @author Everton Trennepohl
 *
 */
public class No<T> {
	
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximo) {
		this.proximoNo = proximo;
	}
	
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

}

/**
 * Classe No sem utilização de Generics.
 * 
 * */
/*
public class No {
	
	private String conteudo;
	private No proximoNo;
	
	public No(String conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
}
*/
