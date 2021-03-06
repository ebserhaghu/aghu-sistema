package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghCaracteristica generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aghCrctSq1", sequenceName="AGH.AGH_CRCT_SQ1", allocationSize = 1)
@Table(name = "AGH_CARACTERISTICAS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "caracteristica"))
public class AghCaracteristica extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6525200670354451475L;
	private Short seq;
	private Integer version;
	private String caracteristica;
	private String descricao;
	private Date criadoEm;
	private String criadoPor;
	private Date alteradoEm;
	private String alteradoPor;
	private Set<AghCaractModulo> aghCaractModuloes = new HashSet<AghCaractModulo>(0);

	public AghCaracteristica() {
	}

	public AghCaracteristica(Short seq, String caracteristica, Date criadoEm, String criadoPor) {
		this.seq = seq;
		this.caracteristica = caracteristica;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
	}

	public AghCaracteristica(Short seq, String caracteristica, String descricao, Date criadoEm, String criadoPor, Date alteradoEm,
			String alteradoPor, Set<AghCaractModulo> aghCaractModuloes) {
		this.seq = seq;
		this.caracteristica = caracteristica;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
		this.alteradoEm = alteradoEm;
		this.alteradoPor = alteradoPor;
		this.aghCaractModuloes = aghCaractModuloes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghCrctSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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

	@Column(name = "CARACTERISTICA", unique = true, nullable = false, length = 240)
	@Length(max = 240)
	public String getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Column(name = "DESCRICAO", length = 300)
	@Length(max = 300)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "ALTERADO_POR", length = 30)
	@Length(max = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghCaracteristica")
	public Set<AghCaractModulo> getAghCaractModuloes() {
		return this.aghCaractModuloes;
	}

	public void setAghCaractModuloes(Set<AghCaractModulo> aghCaractModuloes) {
		this.aghCaractModuloes = aghCaractModuloes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		CARACTERISTICA("caracteristica"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		CRIADO_POR("criadoPor"),
		ALTERADO_EM("alteradoEm"),
		ALTERADO_POR("alteradoPor"),
		AGH_CARACT_MODULOES("aghCaractModuloes");

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
		if (!(obj instanceof AghCaracteristica)) {
			return false;
		}
		AghCaracteristica other = (AghCaracteristica) obj;
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
