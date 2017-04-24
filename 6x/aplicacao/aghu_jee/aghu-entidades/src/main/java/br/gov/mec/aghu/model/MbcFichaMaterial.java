package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaMaterial generated by hbm2java
 */
@Entity
@Table(name = "MBC_FICHA_MATERIAIS", schema = "AGH")
public class MbcFichaMaterial extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6903462560232088821L;
	private Integer seq;
	private Integer version;
	private MbcFichaAnestesias mbcFichaAnestesias;
	private RapServidores rapServidores;
	private ScoMaterial scoMaterial;
	private Boolean materialNeuroEixo;
	private Boolean materialViaAerea;
	private Date criadoEm;
	private Short quantidade;

	public MbcFichaMaterial() {
	}

	public MbcFichaMaterial(Integer seq, MbcFichaAnestesias mbcFichaAnestesias, RapServidores rapServidores, ScoMaterial scoMaterial,
			Boolean materialNeuroEixo, Boolean materialViaAerea, Date criadoEm, Short quantidade) {
		this.seq = seq;
		this.mbcFichaAnestesias = mbcFichaAnestesias;
		this.rapServidores = rapServidores;
		this.scoMaterial = scoMaterial;
		this.materialNeuroEixo = materialNeuroEixo;
		this.materialViaAerea = materialViaAerea;
		this.criadoEm = criadoEm;
		this.quantidade = quantidade;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FIC_SEQ", nullable = false)
	public MbcFichaAnestesias getMbcFichaAnestesias() {
		return this.mbcFichaAnestesias;
	}

	public void setMbcFichaAnestesias(MbcFichaAnestesias mbcFichaAnestesias) {
		this.mbcFichaAnestesias = mbcFichaAnestesias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO", nullable = false)
	public ScoMaterial getScoMaterial() {
		return this.scoMaterial;
	}

	public void setScoMaterial(ScoMaterial scoMaterial) {
		this.scoMaterial = scoMaterial;
	}

	@Column(name = "MATERIAL_NEURO_EIXO", nullable = false, length = 1)
	@Length(max = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getMaterialNeuroEixo() {
		return this.materialNeuroEixo;
	}

	public void setMaterialNeuroEixo(Boolean materialNeuroEixo) {
		this.materialNeuroEixo = materialNeuroEixo;
	}

	@Column(name = "MATERIAL_VIA_AEREA", nullable = false, length = 1)
	@Length(max = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getMaterialViaAerea() {
		return this.materialViaAerea;
	}

	public void setMaterialViaAerea(Boolean materialViaAerea) {
		this.materialViaAerea = materialViaAerea;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "QUANTIDADE", nullable = false)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MBC_FICHA_ANESTESIAS("mbcFichaAnestesias"),
		RAP_SERVIDORES("rapServidores"),
		SCO_MATERIAL("scoMaterial"),
		MATERIAL_NEURO_EIXO("materialNeuroEixo"),
		MATERIAL_VIA_AEREA("materialViaAerea"),
		CRIADO_EM("criadoEm"),
		QUANTIDADE("quantidade");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MbcFichaMaterial)) {
			return false;
		}
		MbcFichaMaterial other = (MbcFichaMaterial) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}