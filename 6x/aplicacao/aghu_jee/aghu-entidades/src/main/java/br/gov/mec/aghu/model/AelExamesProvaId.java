package br.gov.mec.aghu.model;

// Generated 30/03/2011 17:19:08 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExamesProvaId generated by hbm2java
 */

@Embeddable
public class AelExamesProvaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2188226068875962475L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private String emaExaSiglaEhProva;
	private Integer emaManSeqEhProva;

	public AelExamesProvaId() {
	}

	public AelExamesProvaId(String emaExaSigla, Integer emaManSeq,
			String emaExaSiglaEhProva, Integer emaManSeqEhProva) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.emaExaSiglaEhProva = emaExaSiglaEhProva;
		this.emaManSeqEhProva = emaManSeqEhProva;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "EMA_EXA_SIGLA_EH_PROVA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSiglaEhProva() {
		return this.emaExaSiglaEhProva;
	}

	public void setEmaExaSiglaEhProva(String emaExaSiglaEhProva) {
		this.emaExaSiglaEhProva = emaExaSiglaEhProva;
	}

	@Column(name = "EMA_MAN_SEQ_EH_PROVA", nullable = false)
	public Integer getEmaManSeqEhProva() {
		return this.emaManSeqEhProva;
	}

	public void setEmaManSeqEhProva(Integer emaManSeqEhProva) {
		this.emaManSeqEhProva = emaManSeqEhProva;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelExamesProvaId)) {
			return false;
		}
		AelExamesProvaId castOther = (AelExamesProvaId) other;

		return ((this.getEmaExaSigla().equals(castOther.getEmaExaSigla())) || (this
				.getEmaExaSigla() != null
				&& castOther.getEmaExaSigla() != null && this.getEmaExaSigla()
				.equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq().equals(castOther.getEmaManSeq()))
				&& ((this.getEmaExaSiglaEhProva().equals(castOther
						.getEmaExaSiglaEhProva())) || (this
						.getEmaExaSiglaEhProva() != null
						&& castOther.getEmaExaSiglaEhProva() != null && this
						.getEmaExaSiglaEhProva().equals(
								castOther.getEmaExaSiglaEhProva())))
				&& (this.getEmaManSeqEhProva().equals(castOther
						.getEmaManSeqEhProva()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		result = 37
				* result
				+ (getEmaExaSiglaEhProva() == null ? 0 : this
						.getEmaExaSiglaEhProva().hashCode());
		result = 37 * result + this.getEmaManSeqEhProva();
		return result;
	}

}
