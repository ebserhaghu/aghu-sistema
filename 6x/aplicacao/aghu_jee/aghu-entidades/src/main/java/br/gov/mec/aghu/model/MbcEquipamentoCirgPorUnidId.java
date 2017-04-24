package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcEquipamentoCirgPorUnidId generated by hbm2java
 */
@Embeddable
public class MbcEquipamentoCirgPorUnidId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7125382114970975485L;
	private Short euuSeq;
	private Short unfSeq;

	public MbcEquipamentoCirgPorUnidId() {
	}

	public MbcEquipamentoCirgPorUnidId(Short euuSeq, Short unfSeq) {
		this.euuSeq = euuSeq;
		this.unfSeq = unfSeq;
	}

	@Column(name = "EUU_SEQ", nullable = false)
	public Short getEuuSeq() {
		return this.euuSeq;
	}

	public void setEuuSeq(Short euuSeq) {
		this.euuSeq = euuSeq;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getEuuSeq());
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
		if (!(obj instanceof MbcEquipamentoCirgPorUnidId)) {
			return false;
		}
		MbcEquipamentoCirgPorUnidId other = (MbcEquipamentoCirgPorUnidId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getEuuSeq(), other.getEuuSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}