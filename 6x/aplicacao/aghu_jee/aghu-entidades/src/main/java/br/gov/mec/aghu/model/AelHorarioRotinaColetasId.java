package br.gov.mec.aghu.model;

// Generated 25/04/2011 09:57:53 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.dominio.DominioDiaSemanaFeriado;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;
/**
 * AelHorarioRotinaColetasId generated by hbm2java
 */

@Embeddable
public class AelHorarioRotinaColetasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1765307200778723725L;
	private Short unfSeq;
	private AghUnidadesFuncionais unfSeqSolicitante;
	private DominioDiaSemanaFeriado dia;
	private Date horario;

	public AelHorarioRotinaColetasId() {
	}

	public AelHorarioRotinaColetasId(Short unfSeq, AghUnidadesFuncionais unfSeqSolicitante,
			DominioDiaSemanaFeriado dia, Date horario) {
		this.unfSeq = unfSeq;
		this.unfSeqSolicitante = unfSeqSolicitante;
		this.dia = dia;
		this.horario = horario;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@ManyToOne
	@JoinColumn(name = "UNF_SEQ_SOLICITANTE", nullable = false)
	public AghUnidadesFuncionais getUnfSeqSolicitante() {
		return this.unfSeqSolicitante;
	}

	public void setUnfSeqSolicitante(AghUnidadesFuncionais unfSeqSolicitante) {
		this.unfSeqSolicitante = unfSeqSolicitante;
	}
	
	
	@Transient
	public Long getHorarioTransformado(){
		return this.horario.getTime();
	}

	@Column(name = "DIA", nullable = false, length = 4)
	@Enumerated(EnumType.STRING)		
	public DominioDiaSemanaFeriado getDia() {
		return this.dia;
	}

	public void setDia(DominioDiaSemanaFeriado dia) {
		this.dia = dia;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORARIO", nullable = false, length = 29)
	public Date getHorario() {
		return this.horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeqSolicitante());
		umHashCodeBuilder.append(this.getHorarioTransformado());
		umHashCodeBuilder.append(this.getHorario());
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getDia());
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
		if (!(obj instanceof AelHorarioRotinaColetasId)) {
			return false;
		}
		AelHorarioRotinaColetasId other = (AelHorarioRotinaColetasId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeqSolicitante(), other.getUnfSeqSolicitante());
		umEqualsBuilder.append(this.getHorarioTransformado(), other.getHorarioTransformado());
		umEqualsBuilder.append(this.getHorario(), other.getHorario());
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getDia(), other.getDia());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}