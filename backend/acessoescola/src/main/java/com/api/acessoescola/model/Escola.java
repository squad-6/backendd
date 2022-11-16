package com.api.acessoescola.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	
	@Entity
	public class Escola {
		
		@Id
		@Column(name = "id_escola")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id_escola;
				
		private String nome_escola;
		
		private String estado_escola;
		
		private String cidade_escola;
		
		private String telefone_escola;
		
		private String cep_escola;
		
		private String numero_escola;
		
		private String email_escola;
		
		private String senha_escola;
		
		public Escola() {
			super();
		}

		public long getId_escola() {
			return id_escola;
		}

		public void setId_escola(long id_escola) {
			this.id_escola = id_escola;
		}

		public String getNome_escola() {
			return nome_escola;
		}

		public void setNome_escola(String nome_escola) {
			this.nome_escola = nome_escola;
		}

		public String getEstado_escola() {
			return estado_escola;
		}

		public void setEstado_escola(String estado_escola) {
			this.estado_escola = estado_escola;
		}

		public String getCidade_escola() {
			return cidade_escola;
		}

		public void setCidade_escola(String cidade_escola) {
			this.cidade_escola = cidade_escola;
		}

		public String getTelefone_escola() {
			return telefone_escola;
		}

		public void setTelefone_escola(String telefone_escola) {
			this.telefone_escola = telefone_escola;
		}

		public String getCep_escola() {
			return cep_escola;
		}

		public void setCep_escola(String cep_escola) {
			this.cep_escola = cep_escola;
		}

		public String getNumero_escola() {
			return numero_escola;
		}

		public void setNumero_escola(String numero_escola) {
			this.numero_escola = numero_escola;
		}

		public String getEmail_escola() {
			return email_escola;
		}

		public void setEmail_escola(String email_escola) {
			this.email_escola = email_escola;
		}

		public String getSenha_escola() {
			return senha_escola;
		}

		public void setSenha_escola(String senha_escola) {
			this.senha_escola = senha_escola;
		}

		@Override
		public String toString() {
			return "Escola [id_escola=" + id_escola + ", nome_escola=" + nome_escola + ", estado_escola="
					+ estado_escola + ", cidade_escola=" + cidade_escola + ", telefone_escola=" + telefone_escola
					+ ", cep_escola=" + cep_escola + ", numero_escola=" + numero_escola + ", email_escola="
					+ email_escola + ", senha_escola=" + senha_escola + "]";
		}

		public Escola(long id_escola, String nome_escola, String estado_escola, String cidade_escola,
				String telefone_escola, String cep_escola, String numero_escola, String email_escola,
				String senha_escola) {
			super();
			this.id_escola = id_escola;
			this.nome_escola = nome_escola;
			this.estado_escola = estado_escola;
			this.cidade_escola = cidade_escola;
			this.telefone_escola = telefone_escola;
			this.cep_escola = cep_escola;
			this.numero_escola = numero_escola;
			this.email_escola = email_escola;
			this.senha_escola = senha_escola;
		}

		@Override
		public int hashCode() {
			return Objects.hash(cep_escola, cidade_escola, email_escola, estado_escola, id_escola, nome_escola,
					numero_escola, senha_escola, telefone_escola);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Escola other = (Escola) obj;
			return Objects.equals(cep_escola, other.cep_escola) && Objects.equals(cidade_escola, other.cidade_escola)
					&& Objects.equals(email_escola, other.email_escola)
					&& Objects.equals(estado_escola, other.estado_escola) && id_escola == other.id_escola
					&& Objects.equals(nome_escola, other.nome_escola)
					&& Objects.equals(numero_escola, other.numero_escola)
					&& Objects.equals(senha_escola, other.senha_escola)
					&& Objects.equals(telefone_escola, other.telefone_escola);
		}

			

		
	}


