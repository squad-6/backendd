package com.api.acessoescola.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FaleConosco {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String email;
	
	private String menssagem;
	
	public FaleConosco() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMenssagem() {
		return menssagem;
	}

	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, menssagem, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaleConosco other = (FaleConosco) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(menssagem, other.menssagem)
				&& Objects.equals(nome, other.nome);
	}

	public FaleConosco(long id, String nome, String email, String menssagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.menssagem = menssagem;
	};

}
