package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntity;


/**
 * MpmTextoPadraoParecer generated by hbm2java
 */
@Entity
@Table(name = "MPM_TEXTO_PADRAO_PARECERES", schema = "AGH")
public class MpmTextoPadraoParecer implements BaseEntity {

	private static final long serialVersionUID = -4564679784585475911L;
	private String sigla;
	private String descricao;

	public MpmTextoPadraoParecer() {
	}

	public MpmTextoPadraoParecer(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	@Id
	@Column(name = "SIGLA", unique = true, nullable = false, length = 10)
	@Length(max = 10)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public enum Fields {

		SIGLA("sigla"), DESCRICAO("descricao");

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
		result = prime * result
				+ ((getSigla() == null) ? 0 : getSigla().hashCode());
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
		if (!(obj instanceof MpmTextoPadraoParecer)) {
			return false;
		}
		MpmTextoPadraoParecer other = (MpmTextoPadraoParecer) obj;
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