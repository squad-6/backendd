package com.api.acessoescola.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parceiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_parceiro;

	@Column(name = "nome_parceiro")
	private String nome_parceiro;

	@Column(name = "estado_parceiro")
	private String estado_parceiro;

	@Column(name = "cidade_parceiro")
	private String cidade_parceiro;

	@Column(name = "email_parceiro")
	private String email_parceiro;

	@Column(name = "senha_parceiro")
	private String senha_parceiro;

	@Column(name = "ramo_atividade_parceiro")
	private String ramo_atividade_parceiro;

	@Column(name = "item_parceiro")
	private String item_parceiro;

	public Parceiro() {
		super();
	}

	public Parceiro(long id_Parceiro, String nome_parceiro, String estado_parceiro, String cidade_parceiro,
			String email_parceiro, String senha_parceiro, String ramo_atividade_parceiro, String item_parceiro) {
		super();
		this.id_parceiro = (int) id_parceiro;
		this.nome_parceiro = nome_parceiro;
		this.estado_parceiro = estado_parceiro;
		this.cidade_parceiro = cidade_parceiro;
		this.email_parceiro = email_parceiro;
		this.senha_parceiro = senha_parceiro;
		this.ramo_atividade_parceiro = ramo_atividade_parceiro;
		this.item_parceiro = item_parceiro;
	}

	public long getId_parceiro() {
		return id_parceiro;
	}

	public void setId_parceiro(long id_parceiro) {
		this.id_parceiro = id_parceiro;
	}

	public String getNome_parceiro() {
		return nome_parceiro;
	}

	public void setNome_parceiro(String nome_parceiro) {
		this.nome_parceiro = nome_parceiro;
	}

	public String getEstado_parceiro() {
		return estado_parceiro;
	}

	public void setEstado_parceiro(String estado_parceiro) {
		this.estado_parceiro = estado_parceiro;
	}

	public String getCidade_parceiro() {
		return cidade_parceiro;
	}

	public void setCidade_parceiro(String cidade_parceiro) {
		this.cidade_parceiro = cidade_parceiro;
	}

	public String getEmail_parceiro() {
		return email_parceiro;
	}

	public void setEmail_parceiro(String email_parceiro) {
		this.email_parceiro = email_parceiro;
	}

	public String getSenha_parceiro() {
		return senha_parceiro;
	}

	public void setSenha_parceiro(String senha_parceiro) {
		this.senha_parceiro = senha_parceiro;
	}

	public String getRamo_atividade_parceiro() {
		return ramo_atividade_parceiro;
	}

	public void setRamo_atividade_parceiro(String ramo_atividade_parceiro) {
		this.ramo_atividade_parceiro = ramo_atividade_parceiro;
	}

	public String getItem_parceiro() {
		return item_parceiro;
	}

	public void setItem_parceiro(String item_parceiro) {
		this.item_parceiro = item_parceiro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_parceiro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parceiro other = (Parceiro) obj;
		return id_parceiro == other.id_parceiro;
	}

	@Override
	public String toString() {
		return "Parceiro [id_parceiro=" + id_parceiro + ", nome_parceiro=" + nome_parceiro + ", estado_parceiro="
				+ estado_parceiro + ", cidade_parceiro=" + cidade_parceiro + ", email_parceiro=" + email_parceiro
				+ ", senha_parceiro=" + senha_parceiro + ", ramo_atividade_parceiro=" + ramo_atividade_parceiro
				+ ", item_parceiro=" + item_parceiro + "]";
	}

}
