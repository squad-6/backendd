package com.api.acessoescola.model;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;


	
	@Entity
	@Data
	public class Questionario {
		
		@Id
		@Column(name = "id_questionario")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id_questionario;
		
		private String pergunta1;
	
		private String pergunta2;
		
		private String pergunta3;
		
		private String pergunta4;
		

		@Column(name = "data_questionario")
		@DateTimeFormat(pattern = "dd/MM/yyyy")
		private Date data_questionario;
						
		@ManyToOne
		@JoinColumn(name = "id_escola")
		private Escola escola;
	
		public Questionario() {
			super();
		}

		public long getId_questionario() {
			return id_questionario;
		}

		public void setId_questionario(long id_questionario) {
			this.id_questionario = id_questionario;
		}

		public String getPergunta1() {
			return pergunta1;
		}

		public void setPergunta1(String pergunta1) {
			this.pergunta1 = pergunta1;
		}

		public String getPergunta2() {
			return pergunta2;
		}

		public void setPergunta2(String pergunta2) {
			this.pergunta2 = pergunta2;
		}

		public String getPergunta3() {
			return pergunta3;
		}

		public void setPergunta3(String pergunta3) {
			this.pergunta3 = pergunta3;
		}

		public String getPergunta4() {
			return pergunta4;
		}

		public void setPergunta4(String pergunta4) {
			this.pergunta4 = pergunta4;
		}

		public Date getData_questionario() {
			return data_questionario;
		}

		public void setData_questionario(Date data_questionario) {
			this.data_questionario = data_questionario;
		}

		public Escola getEscola() {
			return escola;
		}

		public void setEscola(Escola escola) {
			this.escola = escola;
		}

		@Override
		public String toString() {
			return "Questionario [id_questionario=" + id_questionario + ", pergunta1=" + pergunta1 + ", pergunta2="
					+ pergunta2 + ", pergunta3=" + pergunta3 + ", pergunta4=" + pergunta4 + ", data_questionario="
					+ data_questionario + ", escola=" + escola + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(data_questionario, escola, id_questionario, pergunta1, pergunta2, pergunta3, pergunta4);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Questionario other = (Questionario) obj;
			return Objects.equals(data_questionario, other.data_questionario) && Objects.equals(escola, other.escola)
					&& id_questionario == other.id_questionario && Objects.equals(pergunta1, other.pergunta1)
					&& Objects.equals(pergunta2, other.pergunta2) && Objects.equals(pergunta3, other.pergunta3)
					&& Objects.equals(pergunta4, other.pergunta4);
		}

		public Questionario(long id_questionario, String pergunta1, String pergunta2, String pergunta3,
				String pergunta4, Date data_questionario, Escola escola) {
			super();
			this.id_questionario = id_questionario;
			this.pergunta1 = pergunta1;
			this.pergunta2 = pergunta2;
			this.pergunta3 = pergunta3;
			this.pergunta4 = pergunta4;
			this.data_questionario = data_questionario;
			this.escola = escola;
		}


		
		
		
}


