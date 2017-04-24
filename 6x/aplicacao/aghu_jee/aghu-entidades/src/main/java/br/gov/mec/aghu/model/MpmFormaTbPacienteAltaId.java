package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmFormaTbPacienteAltaId generated by hbm2java
 */
@Embeddable

public class MpmFormaTbPacienteAltaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2610786025723229379L;
	private Integer actAtdSeq;
	private Short ftbSeq;

	public MpmFormaTbPacienteAltaId() {
	}

	public MpmFormaTbPacienteAltaId(Integer actAtdSeq, Short ftbSeq) {
		this.actAtdSeq = actAtdSeq;
		this.ftbSeq = ftbSeq;
	}

	@Column(name = "ACT_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getActAtdSeq() {
		return this.actAtdSeq;
	}

	public void setActAtdSeq(Integer actAtdSeq) {
		this.actAtdSeq = actAtdSeq;
	}

	@Column(name = "FTB_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getFtbSeq() {
		return this.ftbSeq;
	}

	public void setFtbSeq(Short ftbSeq) {
		this.ftbSeq = ftbSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actAtdSeq == null) ? 0 : actAtdSeq.hashCode());
		result = prime * result + ((ftbSeq == null) ? 0 : ftbSeq.hashCode());
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
		MpmFormaTbPacienteAltaId other = (MpmFormaTbPacienteAltaId) obj;
		if (actAtdSeq == null) {
			if (other.actAtdSeq != null) {
				return false;
			}
		} else if (!actAtdSeq.equals(other.actAtdSeq)) {
			return false;
		}
		if (ftbSeq == null) {
			if (other.ftbSeq != null) {
				return false;
			}
		} else if (!ftbSeq.equals(other.ftbSeq)) {
			return false;
		}
		return true;
	}

	
}