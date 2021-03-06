package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * McoPuerperioIntercorrenciaId generated by hbm2java
 */
@Embeddable
public class McoPuerperioIntercorrenciaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4750339272798820783L;
	private Integer pueGsoPacCodigo;
	private Short pueGsoSeqp;
	private Short seqp;

	public McoPuerperioIntercorrenciaId() {
	}

	public McoPuerperioIntercorrenciaId(Integer pueGsoPacCodigo, Short pueGsoSeqp, Short seqp) {
		this.pueGsoPacCodigo = pueGsoPacCodigo;
		this.pueGsoSeqp = pueGsoSeqp;
		this.seqp = seqp;
	}

	@Column(name = "PUE_GSO_PAC_CODIGO", nullable = false)
	public Integer getPueGsoPacCodigo() {
		return this.pueGsoPacCodigo;
	}

	public void setPueGsoPacCodigo(Integer pueGsoPacCodigo) {
		this.pueGsoPacCodigo = pueGsoPacCodigo;
	}

	@Column(name = "PUE_GSO_SEQP", nullable = false)
	public Short getPueGsoSeqp() {
		return this.pueGsoSeqp;
	}

	public void setPueGsoSeqp(Short pueGsoSeqp) {
		this.pueGsoSeqp = pueGsoSeqp;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getPueGsoPacCodigo());
		umHashCodeBuilder.append(this.getPueGsoSeqp());
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
		if (!(obj instanceof McoPuerperioIntercorrenciaId)) {
			return false;
		}
		McoPuerperioIntercorrenciaId other = (McoPuerperioIntercorrenciaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPueGsoPacCodigo(), other.getPueGsoPacCodigo());
		umEqualsBuilder.append(this.getPueGsoSeqp(), other.getPueGsoSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
