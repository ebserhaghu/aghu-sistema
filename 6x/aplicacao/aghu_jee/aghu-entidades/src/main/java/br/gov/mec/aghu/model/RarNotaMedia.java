package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RarNotaMedia generated by hbm2java
 */
@Entity
@Table(name = "RAR_NOTA_MEDIAS", schema = "AGH")
public class RarNotaMedia extends BaseEntityId<RarNotaMediaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4267466123951344622L;
	private RarNotaMediaId id;
	private Integer version;
	private RarPreceptorResidente rarPreceptorResidente;
	private String nota;
	private Date dtConclusao;

	public RarNotaMedia() {
	}

	public RarNotaMedia(RarNotaMediaId id, RarPreceptorResidente rarPreceptorResidente, String nota, Date dtConclusao) {
		this.id = id;
		this.rarPreceptorResidente = rarPreceptorResidente;
		this.nota = nota;
		this.dtConclusao = dtConclusao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "prrSeq", column = @Column(name = "PRR_SEQ", nullable = false)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", nullable = false, length = 2)) })
	public RarNotaMediaId getId() {
		return this.id;
	}

	public void setId(RarNotaMediaId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRR_SEQ", nullable = false, insertable = false, updatable = false)
	public RarPreceptorResidente getRarPreceptorResidente() {
		return this.rarPreceptorResidente;
	}

	public void setRarPreceptorResidente(RarPreceptorResidente rarPreceptorResidente) {
		this.rarPreceptorResidente = rarPreceptorResidente;
	}

	@Column(name = "NOTA", nullable = false, length = 2)
	@Length(max = 2)
	public String getNota() {
		return this.nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CONCLUSAO", nullable = false, length = 29)
	public Date getDtConclusao() {
		return this.dtConclusao;
	}

	public void setDtConclusao(Date dtConclusao) {
		this.dtConclusao = dtConclusao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAR_PRECEPTOR_RESIDENTES("rarPreceptorResidente"),
		NOTA("nota"),
		DT_CONCLUSAO("dtConclusao");

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
		if (!(obj instanceof RarNotaMedia)) {
			return false;
		}
		RarNotaMedia other = (RarNotaMedia) obj;
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