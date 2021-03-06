package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * RapEscolaridade generated by hbm2java
 */
@Entity
@SequenceGenerator(name="rapEscSq1", sequenceName="AGH.RAP_ESC_SQ1", allocationSize = 1)
@Table(name = "RAP_ESCOLARIDADE", schema = "AGH")
public class RapEscolaridade extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1298018303829103028L;
	private Short seq;
	private Integer version;
	private String descricao;
	private String indSituacao;
	private Set<RapPerfil> rapPerfiles = new HashSet<RapPerfil>(0);
	private Set<RapEscolaridadeGi> rapEscolaridadeGis = new HashSet<RapEscolaridadeGi>(0);

	public RapEscolaridade() {
	}

	public RapEscolaridade(Short seq, String descricao) {
		this.seq = seq;
		this.descricao = descricao;
	}

	public RapEscolaridade(Short seq, String descricao, String indSituacao, Set<RapPerfil> rapPerfiles,
			Set<RapEscolaridadeGi> rapEscolaridadeGis) {
		this.seq = seq;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.rapPerfiles = rapPerfiles;
		this.rapEscolaridadeGis = rapEscolaridadeGis;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rapEscSq1")
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

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapEscolaridade")
	public Set<RapPerfil> getRapPerfiles() {
		return this.rapPerfiles;
	}

	public void setRapPerfiles(Set<RapPerfil> rapPerfiles) {
		this.rapPerfiles = rapPerfiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapEscolaridade")
	public Set<RapEscolaridadeGi> getRapEscolaridadeGis() {
		return this.rapEscolaridadeGis;
	}

	public void setRapEscolaridadeGis(Set<RapEscolaridadeGi> rapEscolaridadeGis) {
		this.rapEscolaridadeGis = rapEscolaridadeGis;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		RAP_PERFILES("rapPerfiles"),
		RAP_ESCOLARIDADE_GIS("rapEscolaridadeGis");

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
		if (!(obj instanceof RapEscolaridade)) {
			return false;
		}
		RapEscolaridade other = (RapEscolaridade) obj;
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
