package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatAutorizadosCma generated by hbm2java
 */
@Entity
@Table(name = "FAT_AUTORIZADOS_CMA", schema = "AGH")
public class FatAutorizadoCma extends BaseEntityId<FatAutorizadoCmaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4891599770564394561L;
	private FatAutorizadoCmaId id;
	private Date criadoEm;
	private String criadoPor;
	private Short qtdProc;

	public FatAutorizadoCma() {
	}

	public FatAutorizadoCma(FatAutorizadoCmaId id) {
		this.id = id;
	}

	public FatAutorizadoCma(FatAutorizadoCmaId id, Date criadoEm,
			String criadoPor, Short qtdProc) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
		this.qtdProc = qtdProc;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cthSeq", column = @Column(name = "CTH_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "codSusCma", column = @Column(name = "COD_SUS_CMA", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "competencia", column = @Column(name = "COMPETENCIA", nullable = false, precision = 6, scale = 0)) })
	public FatAutorizadoCmaId getId() {
		return this.id;
	}

	public void setId(FatAutorizadoCmaId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "CRIADO_POR", length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Column(name = "QTD_PROC", precision = 3, scale = 0)
	public Short getQtdProc() {
		return this.qtdProc;
	}

	public void setQtdProc(Short qtdProc) {
		this.qtdProc = qtdProc;
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
		FatAutorizadoCma other = (FatAutorizadoCma) obj;
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
		CTH_SEQ("id.cthSeq"),
		COD_SUS_CMA("id.codSusCma"),
		COMPETENCIA("id.competencia"),
		QTD_PROC("qtdProc")
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}	

}