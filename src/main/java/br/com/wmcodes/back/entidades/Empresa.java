package br.com.wmcodes.back.entidades;

import java.io.Serializable;

import br.com.wmcodes.back.entidades.enums.StatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = -5624031626777853759L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_empresa")
	private long idEmpresa;
	
	@Column(name = "nome_empresa", nullable = false)
	private String nomeEmpresa;
	
	@Column(name = "email_empresa", nullable = false)
	private String emailEmpresa;
	
	@Column(name = "contato_empresa", nullable = false)
	private String contatoEmpresa;
	
	@Column(name = "observacoes", nullable = true)
	private String observacoes;
	
	@Column(name = "status", nullable = false)
	private StatusEnum status;
	
	private Endereco endereco;
	
	public Empresa() {
	}

	public long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public String getContatoEmpresa() {
		return contatoEmpresa;
	}

	public void setContatoEmpresa(String contatoEmpresa) {
		this.contatoEmpresa = contatoEmpresa;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
