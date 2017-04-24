package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamEmgDestXPerfilId generated by hbm2java
 */
@Embeddable
public class MamEmgDestXPerfilId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1396929193154378179L;
	private Short edeSeq;
	private String perNome;

	public MamEmgDestXPerfilId() {
	}

	public MamEmgDestXPerfilId(Short edeSeq, String perNome) {
		this.edeSeq = edeSeq;
		this.perNome = perNome;
	}

	@Column(name = "EDE_SEQ", nullable = false)
	public Short getEdeSeq() {
		return this.edeSeq;
	}

	public void setEdeSeq(Short edeSeq) {
		this.edeSeq = edeSeq;
	}

	@Column(name = "PER_NOME", nullable = false, length = 30)
	@Length(max = 30)
	public String getPerNome() {
		return this.perNome;
	}

	public void setPerNome(String perNome) {
		this.perNome = perNome;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPerNome());
		umHashCodeBuilder.append(this.getEdeSeq());
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
		if (!(obj instanceof MamEmgDestXPerfilId)) {
			return false;
		}
		MamEmgDestXPerfilId other = (MamEmgDestXPerfilId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPerNome(), other.getPerNome());
		umEqualsBuilder.append(this.getEdeSeq(), other.getEdeSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}