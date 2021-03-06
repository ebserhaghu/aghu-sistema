package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatProcedimentosHabilitacao generated by hbm2java
 */
@Entity
@Table(name = "FAT_PROCEDIMENTOS_HABILITACAO", schema = "AGH")
public class FatProcedimentoHabilitacao extends BaseEntityId<FatProcedimentoHabilitacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6011482717562376423L;
	private FatProcedimentoHabilitacaoId id;
	private FatHabilitacao fatHabilitacao;
	private String codProcedimento;
	private Integer version;

	public FatProcedimentoHabilitacao() {
	}

	public FatProcedimentoHabilitacao(FatProcedimentoHabilitacaoId id,
			FatHabilitacao fatHabilitacao) {
		this.id = id;
		this.fatHabilitacao = fatHabilitacao;
	}

	public FatProcedimentoHabilitacao(FatProcedimentoHabilitacaoId id,
			FatHabilitacao fatHabilitacao, String codProcedimento) {
		this.id = id;
		this.fatHabilitacao = fatHabilitacao;
		this.codProcedimento = codProcedimento;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "iphPhoSeq", column = @Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "iphSeq", column = @Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "codHabilitacao", column = @Column(name = "COD_HABILITACAO", nullable = false, length = 4)) })
	public FatProcedimentoHabilitacaoId getId() {
		return this.id;
	}

	public void setId(FatProcedimentoHabilitacaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_HABILITACAO", nullable = false, insertable = false, updatable = false)
	public FatHabilitacao getFatHabilitacao() {
		return this.fatHabilitacao;
	}

	public void setFatHabilitacao(FatHabilitacao fatHabilitacao) {
		this.fatHabilitacao = fatHabilitacao;
	}

	@Column(name = "COD_PROCEDIMENTO", length = 4)
	@Length(max = 4)
	public String getCodProcedimento() {
		return this.codProcedimento;
	}

	public void setCodProcedimento(String codProcedimento) {
		this.codProcedimento = codProcedimento;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatProcedimentoHabilitacao other = (FatProcedimentoHabilitacao) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {

		ID("id"),
		FAT_HABILITACAO("fatHabilitacao"),
		COD_PROCEDIMENTO("codProcedimento"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
