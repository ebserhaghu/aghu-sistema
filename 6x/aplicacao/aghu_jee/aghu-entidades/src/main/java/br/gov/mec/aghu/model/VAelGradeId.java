package br.gov.mec.aghu.model;

// Generated 15/03/2012 09:48:20 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAelGradeId generated by hbm2java
 */
@Embeddable
public class VAelGradeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1574963406041334651L;
	private Short grade;
	private Integer seqGrade;
	private DominioSituacao sitGrupoEx;
	

	public VAelGradeId() {
	}

	public VAelGradeId(Short grade, Integer seqGrade, 
			Integer matExame, Short unfExame,
			Integer matriculaSer, Short vinculoSer, Short salaSeq) {
		this.grade = grade;
		this.seqGrade = seqGrade;
	}

	
	@Column(name = "GRADE", precision = 4, scale = 0)
	public Short getGrade() {
		return this.grade;
	}

	public void setGrade(Short grade) {
		this.grade = grade;
	}

	@Column(name = "SEQ_GRADE", precision = 7, scale = 0)
	public Integer getSeqGrade() {
		return this.seqGrade;
	}

	public void setSeqGrade(Integer seqGrade) {
		this.seqGrade = seqGrade;
	}
	
	@Column(name = "SIT_GRUPO_EX", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSitGrupoEx() {
		return this.sitGrupoEx;
	}

	public void setSitGrupoEx(DominioSituacao sitGrupoEx) {
		this.sitGrupoEx = sitGrupoEx;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result
				+ ((seqGrade == null) ? 0 : seqGrade.hashCode());
		result = prime * result
				+ ((sitGrupoEx == null) ? 0 : sitGrupoEx.hashCode());
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
		if (getClass() != obj.getClass()){
			return false;
		}
		VAelGradeId other = (VAelGradeId) obj;
		if (grade == null) {
			if (other.grade != null){
				return false;
			}
		} else if (!grade.equals(other.grade)){
			return false;
		}
		if (seqGrade == null) {
			if (other.seqGrade != null){
				return false;
			}
		} else if (!seqGrade.equals(other.seqGrade)){
			return false;
		}
		if (sitGrupoEx != other.sitGrupoEx){
			return false;
		}
		return true;
	}


	
	
	

}
