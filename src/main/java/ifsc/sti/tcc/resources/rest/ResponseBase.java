package ifsc.sti.tcc.resources.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBase<E> {
	
	@JsonProperty(value="Sucesso")
	private boolean sucesso;
	@JsonProperty(value="Mensagem")
	private String mensagem;
	@JsonProperty(value="Data")
	private E data;
	
	public ResponseBase() {
		super();
	}
	
	public ResponseBase(boolean sucesso, String mensagem, E data) {
		super();
		this.sucesso = sucesso;
		this.mensagem = mensagem;
		this.data = data;
	}
	
	public boolean isSucesso() {
		return sucesso;
	}
	
	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public E getData() {
		return data;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	
}
