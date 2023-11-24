package br.com.wmcodes.back.entidades.enums;

public enum StatusEnum {
	

	AGUARDANDO("Aguardando"),	
	RECUSADO("Recusado"),
	COMERCIAL("Comercial");
	
	private String status;
	
	private StatusEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	

}
