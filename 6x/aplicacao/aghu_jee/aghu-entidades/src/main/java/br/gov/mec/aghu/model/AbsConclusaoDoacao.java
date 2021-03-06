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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AbsConclusaoDoacao generated by hbm2java
 */
@Entity
@Table(name = "ABS_CONCLUSOES_DOACOES", schema = "AGH")
public class AbsConclusaoDoacao extends BaseEntityId<AbsConclusaoDoacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7030618058905228651L;
	private AbsConclusaoDoacaoId id;
	private Integer version;
	private RapServidores rapServidores;
	private AbsTipoConclusao absTipoConclusao;
	private AbsDoacoes absDoacoes;
	private Date dtConclusao;
	private String indSituacao;
	private Date criadoEm;

	public AbsConclusaoDoacao() {
	}

	public AbsConclusaoDoacao(AbsConclusaoDoacaoId id, RapServidores rapServidores, AbsTipoConclusao absTipoConclusao,
			AbsDoacoes absDoacoes, Date dtConclusao, String indSituacao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.absTipoConclusao = absTipoConclusao;
		this.absDoacoes = absDoacoes;
		this.dtConclusao = dtConclusao;
		this.indSituacao = indSituacao;
	}

	public AbsConclusaoDoacao(AbsConclusaoDoacaoId id, RapServidores rapServidores, AbsTipoConclusao absTipoConclusao,
			AbsDoacoes absDoacoes, Date dtConclusao, String indSituacao, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.absTipoConclusao = absTipoConclusao;
		this.absDoacoes = absDoacoes;
		this.dtConclusao = dtConclusao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "dcaBolNumero", column = @Column(name = "DCA_BOL_NUMERO", nullable = false)),
			@AttributeOverride(name = "dcaBolBsaCodigo", column = @Column(name = "DCA_BOL_BSA_CODIGO", nullable = false)),
			@AttributeOverride(name = "dcaBolData", column = @Column(name = "DCA_BOL_DATA", nullable = false, length = 29)),
			@AttributeOverride(name = "sequencia", column = @Column(name = "SEQUENCIA", nullable = false)) })
	public AbsConclusaoDoacaoId getId() {
		return this.id;
	}

	public void setId(AbsConclusaoDoacaoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TCO_CODIGO", nullable = false)
	public AbsTipoConclusao getAbsTipoConclusao() {
		return this.absTipoConclusao;
	}

	public void setAbsTipoConclusao(AbsTipoConclusao absTipoConclusao) {
		this.absTipoConclusao = absTipoConclusao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DCA_BOL_NUMERO", referencedColumnName = "BOL_NUMERO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "DCA_BOL_BSA_CODIGO", referencedColumnName = "BOL_BSA_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "DCA_BOL_DATA", referencedColumnName = "BOL_DATA", nullable = false, insertable = false, updatable = false) })
	public AbsDoacoes getAbsDoacoes() {
		return this.absDoacoes;
	}

	public void setAbsDoacoes(AbsDoacoes absDoacoes) {
		this.absDoacoes = absDoacoes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CONCLUSAO", nullable = false, length = 29)
	public Date getDtConclusao() {
		return this.dtConclusao;
	}

	public void setDtConclusao(Date dtConclusao) {
		this.dtConclusao = dtConclusao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		ABS_TIPOS_CONCLUSOES("absTipoConclusao"),
		ABS_DOACOES("absDoacoes"),
		DT_CONCLUSAO("dtConclusao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof AbsConclusaoDoacao)) {
			return false;
		}
		AbsConclusaoDoacao other = (AbsConclusaoDoacao) obj;
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
