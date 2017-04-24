package br.gov.mec.aghu.model;

// Generated 25/01/2012 15:31:21 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelGrpTecnicaCamposId generated by hbm2java
 */
@Embeddable
public class AelGrupoTecnicaCampoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 386050689470522190L;
	private Integer tceGrtSeq;
	private String tceUfeEmaExaSigla;
	private Integer tceUfeEmaManSeq;
	private Short tceUfeUnfSeq;
	private Integer calSeq;

	@Column(name = "TCE_GRT_SEQ", nullable = false)
	public Integer getTceGrtSeq() {
		return this.tceGrtSeq;
	}

	public void setTceGrtSeq(Integer tceGrtSeq) {
		this.tceGrtSeq = tceGrtSeq;
	}

	@Column(name = "TCE_UFE_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getTceUfeEmaExaSigla() {
		return this.tceUfeEmaExaSigla;
	}

	public void setTceUfeEmaExaSigla(String tceUfeEmaExaSigla) {
		this.tceUfeEmaExaSigla = tceUfeEmaExaSigla;
	}

	@Column(name = "TCE_UFE_EMA_MAN_SEQ", nullable = false)
	public Integer getTceUfeEmaManSeq() {
		return this.tceUfeEmaManSeq;
	}

	public void setTceUfeEmaManSeq(Integer tceUfeEmaManSeq) {
		this.tceUfeEmaManSeq = tceUfeEmaManSeq;
	}

	@Column(name = "TCE_UFE_UNF_SEQ", nullable = false)
	public Short getTceUfeUnfSeq() {
		return this.tceUfeUnfSeq;
	}

	public void setTceUfeUnfSeq(Short tceUfeUnfSeq) {
		this.tceUfeUnfSeq = tceUfeUnfSeq;
	}

	@Column(name = "CAL_SEQ", nullable = false)
	public Integer getCalSeq() {
		return this.calSeq;
	}

	public void setCalSeq(Integer calSeq) {
		this.calSeq = calSeq;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCalSeq());
		umHashCodeBuilder.append(this.getTceUfeEmaExaSigla());
		umHashCodeBuilder.append(this.getTceUfeEmaManSeq());
		umHashCodeBuilder.append(this.getTceUfeUnfSeq());
		umHashCodeBuilder.append(this.getTceGrtSeq());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AelGrupoTecnicaCampoId)) {
			return false;
		}
		AelGrupoTecnicaCampoId other = (AelGrupoTecnicaCampoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCalSeq(), other.getCalSeq());
		umEqualsBuilder.append(this.getTceUfeEmaExaSigla(), other.getTceUfeEmaExaSigla());
		umEqualsBuilder.append(this.getTceUfeEmaManSeq(), other.getTceUfeEmaManSeq());
		umEqualsBuilder.append(this.getTceUfeUnfSeq(), other.getTceUfeUnfSeq());
		umEqualsBuilder.append(this.getTceGrtSeq(), other.getTceGrtSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}