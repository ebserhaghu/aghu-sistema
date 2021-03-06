package br.gov.mec.aghu.model;

// Generated 17/06/2010 15:43:38 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcSalaCirurgicasId generated by hbm2java
 */
@Embeddable

public class MbcSalaCirurgicaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2706076735723959982L;
	private Short unfSeq;
	private Short seqp;

	public MbcSalaCirurgicaId() {
	}

	public MbcSalaCirurgicaId(Short unfSeq, Short seqp) {
		this.unfSeq = unfSeq;
		this.seqp = seqp;
	}

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeqp() == null) ? 0 : getSeqp().hashCode());
		result = prime * result + ((getUnfSeq() == null) ? 0 : getUnfSeq().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}	
		if (obj == null){
			return false;
		}	
		if (!(obj instanceof MbcSalaCirurgicaId)){
			return false;
		}	
		MbcSalaCirurgicaId other = (MbcSalaCirurgicaId) obj;
		if (getSeqp() == null) {
			if (other.getSeqp() != null){
				return false;
			}				
		} else if (!getSeqp().equals(other.getSeqp())){
			return false;
		}	
		if (getUnfSeq() == null) {
			if (other.getUnfSeq() != null){
				return false;
			}	
		} else if (!getUnfSeq().equals(other.getUnfSeq())){
			return false;
		}	
		return true;
	}
}
