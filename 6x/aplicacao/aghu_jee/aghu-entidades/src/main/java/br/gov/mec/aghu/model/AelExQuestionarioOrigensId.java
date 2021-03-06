package br.gov.mec.aghu.model;

// Generated 20/06/2011 14:50:45 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.gov.mec.aghu.dominio.DominioOrigemQuestionario;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExQuestionarioOrigensId generated by hbm2java
 */
@Embeddable
public class AelExQuestionarioOrigensId implements EntityCompositeId {

	private static final long serialVersionUID = -6450123588895916418L;
	
	private String eqeEmaExaSigla;
	private Integer eqeEmaManSeq;
	private Integer eqeQtnSeq;
	private DominioOrigemQuestionario origemQuestionario;

	public AelExQuestionarioOrigensId() {
	}

	public AelExQuestionarioOrigensId(String eqeEmaExaSigla, Integer eqeEmaManSeq,
			Integer eqeQtnSeq, DominioOrigemQuestionario origemQuestionario) {
		this.eqeEmaExaSigla = eqeEmaExaSigla;
		this.eqeEmaManSeq = eqeEmaManSeq;
		this.eqeQtnSeq = eqeQtnSeq;
		this.origemQuestionario = origemQuestionario;
	}

	@Column(name = "EQE_EMA_EXA_SIGLA", nullable = false, length = 5)
	public String getEqeEmaExaSigla() {
		return this.eqeEmaExaSigla;
	}

	public void setEqeEmaExaSigla(String eqeEmaExaSigla) {
		this.eqeEmaExaSigla = eqeEmaExaSigla;
	}

	@Column(name = "EQE_EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEqeEmaManSeq() {
		return this.eqeEmaManSeq;
	}

	public void setEqeEmaManSeq(Integer eqeEmaManSeq) {
		this.eqeEmaManSeq = eqeEmaManSeq;
	}

	@Column(name = "EQE_QTN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEqeQtnSeq() {
		return this.eqeQtnSeq;
	}

	public void setEqeQtnSeq(Integer eqeQtnSeq) {
		this.eqeQtnSeq = eqeQtnSeq;
	}

	@Column(name = "ORIGEM_ATENDIMENTO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemQuestionario getOrigemQuestionario() {
		return origemQuestionario;
	}

	public void setOrigemQuestionario(DominioOrigemQuestionario origemQuestionario) {
		this.origemQuestionario = origemQuestionario;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelExQuestionarioOrigensId)) {
			return false;
		}
		AelExQuestionarioOrigensId castOther = (AelExQuestionarioOrigensId) other;

		return ((this.getEqeEmaExaSigla() == castOther.getEqeEmaExaSigla()) || (this
				.getEqeEmaExaSigla() != null
				&& castOther.getEqeEmaExaSigla() != null && this
				.getEqeEmaExaSigla().equals(castOther.getEqeEmaExaSigla())))
				&& (this.getEqeEmaManSeq() == castOther.getEqeEmaManSeq())
				&& (this.getEqeQtnSeq() == castOther.getEqeQtnSeq())
				&& ((this.getOrigemQuestionario() == castOther
						.getOrigemQuestionario()) || (this
						.getOrigemQuestionario() != null
						&& castOther.getOrigemQuestionario() != null && this
						.getOrigemQuestionario().equals(
								castOther.getOrigemQuestionario())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEqeEmaExaSigla() == null ? 0 : this.getEqeEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEqeEmaManSeq();
		result = 37 * result + this.getEqeQtnSeq();
		result = 37
				* result
				+ (getOrigemQuestionario() == null ? 0 : this
						.getOrigemQuestionario().hashCode());
		return result;
	}

}