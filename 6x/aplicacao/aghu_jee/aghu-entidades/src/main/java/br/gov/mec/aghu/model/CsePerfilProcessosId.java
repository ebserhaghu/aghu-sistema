package br.gov.mec.aghu.model;

// Generated 15/06/2011 21:07:17 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CsePerfilProcessosId generated by hbm2java
 */
@Embeddable
public class CsePerfilProcessosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1367220363113045495L;
	private Short rocSeq;
	private String perNome;

	public CsePerfilProcessosId() {
	}

	public CsePerfilProcessosId(Short rocSeq, String perNome) {
		this.rocSeq = rocSeq;
		this.perNome = perNome;
	}

	@Column(name = "ROC_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getRocSeq() {
		return this.rocSeq;
	}

	public void setRocSeq(Short rocSeq) {
		this.rocSeq = rocSeq;
	}

	@Column(name = "PER_NOME", nullable = false, length = 30)
	@Length(max = 30)
	public String getPerNome() {
		return this.perNome;
	}

	public void setPerNome(String perNome) {
		this.perNome = perNome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perNome == null) ? 0 : perNome.hashCode());
		result = prime * result + ((rocSeq == null) ? 0 : rocSeq.hashCode());
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
		CsePerfilProcessosId other = (CsePerfilProcessosId) obj;
		if (perNome == null) {
			if (other.perNome != null) {
				return false;
			}
		} else if (!perNome.equals(other.perNome)) {
			return false;
		}
		if (rocSeq == null) {
			if (other.rocSeq != null) {
				return false;
			}
		} else if (!rocSeq.equals(other.rocSeq)) {
			return false;
		}
		return true;
	}


}
