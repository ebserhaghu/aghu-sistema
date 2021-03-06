package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceCancLiqdSiafiId generated by hbm2java
 */
@Embeddable
public class SceCancLiqdSiafiId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1074599661710625378L;
	private Integer nrsSeq;
	private Short seq;

	public SceCancLiqdSiafiId() {
	}

	public SceCancLiqdSiafiId(Integer nrsSeq, Short seq) {
		this.nrsSeq = nrsSeq;
		this.seq = seq;
	}

	@Column(name = "NRS_SEQ", nullable = false)
	public Integer getNrsSeq() {
		return this.nrsSeq;
	}

	public void setNrsSeq(Integer nrsSeq) {
		this.nrsSeq = nrsSeq;
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
		umHashCodeBuilder.append(this.getNrsSeq());
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
		if (!(obj instanceof SceCancLiqdSiafiId)) {
			return false;
		}
		SceCancLiqdSiafiId other = (SceCancLiqdSiafiId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getNrsSeq(), other.getNrsSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
