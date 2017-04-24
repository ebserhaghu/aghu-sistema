package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelProjetoIntercProcId generated by hbm2java
 */
@Embeddable
public class AelProjetoIntercProcId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 647348953623125800L;
	private Integer ppjPjqSeq;
	private Integer ppjPacCodigo;
	private Integer pciSeq;
	private Short seqp;

	public AelProjetoIntercProcId() {
	}

	public AelProjetoIntercProcId(Integer ppjPjqSeq, Integer ppjPacCodigo, Integer pciSeq, Short seqp) {
		this.ppjPjqSeq = ppjPjqSeq;
		this.ppjPacCodigo = ppjPacCodigo;
		this.pciSeq = pciSeq;
		this.seqp = seqp;
	}

	@Column(name = "PPJ_PJQ_SEQ", nullable = false)
	public Integer getPpjPjqSeq() {
		return this.ppjPjqSeq;
	}

	public void setPpjPjqSeq(Integer ppjPjqSeq) {
		this.ppjPjqSeq = ppjPjqSeq;
	}

	@Column(name = "PPJ_PAC_CODIGO", nullable = false)
	public Integer getPpjPacCodigo() {
		return this.ppjPacCodigo;
	}

	public void setPpjPacCodigo(Integer ppjPacCodigo) {
		this.ppjPacCodigo = ppjPacCodigo;
	}

	@Column(name = "PCI_SEQ", nullable = false)
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
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
		umHashCodeBuilder.append(this.getPpjPacCodigo());
		umHashCodeBuilder.append(this.getPpjPjqSeq());
		umHashCodeBuilder.append(this.getPciSeq());
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
		if (!(obj instanceof AelProjetoIntercProcId)) {
			return false;
		}
		AelProjetoIntercProcId other = (AelProjetoIntercProcId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPpjPacCodigo(), other.getPpjPacCodigo());
		umEqualsBuilder.append(this.getPpjPjqSeq(), other.getPpjPjqSeq());
		umEqualsBuilder.append(this.getPciSeq(), other.getPciSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}