package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

/**
 * MvaipUf generated by hbm2java
 */
@Entity
@Table(name = "MVAIP_UFS", schema = "AGH")
public class MvaipUf implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4733658401936801315L;
	private String sigla;
	private String pasSigla;
	private String nome;
	private String indCidade;
	private Short codUfIbge;

	public MvaipUf() {
	}

	public MvaipUf(String sigla, String pasSigla, String nome, String indCidade) {
		this.sigla = sigla;
		this.pasSigla = pasSigla;
		this.nome = nome;
		this.indCidade = indCidade;
	}

	public MvaipUf(String sigla, String pasSigla, String nome, String indCidade, Short codUfIbge) {
		this.sigla = sigla;
		this.pasSigla = pasSigla;
		this.nome = nome;
		this.indCidade = indCidade;
		this.codUfIbge = codUfIbge;
	}

	@Id
	@Column(name = "SIGLA", unique = true, nullable = false, length = 2)
	@Length(max = 2)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "PAS_SIGLA", nullable = false, length = 3)
	@Length(max = 3)
	public String getPasSigla() {
		return this.pasSigla;
	}

	public void setPasSigla(String pasSigla) {
		this.pasSigla = pasSigla;
	}

	@Column(name = "NOME", nullable = false, length = 60)
	@Length(max = 60)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "IND_CIDADE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndCidade() {
		return this.indCidade;
	}

	public void setIndCidade(String indCidade) {
		this.indCidade = indCidade;
	}

	@Column(name = "COD_UF_IBGE")
	public Short getCodUfIbge() {
		return this.codUfIbge;
	}

	public void setCodUfIbge(Short codUfIbge) {
		this.codUfIbge = codUfIbge;
	}

	public enum Fields {

		SIGLA("sigla"),
		PAS_SIGLA("pasSigla"),
		NOME("nome"),
		IND_CIDADE("indCidade"),
		COD_UF_IBGE("codUfIbge");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSigla() == null) ? 0 : getSigla().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MvaipUf)) {
			return false;
		}
		MvaipUf other = (MvaipUf) obj;
		if (getSigla() == null) {
			if (other.getSigla() != null) {
				return false;
			}
		} else if (!getSigla().equals(other.getSigla())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
