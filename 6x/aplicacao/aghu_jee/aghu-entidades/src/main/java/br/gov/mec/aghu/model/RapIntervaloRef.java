package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapIntervaloRef generated by hbm2java
 */
@Entity
@Table(name = "RAP_INTERVALOS_REF", schema = "AGH")
public class RapIntervaloRef extends BaseEntityId<RapIntervaloRefId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7953893367296078109L;
	private RapIntervaloRefId id;
	private Integer version;
	private String descricao;
	private Date dtInicio;
	private Date dtFim;

	public RapIntervaloRef() {
	}

	public RapIntervaloRef(RapIntervaloRefId id, String descricao, Date dtInicio) {
		this.id = id;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
	}

	public RapIntervaloRef(RapIntervaloRefId id, String descricao, Date dtInicio, Date dtFim) {
		this.id = id;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "horaInicio", column = @Column(name = "HORA_INICIO", nullable = false, length = 29)),
			@AttributeOverride(name = "horaTermino", column = @Column(name = "HORA_TERMINO", nullable = false, length = 29)),
			@AttributeOverride(name = "vd", column = @Column(name = "VD", nullable = false)) })
	public RapIntervaloRefId getId() {
		return this.id;
	}

	public void setId(RapIntervaloRefId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 40)
	@Length(max = 40)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		DESCRICAO("descricao"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof RapIntervaloRef)) {
			return false;
		}
		RapIntervaloRef other = (RapIntervaloRef) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}