package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceItemDispMatOpId generated by hbm2java
 */
@Embeddable
public class SceItemDispMatOpId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2488435801945028575L;
	private Integer dmoSeq;
	private Short seq;

	public SceItemDispMatOpId() {
	}

	public SceItemDispMatOpId(Integer dmoSeq, Short seq) {
		this.dmoSeq = dmoSeq;
		this.seq = seq;
	}

	@Column(name = "DMO_SEQ", nullable = false)
	public Integer getDmoSeq() {
		return this.dmoSeq;
	}

	public void setDmoSeq(Integer dmoSeq) {
		this.dmoSeq = dmoSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getDmoSeq());
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
		if (!(obj instanceof SceItemDispMatOpId)) {
			return false;
		}
		SceItemDispMatOpId other = (SceItemDispMatOpId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getDmoSeq(), other.getDmoSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}