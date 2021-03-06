package br.gov.mec.aghu.model;

// Generated 15/03/2012 10:47:46 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;




import org.apache.commons.lang3.builder.EqualsBuilder;

import br.gov.mec.aghu.dominio.DominioDiaSemanaColetaExames;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelHorarioGradeExamesId generated by hbm2java
 */
@Embeddable
public class AelHorarioGradeExameId implements EntityCompositeId {

	private static final long serialVersionUID = -8776066522758178840L;
	private Short gaeUnfSeq;
	private Integer gaeSeqp;
	private DominioDiaSemanaColetaExames diaSemana;
	private Date horaInicio;

	@Column(name = "GAE_UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getGaeUnfSeq() {
		return this.gaeUnfSeq;
	}

	public void setGaeUnfSeq(Short gaeUnfSeq) {
		this.gaeUnfSeq = gaeUnfSeq;
	}

	@Column(name = "GAE_SEQP", nullable = false, precision = 7, scale = 0)
	public Integer getGaeSeqp() {
		return this.gaeSeqp;
	}

	public void setGaeSeqp(Integer gaeSeqp) {
		this.gaeSeqp = gaeSeqp;
	}

	@Column(name = "DIA_SEMANA", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public DominioDiaSemanaColetaExames getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(DominioDiaSemanaColetaExames diaSemana) {
		this.diaSemana = diaSemana;
	}

	@Column(name = "HORA_INICIO", nullable = false, length = 7)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		if(diaSemana == null){
			result = prime * result + 0;
		}else{
			result = prime * result + diaSemana.hashCode();
		}
		if(gaeSeqp == null){
			result = prime * result + 0;
		}else{
			result = prime * result + gaeSeqp.hashCode();
		}
		if(gaeUnfSeq == null){
			result = prime * result + 0;
		}else{
			result = prime * result + gaeUnfSeq.hashCode();
		}
		if(horaInicio == null){
			result = prime * result + 0;
		}else{
			result = prime * result + horaInicio.hashCode();
		}
		
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
		if (!(obj instanceof AelHorarioGradeExameId)){
			return false;
		}
		
		AelHorarioGradeExameId other = (AelHorarioGradeExameId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDiaSemana(), other.getDiaSemana());
		umEqualsBuilder.append(this.getGaeSeqp(), other.getGaeSeqp());
		umEqualsBuilder.append(this.getGaeUnfSeq(), other.getGaeUnfSeq());
		umEqualsBuilder.append(this.getHoraInicio(), other.getHoraInicio());
		
		return umEqualsBuilder.isEquals();
	}
	
}
