package com.api.acessoescola.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Doacao {

	@Id
	@Column(name = "id_doacao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_doacao;

	private String nome_doacao;

	@ManyToOne
	@JoinColumn(name = "id_parceiro")
	private Parceiro parceiro;

	@ManyToOne
	@JoinColumn(name = "id_escola")
	private Escola escola;

	public Doacao() {
		super();
	}

	public long getId_doacao() {
		return id_doacao;
	}

	public void setId_doacao(long id_doacao) {
		this.id_doacao = id_doacao;
	}

	public String getNome_doacao() {
		return nome_doacao;
	}

	public void setNome_doacao(String nome_doacao) {
		this.nome_doacao = nome_doacao;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	@Override
	public int hashCode() {
		return Objects.hash(escola, id_doacao, nome_doacao, parceiro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doacao other = (Doacao) obj;
		return Objects.equals(escola, other.escola) && id_doacao == other.id_doacao
				&& Objects.equals(nome_doacao, other.nome_doacao) && Objects.equals(parceiro, other.parceiro);
	}

	@Override
	public String toString() {
		return "Doacao [id_doacao=" + id_doacao + ", nome_doacao=" + nome_doacao + ", parceiro=" + parceiro
				+ ", escola=" + escola + "]";
	}

	public Doacao(long id_doacao, String nome_doacao, Parceiro parceiro, Escola escola) {
		super();
		this.id_doacao = id_doacao;
		this.nome_doacao = nome_doacao;
		this.parceiro = parceiro;
		this.escola = escola;
	}

}
