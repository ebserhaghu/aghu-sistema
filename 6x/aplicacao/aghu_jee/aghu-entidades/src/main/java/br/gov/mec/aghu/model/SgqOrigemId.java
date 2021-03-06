package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SgqOrigemId generated by hbm2java
 */
@Embeddable
public class SgqOrigemId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6472974962369210625L;
	private Integer qrySeq;
	private String sisSigla;

	public SgqOrigemId() {
	}

	public SgqOrigemId(Integer qrySeq, String sisSigla) {
		this.qrySeq = qrySeq;
		this.sisSigla = sisSigla;
	}

	@Column(name = "QRY_SEQ", nullable = false)
	public Integer getQrySeq() {
		return this.qrySeq;
	}

	public void setQrySeq(Integer qrySeq) {
		this.qrySeq = qrySeq;
	}

	@Column(name = "SIS_SIGLA", nullable = false, length = 3)
	@Length(max = 3)
	public String getSisSigla() {
		return this.sisSigla;
	}

	public void setSisSigla(String sisSigla) {
		this.sisSigla = sisSigla;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getQrySeq());
		umHashCodeBuilder.append(this.getSisSigla());
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
		if (!(obj instanceof SgqOrigemId)) {
			return false;
		}
		SgqOrigemId other = (SgqOrigemId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getQrySeq(), other.getQrySeq());
		umEqualsBuilder.append(this.getSisSigla(), other.getSisSigla());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
